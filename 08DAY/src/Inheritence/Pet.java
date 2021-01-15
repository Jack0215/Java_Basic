package Inheritence;
//공통적인것  name,age
//pet class생성
//get,set 추가
//ㄴ용 찍을 수 있는 print info
//인자 2개짜리 생성자 추가

//2번째 extends cat
//중복되는거 지우고, 유일속성만 기재
//생성자 3개짜리 만들기(name, age, gender), get,set 필요함
//printinfo(name, age, gender)
public class Pet {

		String name;
		int age;
		
		
		
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Pet() {}
		
//		다른클래스에서 pet pet = enw per()하면 pet클ㄹ스에 있는 public pet(){}을 생성함 (jvk가 자동으로)
//				만약 안 적을 경우
//				생성자가 아무없도 없고, public pet() 자동 생성
//
//				인위로 public pet(string name)을 만들면 jvk가 이거만 쓰는줄 알고 자동으로 빈거 생성 안함
//
//				만약 extends하면
//				생성자 밑에 super()가 자동 생성 = 부모의 defalult 생성자 호출 = 안적어줘도 생성
//
//				super () 부모의 default 생성자 호출
//
//
//				456을 400으로 출력(워크샵 1번에 2번)
//				스캐너클래스
		public Pet (String name, int age) {
			this.name=name;
			this.age=age;
		}
		
		public String printInfo() {  //voidfmf string을로변경하면 cat, dog 도 다 맞춰 줘야함
			System.out.println("pet printInfo() 호출=========");

			return name+"\t"+age;
//			System.out.println(name + " " + age);
//			return name + " " + age;
		}
	
		
}
