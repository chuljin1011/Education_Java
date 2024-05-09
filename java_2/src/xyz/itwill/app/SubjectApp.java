package xyz.itwill.app;

import xyz.itwill.subject.JavaSubject;
import xyz.itwill.subject.OracleSubject;
import xyz.uniwill.subject.NetworkSubject;

public class SubjectApp {
	public static void main(String[] args) {
//		xyz.itwill.subject.OracleSubject subject1 = new xyz.itwill.subject.OracleSubject();
		
		OracleSubject subject1 = new OracleSubject();		
		subject1.display();
		
		NetworkSubject subject2 = new NetworkSubject();
		subject2.display();
		
		JavaSubject subject3 = new JavaSubject();
		subject3.display();
		
		xyz.uniwill.subject.JavaSubject subject4 = new xyz.uniwill.subject.JavaSubject();
		subject4.display();
		
		
	}

}
