public class HelloTest1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	System.out.println("HelloWorld");//출력후 자동 줄변경
	System.out.print("aaaa");//한줄출력
	System.out.print("bbbb\n"); //한줄출력+줄바꿈
	System.out.printf("%d, %s, %c\n",
			1110, "abcd", 'c'); //값의대입
	System.out.println("main 종료");
	
	//Println Test
	System.out.println("이재윤 2020 남");
	System.out.println("이재윤"+2019+'남');
	System.out.println(2011+"2012");
	System.out.println(2011+2012);
	System.out.println(2011+""+2012);
	System.out.println(2011+ 2012+"문자열");
	System.out.println("문자열"+2011+ 2012);
	
	//Print Test
	System.out.print("이재윤");
	System.out.print("2020\n");
	System.out.print("남\n");
	
	//Ptintf Test
	System.out.printf("%s, %d, %c, %.2f  %b",
			"10이재윤", 2020, '남', 1234.567, true);
}
	}

