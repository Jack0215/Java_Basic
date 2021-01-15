package student;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int science;
	private int math;
	double avg;
	public Student() {}
	public Student(String name, int korean, int english, int science, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.science = science;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}

	public double getAvg() {
		double sum = korean + english + math + science;
		double avg = sum / 4;
		return avg;
	}
	public String getGrade() {
		String result = "F 학점";
		int avg = (int) getAvg();
		if (avg >= 90) {
			result = "A학점";
		} else if (avg >= 70) {
			result = "B학점";
		} else if (avg >= 50) {
			result = "C학점";
		} else if (avg >= 30) {
			result = "D학점";
		} return result;
	}
}
