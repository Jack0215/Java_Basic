package Workshop7_5_2;
import java.util.ArrayList;
//메인클래스
//0. 두 개의 ArrayList를 생성하고 Randomservice 클래스의 makeRandonInt()에
//각각 넘겨 랜덤한 숫자를 add 받아옴
//1. printArrayList()에게 두 개의 ArrayList를 넘겨 나누고 결과 출력
//
//RandomService클래스
//makeRandonInt():ArrayList를 인자로 받아서 랜덤한 숫자를 채운 후 리던(0~9)
//printArrayList():인자로 두 개의 ArrayList를 받아서 나누며 결과 출력
//try ~ catch를 exception 핸들링 할것
public class Service {
	public void RandomService(ArrayList<Integer> list1 , ArrayList<Integer> list2){
		for(int i =0;i<10;i++) {
			try {
				int result = list1.get(i) / list2.get(i);
				System.out.println(list1.get(i) + "/" + list2.get(i) + "\t" + result);
			} catch (ArithmeticException e) {
				System.out.println("분모가 0입니다.");
			}
		}
	}
	public ArrayList<Integer> makeRandomInt(){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<10;i++) {
			list.add((int)(Math.random()*10));
		}
		return list;
	}
}
