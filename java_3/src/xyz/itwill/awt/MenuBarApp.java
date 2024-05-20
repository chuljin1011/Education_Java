package xyz.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.KeyEvent;

public class MenuBarApp extends Frame {
	private static final long serialVersionUID = 1L;

	public MenuBarApp(String title) {
		super(title);

		MenuBar menuBar = new MenuBar();

		Menu file = new Menu("File");
		Menu help = new Menu("Help");

		menuBar.add(file);
		menuBar.add(help);

		// 메뉴 아이템
		MenuItem open = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O));
		MenuItem save = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));
		MenuItem exit = new MenuItem("Exit");

		MenuItem view = new MenuItem("HelpView");
		MenuItem info = new MenuItem("Imformation");

		//
		file.add(open);
		file.add(save);
		file.addSeparator(); // 메뉴아이템을 구분하는 구분선
		file.add(exit);

		help.add(view);
		help.add(info);

		setMenuBar(menuBar);

		TextArea textArea = new TextArea();
		textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		add(textArea, BorderLayout.CENTER);

		setBounds(500, 100, 1000, 800);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MenuBarApp("MenuBAR");
	}

}
