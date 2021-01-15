//
//public class Workshop1_5_2{
//
//	public static void main(String[] args) {
//		Workshop1_5 studentArray [] = new Workshop1_5[3];
//		studentArray[0] = new Workshop1_5("홍길동", 15, 170, 80);
//		studentArray[1] = new Workshop1_5("한사람", 13, 180, 70);
//		studentArray[2] = new Workshop1_5("임걱정", 16, 175, 65);
//		
//	
//		}	
//		double totalAge = 0;
//		double totalHeight = 0;
//		double totalWeight = 0;
//
//		int maxAgeIndex = 0;
//		int minAgeIndex = 0;
//		int maxHeightIndex = 0;
//		int minHeightIndex = 0;
//		int maxWeightIndex = 0;
//		int minWeightIndex = 0;
//
//		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
//
//		for(int i = 0; i < studentArray.length; i++) {
//		Object[] studentArray;
//		System.out.println(studentArray[i].studentInfo());
//		
//		totalAge += studentArray[i].getAge();
//		totalHeight += studentArray[i].getHeight();
//		totalWeight += studentArray[i].getWeight();
//		
//		if( studentArray[maxAgeIndex].getAge() <
//				studentArray[i].getAge()) {
//		maxAgeIndex = i;
//		}
//		
//		if( studentArray[minAgeIndex].getAge() >
//		studentArray[i].getAge()) {
//		minAgeIndex = i;
//		
//		}
//		if( Array[maxHeightIndex].getHeight() <
//		Array[i].getHeight()) {
//		maxHeightIndex = i;
//		
//		}
//		if( Array[minHeightIndex].getHeight() >
//		Array[i].getHeight()) {
//		minHeightIndex = i;
//		
//		}
//		if( Array[minWeightIndex].getWeight() <
//		Array[i].getWeight()) {
//		minWeightIndex = i;
//		
//		}
//		if( Array[minWeightIndex].getWeight() >
//		Array[i].getWeight()) {
//		minWeightIndex = i;
//		}
//		}
//		System.out.println();
//		System.out.printf("나이 평균 : %.3f \n", (totalAge / studentArray.length));
//		System.out.printf("신장 평균 : %.3f \n", (totalHeight / studentArray.length));
//		System.out.printf("몸무게 평균 : %.3f \n", (totalWeight / studentArray.length));
//		System.out.println();
//		System.out.println("나이가 가장 많은 학생 : " + studentArray[maxAgeIndex].getName());
//		System.out.println("나이가 가장 적은 학생 : " + studentArray[minAgeIndex].getName());
//		System.out.println("신장이 가장 큰 학생 : " + studentArray[maxHeightIndex].getName());
//		System.out.println("신장이 가장 작은 학생 : " + studentArray[minHeightIndex].getName());
//		System.out.println("몸무게가 가장 많이 나가는 학생 : " +
//		studentArray[maxWeightIndex].getName());
//		System.out.println("몸무게가 가장 적게 나가는 학생 : " +
//		studentArray[minWeightIndex].getName());
//	}
//
//}