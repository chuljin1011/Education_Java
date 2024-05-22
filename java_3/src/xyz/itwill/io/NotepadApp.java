package xyz.itwill.io;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NotepadApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextArea textArea;
	private JMenuItem init, open, save, exit;

	private File file;

	private JFileChooser fileChooser;

	public NotepadApp(String title) {
		super(title);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일(F)");
		fileMenu.setMnemonic('F');

		init = new JMenuItem("새로만들기(N)", 'N');
		open = new JMenuItem("열기(O)", 'O');
		save = new JMenuItem("저장(S)", 'S');
		exit = new JMenuItem("끝내기(X)", 'X');

		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		open.setAccelerator(
				KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.ALT_DOWN_MASK + InputEvent.SHIFT_DOWN_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

		fileMenu.add(init);
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.addSeparator();
		fileMenu.add(exit);

		menuBar.add(fileMenu);

		setJMenuBar(menuBar);

		textArea = new JTextArea();
		textArea.setFont(new Font("굴림체", Font.PLAIN, 20));
		JScrollPane scrollPane = new JScrollPane(textArea);

		getContentPane().add(scrollPane, BorderLayout.CENTER);

		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("C:/"));
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("텍스트 파일(*.txt)", "txt"));

		init.addActionListener(new ActionHandle());
		open.addActionListener(new ActionHandle());
		save.addActionListener(new ActionHandle());
		exit.addActionListener(new ActionHandle());

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		;
		setBounds(450, 150, 1000, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new NotepadApp("제목 없음 - Java 메모장");
	}

	public class ActionHandle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSource = e.getSource();
			if (eventSource == init) {
				textArea.setText("");
				setTitle("제목 없음 - Java 메모장");
				file = null;

			} else if (eventSource == open) {
				int option = fileChooser.showOpenDialog(NotepadApp.this);

				if (option == JFileChooser.APPROVE_OPTION) {
					file = fileChooser.getSelectedFile();

					setTitle(file.toString() + " - Java 메모장");

					try {
						BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));

						textArea.setText("");

						while (true) {
							String text = in.readLine();

							if (text == null)
								break;

							textArea.append(text + "\n");
						}

						in.close();
					} catch (FileNotFoundException exception) {
						JOptionPane.showMessageDialog(NotepadApp.this, "파일을 찾을 수 없습니다.");
						// TODO: handle exception
					} catch (IOException exception) {
						JOptionPane.showMessageDialog(NotepadApp.this, "프로그램에 문제가 발생 하였습니다.");
						// TODO: handle exception

					}

				} else if (option == JFileChooser.CANCEL_OPTION) {
					return;
				}

			} else if (eventSource == save) {

				int option = fileChooser.showSaveDialog(NotepadApp.this);
				if (option == JFileChooser.APPROVE_OPTION) {

					file = fileChooser.getSelectedFile();

					try {
						BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
						BufferedWriter out = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));

//					textArea.setText("");

						while (true) {
							String text = in.readLine();

							if (text == null)
								break;

							out.write(text);
						}

						in.close();
						out.close();
					} catch (FileNotFoundException exception) {
						JOptionPane.showMessageDialog(NotepadApp.this, "파일을 찾을 수 없습니다.");
						// TODO: handle exception
					} catch (IOException exception) {
						JOptionPane.showMessageDialog(NotepadApp.this, "프로그램에 문제가 발생 하였습니다.");
						// TODO: handle exception

					}

				} else if (option == JFileChooser.CANCEL_OPTION) {
					return;
				}

			} else if (eventSource == exit) {
				System.exit(0);

			}
		}

	}
}
