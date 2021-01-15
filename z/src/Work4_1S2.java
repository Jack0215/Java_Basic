public class Work4_1S2{
	public static void main(String[] args) {
		Work4_1S stu01 = new Work4_1S("Kim",10,0,5,8);
		Work4_1S stu02 = new Work4_1S("Lee",60,70,99,98);
		Work4_1S stu03 = new Work4_1S("Park",68,86,60,40);
		Work4_1S [] stuarr = new Work4_1S[3];
		stuarr[0]=stu01;
		stuarr[1]=stu02;
		stuarr[2]=stu03;
		System.out.println("Kin 평균:"+stu01.getAvg()+"학점:"+stu01.getGrade());
	}
}