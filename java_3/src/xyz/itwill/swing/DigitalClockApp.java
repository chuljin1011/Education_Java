package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalClockApp extends JFrame {
	private static final long serialVersionUID = 1L;

	JLabel clockLabel;
	JButton startButton, stopButton;

	private boolean isRun;

	public DigitalClockApp(String title) {
		super(title);

		isRun = true;

//		Date date = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
//		String printDate = dateFormat.format(date);

//		clockLabel = new JLabel("2024년 05월 17일 16시 55분 20초", JLabel.CENTER);
		clockLabel = new JLabel("", JLabel.CENTER);
		clockLabel.setFont(new Font("굴림체", Font.BOLD, 30));

		startButton = new JButton("다시 실행");
		stopButton = new JButton("일시 중지");

		startButton.setFont(new Font("굴림체", Font.BOLD, 20));
		stopButton.setFont(new Font("굴림체", Font.BOLD, 20));

		startButton.setEnabled(false);

		JPanel panel = new JPanel();
		panel.add(startButton);
		panel.add(stopButton);

//		new ClockThread().start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");

				while (true) {
					if (isRun) {
//						Date date = new Date();
//						String printDate = dateFormat.format(date);
						clockLabel.setText(dateFormat.format(new Date()));
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();

					}
				}
			}

		}).start();

		getContentPane().add(clockLabel, BorderLayout.CENTER);
		getContentPane().add(panel, BorderLayout.SOUTH);

		startButton.addActionListener(new ClockButtonEventHandle());
		stopButton.addActionListener(new ClockButtonEventHandle());

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, 600, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DigitalClockApp("디지털 시계");
	}

//	public class ClockThread extends Thread {
//
//		@Override
//		public void run() {
//			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
//
//			while (true) {
//				Date date = new Date();
//				String printDate = dateFormat.format(date);
//				clockLabel.setText(printDate);
//
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		}
//	}

	public class ClockButtonEventHandle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSouce = e.getSource();

			if (eventSouce == startButton) {
				startButton.setEnabled(false);
				stopButton.setEnabled(true);

				isRun = true;

			} else if (eventSouce == stopButton) {
				isRun = false;
				startButton.setEnabled(true);
				stopButton.setEnabled(false);

				isRun = false;
			}

		}
	}

}
