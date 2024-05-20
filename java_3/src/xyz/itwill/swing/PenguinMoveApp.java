package xyz.itwill.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PenguinMoveApp extends JFrame {
	private static final long serialVersionUID = 1L;

	// 프레임의 폭과 높이
	private static final int JFRAME_WIDTH = 646;
	private static final int JFRAME_HEIGHT = 646;

	private static final int PENGUIN_SIZE = 50;

	private Image backImage;

	private Image[] penguins;

	private int penguinNo;

	private int penguinX, penguinY;

	public PenguinMoveApp(String title) {
		super(title);

		backImage = new ImageIcon(getClass().getResource("/images/back.jpg")).getImage();
		penguins = new Image[3];

		System.out.println(penguinNo);
		for (int i = 0; i < penguins.length; i++) {
			penguins[i] = new ImageIcon(getClass().getResource("/images/penguin" + (i + 1) + ".gif")).getImage();
		}

//		penguinNo = 0;

		penguinX = JFRAME_WIDTH / 2 - PENGUIN_SIZE / 2;
		penguinY = JFRAME_HEIGHT - PENGUIN_SIZE;

		// 프레임에서 키보드 관련 이벤트 발생시
		addKeyListener(new KeyAdapter() {

			// 키보드 버튼을 누르고 있는 경우
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();

				switch (keyCode) {

				case KeyEvent.VK_LEFT:
					penguinX -= 10;

					if (penguinX <= 0) {
						penguinX = 0;
					}

					penguinNo++;
					penguinNo %= 3;

					repaint();
					break;
				case KeyEvent.VK_RIGHT:
					penguinX += 10;
					
					if (penguinX >= JFRAME_WIDTH-PENGUIN_SIZE) {
						penguinX = JFRAME_WIDTH-PENGUIN_SIZE;
					}
					
					penguinNo++;
					penguinNo %= 3;

					repaint();
					break;
				case KeyEvent.VK_UP:
					penguinY -= 10;
					penguinNo++;
					penguinNo %= 3;

					repaint();
					break;
				case KeyEvent.VK_DOWN:
					penguinY += 10;
					penguinNo++;
					penguinNo %= 3;

					repaint();
					break;
				}
			}
		});

		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, JFRAME_WIDTH, JFRAME_HEIGHT);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PenguinMoveApp("펭귄 이동");

	}

	@Override
	public void paint(Graphics g) {

//		super.paint(g);

		g.drawImage(backImage, 0, 0, JFRAME_WIDTH, JFRAME_HEIGHT, this);

		g.drawImage(penguins[penguinNo], penguinX, penguinY, PENGUIN_SIZE, PENGUIN_SIZE, this);

	}

}
