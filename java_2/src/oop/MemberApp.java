package oop;

public class MemberApp {
	public static void main(String[] args) {

		// new 연산자로 member class에 매개 변수가 없는 기본 생성자를 호출하여 객첼를 생성 ( ? : System.in은 매개변수? )
		Member member1 = new Member();

		System.out.println("아이디 = " + member1.getId());
		System.out.println("이름 = " + member1.getName());
		System.out.println("이메일 = " + member1.getEmail());
		System.out.println("===========================================================");

		member1.setId("abc123");
		member1.setName("홍길동");
		member1.setEmail("abc@itwill.xzy");

		System.out.println("아이디 = " + member1.getId());
		System.out.println("이름 = " + member1.getName());
		System.out.println("이메일 = " + member1.getEmail());
		System.out.println("===========================================================");

		Member member2 = new Member("opq456");
		System.out.println("===========================================================");
		member2.display();
		Member member3 = new Member("opq456", "임꺽정");
		System.out.println("===========================================================");
		member3.display();
		Member member4 = new Member("opq456", "전우치", "asd@itwill.xyz");
		System.out.println("===========================================================");
		member4.display();
		Member member5 = new Member();
		System.out.println("===========================================================");
		member5.display();


	}

}
