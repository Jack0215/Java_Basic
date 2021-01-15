package Workshop4_1;

public class StudentTest {

	public static void main(String[] args) {
	
	Student stu1 = new Student("Kim",100,100,100,100);	
	Student stu2 = new Student("Lee",70,70,70,70);	
	Student stu3 = new Student("Park",50,50,50,50);	
	Student [] stu = new Student[3];
	stu[0]=stu1;
	stu[1]=stu2;
	stu[2]=stu3;
	
	System.out.println(stu1.getName()+"평균 :"+stu1.getAvg()+"학점 :"+stu1.getGrade());
	System.out.println(stu2.getName()+"평균 :"+stu2.getAvg()+"학점 :"+stu2.getGrade());
	System.out.println(stu3.getName()+"평균 :"+stu3.getAvg()+"학점 :"+stu3.getGrade());
	}
}
