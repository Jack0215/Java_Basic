package As;

public class studnet {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;

	public studnet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public studnet(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	@Override
	public String toString() {
		return "studnet [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + ", science="
				+ science + "]";
	}
}