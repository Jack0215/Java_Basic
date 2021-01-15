package Workshop4_7_hard;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = new Student[3];
		Student stu1 = new Student("홍길동", 15, 170, 80);
		Student stu2 = new Student("한사람", 13, 180, 70);
		Student stu3 = new Student("임걱정", 16, 175, 65);
		student[0] = stu1;
		student[1] = stu2;
		student[2] = stu3;
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}

		StudentService service = new StudentService();
		Student stu = null;
		try {
			stu = service.getAStudentInfo(student, "홍길동");
			System.out.println("검색결과 :" + stu);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}