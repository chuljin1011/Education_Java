package xyz.itwill.neted;

public class AnonymousApp {
	public static void main(String[] args) {
//		Anonymous
		
//		class AnonymousParent implements Anonymous {
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				System.out.println("지역클래스의 display() 메소드 호출");
//			}
//		}
//		
//		Anonymous anonymous = new AnonymousParent();
//		anonymous.display();
		
		Anonymous1 anonymous = new Anonymous1() {
			@Override
			public void display() {
			
			}
		};
		
	}

}
