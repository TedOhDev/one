package com.me.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.me.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	
	
	// SQL구문이 저장되어있는 mapper의 위치정보(namespace)
	private static String namespace = "com.one.mappers.board";
	
	
	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {


		return sql.selectList(namespace + ".list");
	}

	// 게시글 작성
	
	@Override
	public void write(BoardVO vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);
		
	}

	// 게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		
		return sql.selectOne(namespace + ".view", bno);
	}

}
