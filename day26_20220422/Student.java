package day26_20220422;

public class Student {
	// 1. 이름(name), 전공(major), 학번(studentNumber), 나이(age) 필드를 가지고 있음.
	// 2. 기본생성자
	// 3. 이름, 나이만 매개변수로 하는 생성자
	//        1. 이름, 나이 필드 값은 매개변수로 전달 받은 값으로 저장하고
	//        2. 전공은 컴퓨터, 학번은 1234로 저장한다.
	// 4. 이름, 전공, 학번, 나이를 매개변수로 하는 생성자
	//        1. 4개의 값을 모두 매개변수로 전달 받아서 필드 값으로 저장함.
	
	String name = "";
	String major = "";
	String studentNumber = ""; //int로 지정할때 학번이 0으로 시작하면 짤릴 수 있기 때문에 스트링 타입
	int age = 0;
	
	// 기본 생성자
	Student(){
		
	}
	
	// 이름, 나이를 매개변수로 하는 생성자
	Student(String name, int age){
		this.name = name;
		this.age = age;
		this.major = "컴퓨터";
		this.studentNumber = "1234";
	}
	
	// 이름,전공,학번,나이를 매개변수로 하는 생성자
	Student(String name,String major,String studentNumber, int age){
		this.name = name;
		this.major = major;
		this.studentNumber = studentNumber;
		this.age = age;
	}
	
	// 필드값 출력을 위한 메서드 
	void studentprint() {
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.studentNumber);
		System.out.println(this.age);
	}
	

}
