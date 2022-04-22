package day26_20220422;

public class HumanMain {

	public static void main(String[] args) {
		// Human 클래스에 대한 객체(인스턴드) 생성
		// [클래스이름] [객체이름(내맘대로)] = new [클래스생성자];
		Human human1 = new Human();
		// human1 객체에 정보를 담아봅시다.
		System.out.println(human1.name);
		human1.name = "김모찌";
		System.out.println(human1.name);
		
		Human human2 = new Human();
		System.out.println(human2.name);
		
		Human human3 = new Human("안녕");
		System.out.println(human3.name);
		
		Human human4 = new Human(4);
		
		String var1 = "ㅎㅎㅎ";
		Human human5 = new Human(var1);
		
		Human human6 = new Human("모찌",4,"인천","여");
		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.local);
		System.out.println(human6.gender);
		
	
		
	}
}
