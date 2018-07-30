package com.inc.pollcash.service;

import java.util.List;

import com.inc.pollcash.domain.Board;

public interface BoardService {

	public List<Board> list();

	public Board selectOne(int id);

	public void plusHit(int id);
}
