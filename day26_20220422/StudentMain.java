package day26_20220422;

public class StudentMain {

	public static void main(String[] args) {

		// 1. student1: 기본생성자를 호출하여 생성한 객체
		// 2. student2: 매개변수 2개인 생성자를 호출하여 생성한 객체
		// 3. student3: 매개변수 4개인 생성자를 호출하여 생성한 객체

		Student student1 = new Student();
		student1.name = "모찌";
		student1.major = "귀여움";
		student1.studentNumber = "0110";
		student1.age = 4;
//		System.out.println(student1.name);
//		System.out.println(student1.major);
//		System.out.println(student1.studentNumber);
//		System.out.println(student1.age);
		student1.studentprint();
		

		Student student2 = new Student("체리", 6);
//		System.out.println(student2.name);
//		System.out.println(student2.major);
//		System.out.println(student2.studentNumber);
//		System.out.println(student2.age);
		student2.studentprint();

		Student student3 = new Student("앵두", "예쁨", "321", 5);
//		System.out.println(student3.name);
//		System.out.println(student3.major);
//		System.out.println(student3.studentNumber);
//		System.out.println(student3.age);
		student3.studentprint();
	}

}
