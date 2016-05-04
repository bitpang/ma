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
		
		// DB�����Ͽ� �Խ��Ǹ�ϵ����͸� ��ȸ
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.selectBoardList();
		
		// ��ȸ�� �Խ��Ǹ�ϵ����͸� ���������� ���
//		request.setAttribute("list", list);
		
		// jsp���� ȭ��ܿ� ��¿�û
		return "/board/list.jsp";
	}
}
