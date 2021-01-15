
public class Man extends Emp {

	String depart; //관리부서
				   //depart를 넣고 빼고 할 수 있는 set,get method필요
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public Man(String name, String depart) {
		super(name);
		this.depart = depart;
	}
	@Override
	public String printInfo() {
		
		return super.printInfo()+"\t"+depart;
		//return name+depart;
	}
	
}
