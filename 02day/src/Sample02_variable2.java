
public class Sample02_variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63) 체중
		//1. 변수선언과 초기와 동시에
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		char gender = '남';
		boolean isMarried = false;
		float height = 185.63f;
		float weight = 75.25f;
		
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("주소 :"+address);
		System.out.println("성별 :"+gender);
		System.out.println("결혼 여부:"+isMarried);
		System.out.println("키 :"+height);
		System.out.println("몸무게 :"+weight);
		
		System.out.println("이름 :"+name+"  나이 :"+age);
		System.out.print("이름 :"+name+"   나이"+age);
		System.out.printf("\n이름 :%s \n나이:%d  \n주소:%s \n성별:%c \n결혼여부:%b \n키:%.2f \n몸무게:%.2f", 
				name, age, address, gender, isMarried, height, weight);
	}
}
