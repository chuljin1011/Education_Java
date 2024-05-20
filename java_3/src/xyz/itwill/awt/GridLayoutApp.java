package xyz.itwill.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutApp extends Frame {
	private static final long serialVersionUID = 1L;

	public GridLayoutApp(String title) {
		super(title);
		
		setLayout(new GridLayout(3, 2, 5, 5));
		
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		Button button5 = new Button("button5");
		Button button6 = new Button("button6");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);		
		
		setBounds(600, 100, 300, 400);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new GridLayoutApp("Grid ");
	}

}
