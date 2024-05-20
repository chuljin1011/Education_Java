package xyz.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventSourceGetApp extends Frame {
	private static final long serialVersionUID = 1L;

	private Canvas canvas;
	private Button red, green, blue, white;

	public EventSourceGetApp(String title) {
		super(title);

		setBounds(800, 200, 400, 500);
		setVisible(true);

		red = new Button("RED");
		green = new Button("GREEN");
		blue = new Button("BLUE");
		white = new Button("WHITE");

		Panel panel = new Panel();

		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(white);

		canvas = new Canvas();

		add(panel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);

		red.addActionListener(new ColorButtonEventHandle());
		green.addActionListener(new ColorButtonEventHandle());
		blue.addActionListener(new ColorButtonEventHandle());
		white.addActionListener(new ColorButtonEventHandle());

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}

	public static void main(String[] args) {
		new EventSourceGetApp("이벤트 처리");
	}


	public class ColorButtonEventHandle implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSource = e.getSource();

			if (eventSource == red) {
				canvas.setBackground(Color.RED);
			} else if (eventSource == blue) {
				canvas.setBackground(Color.BLUE);
			} else if (eventSource == green) {
				canvas.setBackground(Color.GREEN);
			} else if (eventSource == white) {
				canvas.setBackground(Color.WHITE);
			}
		}
	}

}
