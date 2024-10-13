package xyz.itwill.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ChatDAOImpl implements ChatDAO {
	private final SqlSession sqlSession;

	@Override
	public int insertChat(Chat chat) {
		return sqlSession.getMapper(ChatMapper.class).insertChat(chat);
	}

	@Override
	public int deleteChat(int roomNo) {
		return sqlSession.getMapper(ChatMapper.class).deleteChat(roomNo);
	}

	@Override
	public List<Chat> selectChatList(int roomNo) {
		return sqlSession.getMapper(ChatMapper.class).selectChatList(roomNo);
	}
	
}
