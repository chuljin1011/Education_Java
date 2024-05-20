package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextArea textArea;
	private JTextField textField;

	public SwingApp(String title) {
		super(title);

		textArea = new JTextArea("[정철진]님이 입장하엿습니다.\n");
		textField = new JTextField();

		textArea.setFont(new Font("굴림체", Font.BOLD, 20));

		textArea.setBackground(Color.PINK);
		textArea.setFocusable(false);

		Container container = getContentPane();
		
		JScrollPane ScrollPane = new JScrollPane(textArea);

		container.add(ScrollPane, BorderLayout.CENTER);
		container.add(textField, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		textField.addActionListener(new TextComponentEventHandle());

		setBounds(800, 200, 400, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SwingApp("Swing");
	}

	public class TextComponentEventHandle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String text = textField.getText();

			if (!text.equals("")) {

				textArea.append("[정철진]" + text + "\n");
				
				textArea.setCaretPosition(textArea.getText().length());
				
				textField.setText("");

			}

		}

	}

}
