
public class Work4_1M2 {
	public static void main(String[] args) {
		Work4_1S[] work = { new Work4_1S(null, 0, 0, 0, 0),
							 new Work4_1S("k", 100, 90, 95, 89),
							 new Work4_1S("im", 100, 90, 95, 89)};
		
		for (Work4_1S point : work) {
			System.out.println("이름:" + point.getAvg()+point.getAvg()+point.getGrade());
		
		}
	}
}