//
//public class Search {
// 
//	public String searchIndex (int []arr, int num) {
//		String message = "";
//		int index = 0;
//		
//		for ( int i = 0; i <arr.length; i++)
//			if(num == arr[i]) {
//				message = (i+1) + "번째에 있습니다.";
//				break;
//			} else {
//				message = "범위 내에 값이 없습니다.";
//			}
//		
//		return message;	
//	}
//}
//
////public String searchIndex (int []arr, int num) {
////	String message = "검색값이 없습니다";
////	for ( int i = 0; i < arr.length; i++) {
////		if(search==arr[i]) {
////			mesg=search+"는"+i+"번째방에 있습니다";
////		}
////	}return message
////		}
////	}



public class Search {
	public String searchIndex (int []arr, int num) {
		String message = "";
		int index = 0;
		for ( int i = 0; i <arr.length; i++)
			if(num == arr[i]) {
				message = (i+1) + "번째에 있습니다.";
				break;
			} else {
				message = "범위 내에 값이 없습니다.";
			}
		return message;	}
}

//서치함수에서 인자 제거
//배열과 검색하는 private로 막을것
//배열과 검색어는 생성하면서 초기화
//생성자에서 초기화할 검색어는 빼노
//생성자만들고
//







