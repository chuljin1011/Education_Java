package inheritance;

//정규직 사원정보(사원번호, 사원이름, 연봉) - 월급

public class EmployeeReagular extends Employee {
	private int annualSalary;

	public EmployeeReagular() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeReagular(int empNo, String empName, int annualSalary) {
		super(empNo, empName);
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	// 급여를 계산하여 반환하는 메소드

//	public int computeSalary() {
//		return annualSalary/12;
//	}

	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return annualSalary / 12;
	}

}
