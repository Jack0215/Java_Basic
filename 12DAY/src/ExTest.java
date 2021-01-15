
public class ExTest {
//원본
//public class ExTest {
//	public int a(int num1, int num2) {
//		int result=num1/ num2;
//		return result;
//	}
//}

//	//트라이캐치로 익셉션 처리
//	public int a(int num1, int num2) {
//		int result = 0;
//		try {
//			result = num1 / num2;
//			return result;
//		} catch (Exception e) {
//		}
//		return result;
//	}
//}

////트라이캐치로 지우고 throws 처리   ///기존에 있던 try, catch를 지워야함
//public int a(int num1, int num2)throws Exception {
//	int result = 0;
//	result = num1 / num2;
//	return result;
//}
//}


//	public int a(int num1, int num2) throws ArithmeticException {
//		int result = 0;
//		if (num2 == 0) { //0인경우 문제 발생, throw를 통해 메인으로 가게됨
//			throw new ArithmeticException("0으로 나눌 수 없습니다. 다시 입력해주세요");
//		} else {
//			result = 0;
//			result = num1 / num2;
//		}
//		return result;
//	}
//	
	
	
	public int a(int num1, int num2) throws ArithmeticException {
		int result = 0;
		if (num2 == 0) { //0인경우 문제 발생, throw를 통해 메인으로 가게됨
			throw new ArithmeticException("0으로 나눌 수 없습니다. 다시 입력해주세요");
		} else {
			result = 0;
			result = num1 / num2;
		}
		return result;
	}
}