package Workshop7_2;

import java.util.ArrayList;

//
public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int size = 10;
		MakeList makeList = new MakeList();  //메이크 리스트 뉴
		makeList.makeArrayList(size); //size만큼 랜덤 숫자를
		
		//ArrayList에 add
		double avg = makeList.getAverage(); //평균구하는 하수 호출
		System.out.println("평균값"+ avg); 
		ArrayList<Integer>list=null;		
		list = makeList.getList(); //ArrayList받아와서 자료 출력
	}

}
