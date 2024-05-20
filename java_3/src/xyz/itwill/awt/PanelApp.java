package xyz.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelApp extends Frame {
	private static final long serialVersionUID = 1L;

	public PanelApp(String title) {
		super(title);

		Button red = new Button("RED");
		Button green = new Button("GREEN");
		Button blue = new Button("BLUE");
		
		Panel panel = new Panel();
		
		panel.add(red);
		panel.add(green);
		panel.add(blue);

		TextArea textArea = new TextArea();

		TextField textField = new TextField();
		
		add(panel, BorderLayout.NORTH);
//		add(green, BorderLayout.NORTH);
//		add(blue, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		add(textField, BorderLayout.SOUTH);
		
//		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 16);
//		panel.setFont(font);
		panel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
		
		red.setForeground(new Color(255, 0, 0));
		green.setForeground(new Color(0, 255, 0));
		blue.setForeground(new Color(0, 0, 255));
		
		textArea.setBackground(Color.blue);
		
		red.setEnabled(false);
		
		textArea.setFocusable(false);
		
		
		setBounds(600, 100, 400, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new PanelApp("Panel");
	}

}
