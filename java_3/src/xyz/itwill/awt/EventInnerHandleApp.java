package xyz.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventInnerHandleApp extends Frame {
	private static final long serialVersionUID = 1L;

	public EventInnerHandleApp(String title) {
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

	public class ButtonEventHandle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
			
		}
	
	}

}
