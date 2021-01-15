package student;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//불러올 것 //학생이름, 총점get average, 학점, get grade
		Student student1 = new Student ("kim",100,90,95,89);
		Student student2 = new Student ("Lee",60,70,99,98);
		Student student3 = new Student ("Park",68,86,60,40);
	
		Student [] sutudent4 =new Student[3];
		sutudent4[0]=student1;
		sutudent4[1]=student2;
		sutudent4[2]=student3;
		
		System.out.printf("%s 평균:%.2f 학점:%s",student3.getName(), student3.getAvg(), student3.getGrade());
				
//		for(Student x : sutudent4) {
//			System.out.printf("%s 평균:%.2f 학점:%s", x.getName(), x.getAvg(), x.getGrade());
//			System.out.println();
//		}
		
		
	}

}
//제일 점수가 높은 사람을 찾으려면???(100명있다 치고)
//