
public class Student02 {

	public static void main(String[] args) {

		Student01[] stu = new Student01[3];
		stu[0] = new Student01("홍길동", 15, 170, 80);
		stu[1] = new Student01("한사람", 13, 180, 70);
		stu[2] = new Student01("임걱정", 16, 175, 65);

		int MaxAgeIndex = 0;

		for (int i = 0; i <stu.length; i++) {
			if (stu[MaxAgeIndex].getAge() < stu[i].getAge()) {
				MaxAgeIndex = i;
			}
		}
//		if (studentArray[maxAgeIndex].getAge() < studentArray[i].getAge()) {
//			maxAgeIndex = i;
//		}
//		if (studentArray[minAgeIndex].getAge() > studentArray[i].getAge()) {
//			minAgeIndex = i;
//		}
		System.out.println(stu[MaxAgeIndex].getName());
	}

}
