package kr.co.bit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontControllerServlet extends HttpServlet {
	
	private HandlerMapping mappings = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		String configName = config.getInitParameter("configName");
		
		if(configName == null)
			configName = "D:/Lecture/web-workspace/MissionMVC-Web/bean.properties";
		mappings = new HandlerMapping(configName);
		
//		if(configName != null)
//		mappings = new HandlerMapping(configName);
//		else
//			mappings = new HandlerMapping();
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) 
				throws IOException, ServletException {
		
		System.out.println("���� ȣ��...");
		
		String contextPath = request.getContextPath();
		
		String uri = request.getRequestURI();
		uri = uri.substring(contextPath.length());
		
		try {
			
			Controller control = mappings.getController(uri);
			
			String callPage = control.handleRequest(request, response);
			
			// �ش� jsp���� ȭ�������Ͽ� Ŭ���̾�Ʈ���� ����
			RequestDispatcher dispatcher = request.getRequestDispatcher(callPage);
			dispatcher.forward(request, response);
			
			
//			response.sendRedirect(contextPath + callPage);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
	}
	
/*	
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		System.out.println("���� ȣ��...");
		
		String contextPath = request.getContextPath();
		
		String uri = request.getRequestURI();
		uri = uri.substring(contextPath.length());

		try {
			
			Controller control = null;
			String callPage = "";

			switch (uri) {
			case "/list.do":
				System.out.println("�����ȸ");
				control = new ListController();
				break;
			case "/write.do":
				System.out.println("���� ���");
				control = new WriteFormController();
				break;
			}
			
			callPage = control.handleRequest(request, response);
			
			// �ش� jsp���� ȭ�������Ͽ� Ŭ���̾�Ʈ���� ����
			RequestDispatcher dispatcher = request.getRequestDispatcher(callPage);
			dispatcher.forward(request, response);

			// response.sendRedirect(contextPath + callPage);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
*/		
	
}







