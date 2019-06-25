package com.techlab.dip.violation;

public class TaxCalculator {
	private LogType log;
	private DBLogger dbLogger = new DBLogger();
	private FileLogger fileLogger = new FileLogger();

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public int CalculateTax(int amount, int rate) {
		try {
			int r = amount / rate;
		} catch (Exception ex) {
			if (log == LogType.DB) {
				System.out.println(dbLogger.log(ex.getMessage()));
				return 1;
			}
			if (log == LogType.FILE) {
				System.out.println(fileLogger.log(ex.getMessage()));
				return -1;
			}
		}
		return 0;
	}
}
