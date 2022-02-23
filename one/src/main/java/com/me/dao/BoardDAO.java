package com.me.dao;

import java.util.List;

import com.me.domain.BoardVO;

public interface BoardDAO {

	// 게시글 목록
	public List<BoardVO> list() throws Exception;
	
	// 게시글 작성
	public void write(BoardVO vo) throws Exception;
	
	// 게시물 조회
	public BoardVO view(int bno) throws Exception;
}
