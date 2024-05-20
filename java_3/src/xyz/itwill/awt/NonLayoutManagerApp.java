package xyz.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class NonLayoutManagerApp extends Frame {

	private static final long serialVersionUID = 1L;
	
	public NonLayoutManagerApp(String title) {
		super(title);
		
		setLayout(null);
		
		Button button1 = new Button("Button-1");
		Button button2 = new Button("Button-2");
		
		add(button1);
		add(button2);
		
		button1.setBounds(80, 100, 150, 80);
		button2.setBounds(190, 300, 100, 120);
		
		
		setBounds(600, 100, 400, 500);
		setVisible(true);
		
	
	}
	
	
	public static void main(String[] args) {
		new NonLayoutManagerApp("배치관리자 미사용 프레임");
	}
	

}
