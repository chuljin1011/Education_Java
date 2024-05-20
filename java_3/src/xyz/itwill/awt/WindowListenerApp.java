package xyz.itwill.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerApp extends Frame {

	private static final long serialVersionUID = 1L;

	public WindowListenerApp(String title) {
		super(title);
		
		addWindowListener(new WindowEventHandle());

		setBounds(800, 200, 300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowListenerApp("WindowEvent");
	}

	public class WindowEventHandle implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("windowOpened(WindowEvent e) 메소드 호출");
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
//			System.out.println("windowClosing(WindowEvent e) 메소드 호출");
			System.exit(0);
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("windowClosed(WindowEvent e) 메소드 호출");
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("windowIconified(WindowEvent e) 메소드 호출");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowDeiconified(WindowEvent e) 메소드 호출");
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated(WindowEvent e) 메소드 호출");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated(WindowEvent e) 메소드 호출");
			
		}
	
	}

}
