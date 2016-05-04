package kr.co.bit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.bit.dao.BoardDAO;
import kr.co.bit.vo.BoardVO;

public class ListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request
			, HttpServletResponse response) throws Exception {
		
		// DB접속하여 게시판목록데이터를 조회
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.selectBoardList();
		
		// 조회한 게시판목록데이터를 공유영역에 등록
//		request.setAttribute("list", list);
		
		// jsp에게 화면단에 출력요청
		return "/board/list.jsp";
	}
}
