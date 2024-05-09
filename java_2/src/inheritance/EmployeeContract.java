package inheritance;

//정규직 사원정보(사원번호, 사원이름, 계약급여)

public class EmployeeContract extends Employee {
	private int contractPay;

	public EmployeeContract() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeContract(int empNo, String empName, int contractPay) {
		super(empNo, empName);
		this.contractPay = contractPay;
	}

	public int getContractPay() {
		return contractPay;
	}

	public void setContractPay(int contractPay) {
		this.contractPay = contractPay;
	}

//	public int computeConstract() {
//		return contractPay;
//	}

	@Override
	public int computePay() {
		// TODO Auto-generated method stub
		return contractPay;
	}

	@Override
	public int computeIncentive() {
		// TODO Auto-generated method stub
		return 100000000;

	}
}
