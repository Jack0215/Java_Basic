package com.employee.entity;

public class Sales extends Employee {

	public static final double COMMISSION_RATE = 0.2; // �μ��� ������ ��� salary*COMMISSION_RATE
	private double commission;

	public double getCommission() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Sales(int empno, String ename, String hiredate, String loc, int sal, String state) {
		super(empno, ename, hiredate, loc, sal, state);
		// TODO Auto-generated constructor stub
	}

	public static double getCommissionRate() {
		return COMMISSION_RATE;
	}

	public Sales(int empno, String ename, String hiredate, String loc, int sal, String state, double d) {
		super(empno, ename, hiredate, loc, sal, state);
		// TODO Auto-generated constructor stub
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	
	
}
