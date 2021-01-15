
public class Multi_Array4_book_p100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] name = { {"홍길동","이순신"}, {"유관순"}};
		for ( int i = 0; i<name.length; i++) {
			for (int j=0; j < name[i].length; j++) {
				System.out.println("name["+i+"]["+j+"]="+name[i][j]);
			}
		}
		
	}

}
