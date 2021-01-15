package Workshop7_5_3_2;

import java.util.ArrayList;

public class ListTest03 {
public static void main(String[] args) {
 
        //rs 생성, int한테 list1,2번 넘김(1,2번은 비어있음) 6행으로
        RandomService test= new RandomService();
        test.makeRandomInt();
        test.printArrayList();
        //메인쪽에서 리스트를 다 받아와서 출력하고싶으면 
        //가져와야 할 때 service에 리스트를 맵에 담던지
        //service에선 리턴이 없으므로 겟리스트로 호출
        
        
//        list1 = test.makeRandomInt(list1);
//        list2 = test.makeRandomInt(list2);
//        test.printArrayList(list1, list2); //array한테 1번과 2번을 넘겨줌
               }
}
