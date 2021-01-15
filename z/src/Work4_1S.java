public class Work4_1S {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
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
	public Work4_1S () {}
	public Work4_1S (String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math=math;
		this.science=science;
	}
	
	public double getAvg () {
		double sum = korean+english+math+science;
		double avg = sum/4;
		return avg;
	}
	public String getGrade () {
		String result = "F학점";
		int avg = (int)getAvg(); 
		if (avg > 90) {
			result = "A학점";
		} else {
			result = "F학점";
		} 
		return result;
	}
}