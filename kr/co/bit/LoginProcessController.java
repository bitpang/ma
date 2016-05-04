package kr.co.bit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.bit.login.db.LoginDAO;
import kr.co.bit.login.db.LoginVO;

public class LoginProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		request.setCharacterEncoding("utf-8");
		
		// 1�ܰ� : ����� �Ķ���� ������(ID, PASSWORD)
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2�ܰ� : VO��ü�� �Ķ���� �ʱ�ȭ
		LoginVO loginVO = new LoginVO();
		loginVO.setId(id);
		loginVO.setPassword(password);
		
		// 3�ܰ� : DB���� �α��� ����
		LoginDAO dao = new LoginDAO();
		LoginVO userVO = dao.login(loginVO);
		
		// 4�ܰ� : ���������� �α��� ��� ���
		
		String msg = "";
		String url = "";
		
		if(userVO == null) {
			msg = "ID �Ǵ� PASSWORD�� �߸��Է��ϼ̽��ϴ�.";
			url = request.getContextPath() + "/login.do";
		} else {
			switch(userVO.getType()) {
			case "S" :
				msg = "�����ڴ� ȯ���մϴ�.";
				break;
			case "U" : 
				msg = userVO.getId() + "�� ȯ���մϴ�.";
				break;
			}
			url = request.getContextPath();
			// userVO ��ü�� session������ ���
			HttpSession session = request.getSession();
			session.setAttribute("userVO", userVO);
		}
			
			
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		return "/login/loginProcess.jsp";
	}

	
}
