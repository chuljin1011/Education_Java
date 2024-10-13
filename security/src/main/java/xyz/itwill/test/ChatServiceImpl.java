package xyz.itwill.test;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {
	private final ChatDAO chatDAO;

	@Override
	public void addChat(Chat chat) {
		chatDAO.insertChat(chat);
		
	}

	@Override
	public void removeChat(int roomNo) {
		chatDAO.deleteChat(roomNo);
		
	}

	@Override
	public List<Chat> getChatList(int roomNo) {
		List<Chat> chatList = chatDAO.selectChatList(roomNo);
		return chatList;
	}
	

}
