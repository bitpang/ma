package kr.co.bit.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.bit.vo.BoardVO;

public class BoardDAO {

	public List<BoardVO> selectBoardList() {
		
		List<BoardVO> list = new ArrayList<>();
		
		list.add(new BoardVO("aaa", "bbb"));
		list.add(new BoardVO("ccc", "ddd"));
		list.add(new BoardVO("eee", "fff"));
		
		return list;
	}
}
