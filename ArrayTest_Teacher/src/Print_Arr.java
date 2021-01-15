
public class Print_Arr {
		private double avg;
		int sum;

		public int printArr(int[] arr) {
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			avg = sum/arr.length;
			return sum;
		}

		public double getAvg() {
			// TODO Auto-generated method stub
			return avg;
	
		}
}