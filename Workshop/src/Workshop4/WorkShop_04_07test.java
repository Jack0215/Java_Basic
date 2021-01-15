package Workshop4;
public class WorkShop_04_07test {
	public static void main(String[] args) {
		Student stu01 = new Student("홍길동",16,170,80);
		Student stu02 = new Student("한사람",13,175,70);
		Student stu03 = new Student("임걱정",14,180,65);
		Student [] stu = new Student[3];
	stu[0]= stu01;
	stu[1]= stu02;
	stu[2]= stu03;
	double sum = 0;
	double sum1 = 0;
	double sum2 = 0;
	System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
	for(Student i : stu) {
	System.out.println(i.getName()+"\t"+i.getAge()+"\t"+ i.getHeight()+"\t"+ i.getWeight());
	}
	
	for(Student i: stu) {	
		sum+=i.getAge();		
	}System.out.printf("나이 평균:%.3f" , sum/stu.length);
	
	for(Student i: stu) {	
		sum1+=i.getHeight();
		
	}System.out.println("\n신장 평균: "+ sum1/stu.length);

	for(Student i: stu) {
			sum2+=i.getWeight();
	}System.out.printf("몸무게 평균: %.3f", sum2/stu.length);
	
	for(Student i : stu) {
		int max = stu01.getAge();
		if(max<i.getAge()) {		
			max = i.getAge();
		System.out.println("\n나이가 가장 많은 학생 :"+ i.getName());
		}
	}
		for(Student i : stu) {
			int max = stu01.getHeight();
			if(max<i.getHeight()) {		
		       max = i.getHeight();
		System.out.println("\n키가 가장 큰 학생 :"+ i.getHeight());	
		break;
			} 
		}
	}
}
