package xyz.itwill.realization;

public class WolfHuman extends Human implements Wolf {

	@Override
	public void fastWalk() {
		System.out.println("[늑대] 네발로 빠르게 달리는 능력");
		
	}

	@Override
	public void cryLoudly() {
		System.out.println("[늑대] 큰소리로 울부짖을 수 있는 능력");
		
	}
	
	public void change() {
		System.out.println("[늑대인간] 변신 할 수 있는 능력");
	}
	
	

}
