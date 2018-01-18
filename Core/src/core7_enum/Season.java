package core7_enum;

import static core7_enum.Months.*;

public enum Season {

	WINTER(December, January, February), 
	SPRING(March, April, May), 
	SUMMER(June, July, August), 
	AUTUMN(September, October, November);
	
	private Months month1;
	private Months month2;
	private Months month3;
	
	Season(Months month1, Months month2, Months month3) {
		this.month1 = month1;
		this.month2 = month2;
		this.month3 = month3;
	}

	public Months getMonth1() {
		return month1;
	}

	public Months getMonth2() {
		return month2;
	}

	public Months getMonth3() {
		return month3;
	}
	
	public Months[] getAllMonths() {
		Months arr[] = {month1, month2, month3};
		return arr;
	}

}
