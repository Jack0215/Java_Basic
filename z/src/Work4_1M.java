
public class Work4_1M {
public static void main(String[] args) {
	Work4_1S [] po = {new Work4_1S("kim",100,90,95,89),
				      new Work4_1S("Lee",60,70,99,98),
				      new Work4_1S("Park",68,86,60,40)};
				   
	for (Work4_1S point : po) {
		System.out.println("이름:"+point.getName()+"평균:"+point.getAvg()
		+"학점:"+point.getGrade());
		}
	}
}
