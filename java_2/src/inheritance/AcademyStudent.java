package inheritance;

//학생정보 (학생번호, 학생이름, 수강과정)
public class AcademyStudent extends AcademyPerson {

	private String course;

	public AcademyStudent() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStudent(int num, String name, String course) {
		super(num, name);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public void display() {
		System.out.println("학생번호 = " + getNum());
		System.out.println("학생이름 = " + getName());
		System.out.println("수강과정 = " + course);

	}
	
}
