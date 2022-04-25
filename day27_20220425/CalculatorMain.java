package day27_20220425;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// add1 메서드를 호출
		
		Calculator cal1 = new Calculator();
		// 리턴이 있는 메서드를 호출 할 때는 호출결과 처리를 위한 코드 필요
		int result = cal1.add1();
		System.out.println(result);

		//add2 메서드 호출
		result = cal1.add2(10,20);
		System.out.println(result);
		
		// add2 값을 변수로 넘겨주고 싶을 때
		int num1 = 10;
		int num2 = 20;
		result = cal1.add2(num1,num2);
		System.out.println(result);
		
		//add3 메서드 호출 (리턴이 없으면 호출만 하고 끝나도 됌)
		cal1.add3();
		
		//add4 메서드 호출
		cal1.add4(10, 20);
		
		//add5 메서드 호출
		String strResult = cal1.add5();
		System.out.println(strResult);
		
		//add6 메서드 호출
		strResult = cal1.add6("모찌",4);
		System.out.println(strResult);
		
		//add7 메서드 호출
		boolean boolResult = cal1.add7(num1, num2);
		System.out.println(boolResult);
		
	}
}
