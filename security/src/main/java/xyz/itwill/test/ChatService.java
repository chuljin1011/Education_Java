package xyz.itwill.test;

import java.util.List;

public interface ChatService {
	void addChat(Chat chat);
	void removeChat(int roomNo);
	List<Chat> getChatList(int roomNo);

}
