package xyz.itwill.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class ChatController {
	private final ChatService chatService;
	
	@RequestMapping("")
	public String home() {
		return "test/home";
	}
	
	@RequestMapping("room")
	public String chatRoom() {
		return "test/chatRoom";
	}
}
