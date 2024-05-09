package inheritance;

//정규직 사원정보(사원번호, 사원이름, 시급, 근무시간)

public class EmployeeTime extends Employee {

	private int moneyPerHour;
	private int workHour;

	public EmployeeTime() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeTime(int empNo, String empName, int moneyPerHour, int workHour) {
		super(empNo, empName);
		this.moneyPerHour = moneyPerHour;
		this.workHour = workHour;
	}

	public int getMoneyPerHour() {
		return moneyPerHour;
	}

	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

//	public int computeTimePay() {
//		return moneyPerHour * workHour;
//
//	}

	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return moneyPerHour * workHour;
	}

}
