package core7;

public enum Months {

	December(31), January(30), February(28), 
	March(30), April(31), May(30), 
	June(31), July(30), August(31), 
	September(30), October(31), November(30);
	
	private int daysInMonth;

	private Months(int daysInMonth) {
		this.daysInMonth = daysInMonth;
	}

	public int getDaysInMonth() {
		return daysInMonth;
	}
	
}
