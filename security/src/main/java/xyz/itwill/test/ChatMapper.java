package xyz.itwill.test;

import java.util.List;

public interface ChatMapper {
	int insertChat(Chat chat);
	int deleteChat(int roomNo);
	List<Chat> selectChatList(int roomNo);
}
