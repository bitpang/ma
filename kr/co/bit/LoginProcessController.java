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
		
		// 1단계 : 날라온 파라미터 얻어오기(ID, PASSWORD)
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2단계 : VO객체에 파라미터 초기화
		LoginVO loginVO = new LoginVO();
		loginVO.setId(id);
		loginVO.setPassword(password);
		
		// 3단계 : DB에서 로그인 수행
		LoginDAO dao = new LoginDAO();
		LoginVO userVO = dao.login(loginVO);
		
		// 4단계 : 공유영역에 로그인 결과 등록
		
		String msg = "";
		String url = "";
		
		if(userVO == null) {
			msg = "ID 또는 PASSWORD를 잘못입력하셨습니다.";
			url = request.getContextPath() + "/login.do";
		} else {
			switch(userVO.getType()) {
			case "S" :
				msg = "관리자님 환영합니다.";
				break;
			case "U" : 
				msg = userVO.getId() + "님 환영합니다.";
				break;
			}
			url = request.getContextPath();
			// userVO 객체를 session영역에 등록
			HttpSession session = request.getSession();
			session.setAttribute("userVO", userVO);
		}
			
			
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		
		return "/login/loginProcess.jsp";
	}

	
}
