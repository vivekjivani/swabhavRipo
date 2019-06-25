package com.techlab.ocp.violation;

public class FixedDeposit {
	private String accountNumber;
	private String name;
	private double principal;
	private float period;
	private FestivalType festival;
	private static float HOLI_INTEREST_RATE = 0.08f;
	private static float NEW_YEAR_INTEREST_RATE = 0.09f;
	private static float NORMAL_DAY_INTEREST_RATE = 0.07f;

	public FixedDeposit(String accountNumber, String name, double principal, float period, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.period = period;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest() {
		if(festival == FestivalType.HOLI) {
			return principal*period*HOLI_INTEREST_RATE;
		}
		if(festival == FestivalType.NEW_YEAR) {
			return principal*period*NEW_YEAR_INTEREST_RATE;
		}
		return principal*NORMAL_DAY_INTEREST_RATE;
	}
}
