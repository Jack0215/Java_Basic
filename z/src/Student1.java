public class Student1{
	public static void main(String[] args) {
		Student stu01 = new Student("홍길동",15,171,81);
		Student stu02 = new Student("한사람",13,183,72);
		Student stu03 = new Student("임걱정",16,175,65);
		Student [] stu04 = {stu01, stu02, stu03};
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
		for (Student s : stu04) {
			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getHeight()+"\t"+s.getWeight());
		}
		for (Student s : stu04) {
			sum1 += s.getAge();
		}System.out.printf("나이 평균 :%.2f",sum1/stu04.length);
		
		for (Student s : stu04) {
			sum2 += s.getHeight();
		} System.out.printf("\n신장의 평균:%.2f", sum2/stu04.length);
		
		for (Student s : stu04) {
			sum3 += s.getWeight();
		} System.out.printf("\n몸무게의 평균:%.2f", sum3/stu04.length);
	}
}