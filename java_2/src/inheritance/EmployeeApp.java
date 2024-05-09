package inheritance;

public class EmployeeApp {
	public static void main(String[] args) {
//		Employee employee = new Employee(1000, "홍길동");
//		System.out.println("사원번호 = " + employee.getEmpNo());

//		Employee employee1 = new EmployeeReagular();
//		Employee employee2 = new EmployeeTime();
//		Employee employee3 = new EmployeeContract();

		Employee[] empArray = new Employee[5];

		empArray[0] = new EmployeeReagular(1000, "홍길동", 96000000);
		empArray[1] = new EmployeeTime(2000, "임꺽정", 50000, 150);
		empArray[2] = new EmployeeContract(3000, "전우치", 7000000);
		empArray[3] = new EmployeeTime(4000, "일지매", 20000, 100);
		empArray[4] = new EmployeeReagular(5000, "장길산", 6000000);

		for (Employee employee : empArray) {
			System.out.println("사원번호 = " + employee.getEmpNo());
			System.out.println("사원이름 = " + employee.getEmpName());
			System.out.println();

			//급여 계산
			
			
//			if (employee instanceof EmployeeReagular) {
//			System.out.println("사원급여 = " + ((EmployeeReagular)employee).computeSalary() );
//			}
//			else if (employee instanceof EmployeeTime) {
//				System.out.println("사원급여 = " + ((EmployeeTime)employee).computeTimePay() );
//			}
//			else if (employee instanceof EmployeeContract) {
//				System.out.println("사원급여 = " + ((EmployeeContract)employee).computeConstract() );
//			}
//			System.out.println("============================================================");
			
			System.out.println("사원급여 = " + employee.computePay());
//			System.out.println("============================================================");
			System.out.println("인센티브 = " + employee.computeIncentive());
			System.out.println("============================================================");
			
			
		}

	}

}
