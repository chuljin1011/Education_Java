package xyz.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class CompnentAddApp extends Frame {
	private static final long serialVersionUID = 1L;

	public CompnentAddApp(String title) {
		super(title);

		Button button = new Button("Button");

		add(button);

		setBounds(600, 100, 300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CompnentAddApp("컴포넌트 배치");
	}

}
