package xyz.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutApp extends Frame {
	private static final long serialVersionUID = 1L;

	public FlowLayoutApp(String title) {
		super(title);

		setLayout(new FlowLayout());

		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		Button button5 = new Button("button5");
		Button button6 = new Button("button5");
		Button button7 = new Button("button5");
		Button button8 = new Button("button5");
		Button button9 = new Button("button5");
		Button button10 = new Button("button5");

		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button10);

		setBounds(600, 100, 500, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutApp("FlowLayout");

	}

}
