package xyz.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//컴퍼넌트(컨테이너)에서는 다양한 이벤트가 발생될 수 있으며 컴퍼넌트에서 발생 시 원하는 명령이 실행되도록
//프로그램을 작성 필요.

public class EventHandleApp extends Frame {
	private static final long serialVersionUID = 1L;

	public EventHandleApp(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		Button exit = new Button("Exit");
		exit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		add(exit);
		
		exit.addActionListener(new ButtonEventHandle());
		
		
		setBounds(800, 200, 300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventHandleApp("이벤트 처리");
	}

}

class ButtonEventHandle implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
		
	}
	
	
}


































