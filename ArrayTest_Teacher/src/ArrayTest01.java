class ArrayTest01 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
		Print_Arr test = new Print_Arr();//기본생성자 호출객체 생성
		sum=test.printArr(arr);  //함수 호출, 합 계산 반환 
		System.out.println("총합=" + sum);
		System.out.println("평균="+ test.getAvg());
//		System.out.println("avg=" + sum / arr.length);
	}
}
