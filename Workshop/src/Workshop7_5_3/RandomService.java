package Workshop7_5_3;

import java.util.ArrayList;

public class RandomService {
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    
	public ArrayList<Integer> makeRandomInt(ArrayList<Integer> list) { //비어있는 리스트받아서 아래 포문 호출 list1 했다가 list2작동
		 for(int i = 0 ; i < 10; i++) {
	            int randomValue1 = (int) (Math.random() * 10);	         
	            list.add(randomValue1);	          
	        }
		return list;		//랜덤한값 10개 들어있는게 메인으로 리턴 list1로 끝나면 2로
	}
	
	public void printArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
		//1번과 2번을 받아서 나눗셈 해줌
		 for(int i = 0; i < 10; i++) {
	            int list1Value = list1.get(i);
	            int list2Value = list2.get(i);
	            
	            try {
	                System.out.println(list1Value + "/" + list2Value + " ");
	                System.out.println(list1Value / list2Value);
	                
	            } catch (Exception e) {
	                System.out.println("분모가 0입니다");
	            }
		 }
	}
}
