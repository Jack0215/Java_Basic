
public class Eng extends Emp {

	String skill; //skill를 넣고 빼고 할 수 있는 set,get method필요

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Eng() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Eng(String name, String skill) {
		super(name);
		this.skill = skill;
	}

	@Override
	public String printInfo() {
		// TODO Auto-generated method stub
		return super.printInfo()+"\t"+skill;
	}
	
}
