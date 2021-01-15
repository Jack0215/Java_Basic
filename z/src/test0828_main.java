public class test0828_main {
	public static void main(String[] args) {
		test0828 [] stu = new test0828 [3];
		stu[0]=new test0828("홍길동",15,170,80);
		stu[1]=new test0828("한사람",13,180,70);
		stu[2]=new test0828("임걱정",16,175,65);
		
		int MaxAgeIndex=0;
		
		for(int i=0; i<stu.length; i++) {
			if(stu[MaxAgeIndex].getAge()<stu[i].getAge()) {
				MaxAgeIndex = i;
			}
		}
		System.out.println(stu[MaxAgeIndex]);
	}
}