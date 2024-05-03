package inheritance;

//학원 인적자원 (학생, 강사, 직원) 관리 프로그램 작성 
public class AcademyApp {
	public static void main(String[] args) {
		/*
		 * // 학생정보 AcademyStudent[] students = new AcademyStudent[300]; // 강사정보
		 * AcademyInstructor[] instructors = new AcademyInstructor[50]; // 직원정보
		 * AcademyStaff[] academyStaffs = new AcademyStaff[100];
		 */

		// 사람정보
		AcademyPerson[] persons = new AcademyPerson[5];

		persons[0] = new AcademyStudent(1000, "홍길동", "웹개발자 과정");
		persons[1] = new AcademyInstructor(2000, "임꺽정", "java 과목");
		persons[2] = new AcademyStaff(3000, "전우치", "운영관리팀");
		persons[3] = new AcademyStudent(4000, "일지매", "웹디자인 과정");
		persons[4] = new AcademyStaff(5000, "장길산", "경영회계팀");

		for (AcademyPerson person : persons) {
			if (person instanceof AcademyStudent) {
				System.out.println(((AcademyStudent) person).getCourse() + "의 학생정보");
			} else if (person instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor) person).getSubject() + "의 강사정보");
			} else if (person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff) person).getDepart() + "의 직원정보");
			}

			person.display();
			System.out.println("==============================================================");
		}

	}

}
