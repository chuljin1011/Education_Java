package xyz.itwill.enumerate;

public enum Compass {

//	 EAST, WEST, SOUTH, NORTH;

	EAST("East"), WEST("West"), SOUTH("South"), NORTH("North");

	private final String value;
	
	

	public String getValue() {
		return value;
	}


	private Compass(String value) {
		this.value = value;
	}

}
