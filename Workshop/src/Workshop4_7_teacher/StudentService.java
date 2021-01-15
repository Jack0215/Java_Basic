package Workshop4_7_teacher;

public class StudentService {
	
	public Student getAStudentInfor(Student [] arr, 
			String name, int age) throws StudentNotFoundException{
		Student stu = null;
		for ( Student student : arr) {
			if(name.equals(student.getName())) {
				stu=student;
			}
		}
		if (stu ==null) {
		            	
			throw new StudentNotFoundException("찾는 학생이 없습니다.");
		}
		return stu;
	}
	
	public double getAgeAvg(Student[] studentArray) {
		double avg= 0.0;
		int total= 0;
		for (Student student : studentArray) {
			total= total+ student.getAge();
		}
		avg= total/studentArray.length;
		return avg;
	}

	public double getHegithAvg(Student[] studentArray) {
		double avg= 0.0;
		int total= 0;
		for (Student student : studentArray) {
			total= total+ student.getHeight();
		}
		avg= total/studentArray.length;
		return avg;	
	}
	public double getWeithAvg(Student[] studentArray) {
		double avg= 0.0;
		int total= 0;
		for (Student student : studentArray) {
			total= total+ student.getHeight();
		}
		avg= total/studentArray.length;
		return avg;	
	}

	public void printAllStudent(Student[] studentArray) {
		// TODO Auto-generated method stub
		for (Student student : studentArray) {
			System.out.println(student);
		}
		
	}
}
