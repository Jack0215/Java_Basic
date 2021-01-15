package Workshop4_7_hard;

public class StudentService {

	public Student getAStudentInfo(Student []arr, String name) throws StudentNotFoundException{
		Student stu = null;
		for ( Student student : arr) {
			if(name.equals(student.getName())) {
				stu=student;
			}
		}
		if (stu==null) {
			throw new StudentNotFoundException("찾는 학생이 없습니다.");
		}
		return stu;
	}
}
