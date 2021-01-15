package Workshop6_1;

public class Calculator_1 {

	public double plus(int a, int b) {
		double result = a + b;
		return result;
	}

	public double minus(int a, int b) {
		double result = a - b;
		return result;
	}

	public double multiple(int a, int b) {
		double result = a * b;
		return result;
	}
	public double devide(int a, int b)  throws ArithmeticException{
		double result = 0.0;
//		try {
			result = a / b;
//		} catch (ArithmeticException e) {
//			System.out.println("error");
//		}
		return result;
	}
}
