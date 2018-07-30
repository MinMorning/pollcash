package com.inc.pollcash.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inc.pollcash.domain.Board;

@Repository
public class BoardDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Board> list() {
		return sqlSession.selectList("board.list");
	}

	public Board selectOne(int id) {
		return sqlSession.selectOne("board.selectOne",id);
	}

	public void plusHit() {
		
	}


}
