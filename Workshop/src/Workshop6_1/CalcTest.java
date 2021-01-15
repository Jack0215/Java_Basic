package Workshop6_1;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data1 = Integer.parseInt(args[0]); //
		String arg = args[1];
		char operator = arg.charAt(0);
		int data2 = Integer.parseInt(args[2]);
		Calculator_1 calc = new Calculator_1();

		if (operator == '+') {
			System.out.println(calc.plus(data1, data2));
		} else if (operator == '-') {
			System.out.println(calc.minus(data1, data2));
		} else if (operator == 'x') { // *는 인식이 안되어 x로 대체
			System.out.println(calc.multiple(data1, data2));
		} else if (operator == '/') {
			try {
				System.out.println(calc.devide(data1, data2));
			} catch (ArithmeticException e) {
		System.out.println(e.getMessage()+"Exception 발생 하였습니다. 다시 입력해 주세요");
			}
		}
	}
}

//try{ 
//	}	catch { 
//	System.out.println(calc.devide(data1, data2));
//	public double devide(double a, double b) throws ArithmeticException{
//		double result = 0.0;
//			result = a / b;
//			return result;
//		}
//	}
//	}
//}
//}
