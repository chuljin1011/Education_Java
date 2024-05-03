package inheritance;

public class MemberCastApp {
	public static void main(String[] args) {
		
		
		Member member1 = new Member();
		
		member1.setId("abc123");
		member1.setName("홍길동");
		member1.display();
		System.out.println("==============================================");
		
		
		// 자식 클래스
		
		MemberEvent member2 = new MemberEvent();
		
		member2.setId("xzy123");
		member2.setName("전우치");	
		member2.setEmail("xzy@itwill.com");
		member2.display();
		System.out.println("==============================================");
		
		Member member3 = new MemberEvent();
		
		member3.setId("xzy123");
		member3.setName("전우치");
//		member3.setEmail("xzy@itwill.com");
		member3.display();
		
		System.out.println("==============================================");
//		MemberEvent event = (MemberEvent)member3;
//		event.setEmail("syz@itwill.com");
//		((MemberEvent)member3).setEmail(" abc@abc.com");
		
//		((MemberEvent)member3).display();
		member3.display();
		
		
	}

}
