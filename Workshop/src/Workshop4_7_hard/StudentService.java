package Workshop4_7_hard;

public class StudentService {
public Student getAStudentInfo(Student[] arr, String name) throws StudentNotFoundException{
	Student stu = null;
	boolean flag = false;
	for (Student student : arr) {
		if(name.equals(student.getName())) {
			stu=student;
			flag = true;
		}
	}
//	if(flag == false) {
	if(stu==null) {
		throw new StudentNotFoundException("찾는 학생이 없습니다.");
	}
	return stu;
}

public double getAgeAvg(Student[] studentArray) {
	// TODO Auto-generated method stub
	return 0;
}
}

//몸무게 평균을 따로 뺀다음 메인으로 호출 student service class에 작성
