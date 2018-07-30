package com.inc.pollcash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inc.pollcash.domain.Board;
import com.inc.pollcash.repository.BoardDao;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardDao;
	@Override
	public List<Board> list() {
		return boardDao.list();
	}
	@Override
	public Board selectOne(int id) {
		return boardDao.selectOne(id);
	}
	@Override
	public void plusHit(int id) {
		boardDao.plusHit();
	}
}
