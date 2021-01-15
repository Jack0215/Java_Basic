package Test03;

public class DEPT {
	
 private int deptno;
 private String dname;
 private String loc;
public DEPT() {
	super();
	// TODO Auto-generated constructor stub
}
public DEPT(int deptno, String dname, String loc) {
	super();
	this.deptno = deptno;
	this.dname = dname;
	this.loc = loc;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "test02 [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
}

}