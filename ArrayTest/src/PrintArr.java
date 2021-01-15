//메인이 필요없음 arr test가 갖고있음
//배열을 가져와서 합만 구하면 됨
public class PrintArr {
	//1.이 안에 프린트 메소드 만들어야함, 받아야할 인자는 인트의 배열타입
	private double avg;//
	int sum; //
	
	public int print(int [] arr) {  //return이없으면 에러뜸
		                     //↑이름을 arr이라 하겠다.
		int sum=0; 
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];  // 총합계산함
		}
		avg= sum/ arr.length; //로컬변수는 private 사용불가
							  // avg를 double로 선언하면 리턴에서 사용불가
		return sum; //총 합 계산 했으므로 리턴돼야함	
	}
	public double getAvg() {
		return avg;
	}
}