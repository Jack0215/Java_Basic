package com.dto;

public class Domestic {
	private int pdno;
	private String pdname;
	private  String pdsubname;
	private  int factno;
	private  int pddate;
	private  int pdcost;
	private  int pdprice;
	private  int pdamount;
	public Domestic(int pdno, String pdname, String pdsubname, int factno, int pddate, int pdcost, int pdprice,
			int pdamount) {
		super();
		this.pdno = pdno;
		this.pdname = pdname;
		this.pdsubname = pdsubname;
		this.factno = factno;
		this.pddate = pddate;
		this.pdcost = pdcost;
		this.pdprice = pdprice;
		this.pdamount = pdamount;
	}
	public Domestic() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Domestic [pdno=" + pdno + ", pdname=" + pdname + ", pdsubname=" + pdsubname + ", factno=" + factno
				+ ", pddate=" + pddate + ", pdcost=" + pdcost + ", pdprice=" + pdprice + ", pdamount=" + pdamount + "]";
	}
	public int getPdno() {
		return pdno;
	}
	public void setPdno(int pdno) {
		this.pdno = pdno;
	}
	public String getPdname() {
		return pdname;
	}
	public void setPdname(String pdname) {
		this.pdname = pdname;
	}
	public String getPdsubname() {
		return pdsubname;
	}
	public void setPdsubname(String pdsubname) {
		this.pdsubname = pdsubname;
	}
	public int getFactno() {
		return factno;
	}
	public void setFactno(int factno) {
		this.factno = factno;
	}
	public int getPddate() {
		return pddate;
	}
	public void setPddate(int pddate) {
		this.pddate = pddate;
	}
	public int getPdcost() {
		return pdcost;
	}
	public void setPdcost(int pdcost) {
		this.pdcost = pdcost;
	}
	public int getPdprice() {
		return pdprice;
	}
	public void setPdprice(int pdprice) {
		this.pdprice = pdprice;
	}
	public int getPdamount() {
		return pdamount;
	}
	public void setPdamount(int pdamount) {
		this.pdamount = pdamount;
	}
	
}
