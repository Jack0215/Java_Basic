package Workshop4_7;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("홍길동", 15, 170, 80);
		Student stu2 = new Student("한사람", 13, 180, 70);
		Student stu3 = new Student("임걱정", 16, 175, 65);
		Student[] stu = new Student[3];
		stu[0] = stu1;
		stu[1] = stu2;
		stu[2] = stu3;
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].toString());
		}
		int totalAge = 0;
		int totalHeight = 0;
		int totalWeight = 0;

		int MaxAgeIndex = 0;
		int MinAgeIndex = 0;
		int MaxHeightIndex = 0;
		int MinHeightIndex = 0;
		int MaxWeightIndex = 0;
		int MinWeightIndex = 0;

		for (int i = 0; i < stu.length; i++) {
			totalAge += stu[i].getAge();
			totalHeight += stu[i].getHeight();
			totalWeight += stu[i].getWeight();
		}
		System.out.println((double) totalAge / 3 + "\n" + (double) totalHeight / 3 + "\n" + (double) totalWeight / 3);

		for (int i = 0; i < stu.length; i++) {
			if (stu[MaxAgeIndex].getAge() < stu[i].getAge()) {
				MaxAgeIndex = i;
			}

		}
		for (int i = 0; i < stu.length; i++) {
			if (stu[MinAgeIndex].getAge() > stu[i].getAge()) {
				MinAgeIndex = i;
			}
		}
		System.out.println(stu[MaxAgeIndex].getName());
		System.out.println(stu[MinAgeIndex].getName());

	}
}