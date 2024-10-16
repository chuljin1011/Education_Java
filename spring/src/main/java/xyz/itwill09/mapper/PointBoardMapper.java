package xyz.itwill09.mapper;

import java.util.List;

import xyz.itwill09.dto.PointBoard;

public interface PointBoardMapper {
	int insertPointBoard(PointBoard board);
	int deletePointBoard(int num);
	PointBoard selectPointBoard(int num);
	List<PointBoard> selectPointBoardList();
}