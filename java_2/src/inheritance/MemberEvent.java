package inheritance;

//회원정보를 저장하기 위한 class
public class MemberEvent extends Member {
	/*
	 * private String id; private String name;
	 */
	private String email;

	public MemberEvent() {
		// TODO Auto-generated constructor stub
	}

//	public MemberEvent(String id, String name, String email) {
//		super(id, name);
//		
////		this.id = id;
//////		setId(id);
////		this.name = name; 
////		setName(name);
//		this.email = email;
//	}

	public MemberEvent(String id, String name, String email) {
		super(id, name);
		this.email = email;
	}

	/*
	 * public String getId() { return id; } public void setId(String id) { this.id =
	 * id; } public String getName() { return name; } public void setName(String
	 * name) { this.name = name; }
	 */

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public void display() {
////		System.out.println("아이디 = " + id);
//		System.out.println("아이디 = " + getId());
////		System.out.println("이름 = " + name);
//		System.out.println("이름 = " + getName());
//		System.out.println("이메일 = " + email);

//	@Override
//	public void display() {
//		super.display();
//		System.out.println("이메일 = " + email);

//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		super.display();
//		System.out.println("이메일 = " + email);
//	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}

}
