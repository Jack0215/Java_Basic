
public class total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		total2 arr [] = new total2[3];
		arr[0] = new total2("홍길동",15,170,80);
		arr[1] = new total2("한사람",13,180,70);
		arr[2] = new total2("임걱정",16,175,65);
		
		System.out.println("이름 \t 나이 \t 신장\t 몸무게");

		double tage = 0;
		double theight = 0;
		double tweight = 0;
		
		int maxage = 0;
		int minage = 0;
		int maxheight = 0;
		int minheight = 0;
		int maxweight = 0;
		int minweight = 0;
		
		for ( int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].studentInfo());
			
			tage += arr[i].getAge();
			theight += arr[i].getHeight();
			tweight += arr[i].getWeight();
			
			if(arr[maxage].getAge()<arr[i].getAge()) {
				maxage=i;
			}
			
			if(arr[minage].getAge()<arr[i].getAge()) {
				minage=i;
			}
			
			if(arr[maxweight].getAge()<arr[i].getAge()) {
				maxweight=i;
			}
			
			if(arr[minweight].getAge()<arr[i].getAge()) {
				minweight=i;
			}
			if(arr[maxheight].getAge()<arr[i].getAge()) {
				maxheight=i;
			}
			if(arr[minheight].getAge()<arr[i].getAge()) {
				minheight=i;
			}
		}
		System.out.println();
		System.out.println("나이가 가장 많은 학생:"+arr[maxage].getAge());
		System.out.println("나이가 가장 적은 학생:"+arr[minage].getAge());
		System.out.println("신장이 가장 큰 학생:"+arr[maxheight].getHeight());
		System.out.println("신장이 가장 작은 학생:"+arr[minheight].getHeight());
		System.out.printf("나이 평균:%.2f", tage/arr.length);
	}
}