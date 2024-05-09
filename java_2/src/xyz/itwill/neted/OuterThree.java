package xyz.itwill.neted;

public class OuterThree {
	private int outerNum;

	public OuterThree() {
		// TODO Auto-generated constructor stub
	}

	public OuterThree(int outerNum) {
		super();
		this.outerNum = outerNum;
	}
	
		public int getOuterNum() {
		return outerNum;
	}

	public void setOuterNum(int outerNum) {
		this.outerNum = outerNum;
	}

	public void outerDisplay() {
		System.out.println("outerNum = " + outerNum);
	}
	
	public void local() {
		class InnerThree {
			
			int innerNum;
			
			void innerDisplay() {
				System.out.println("innerNum = " + innerNum);
			}
			
			
		}
		
		InnerThree innerThree = new InnerThree();
		innerThree.innerNum=200;
		innerThree.innerDisplay();
		
	}

}
