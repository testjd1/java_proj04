package chapter03.EX01;

public class ArthimeticOperator {

	public static void main(String[] args) {
/*     	
 			 연산자

*/	
/*	
		// 1) 산술 연산자 ( +, -, *, /, % )
		System.out.println(2+3);				// 덧셈
		System.out.println(8-5);				// 뺄셈
		System.out.println(7*2);				// 곱셈
		System.out.println(7/2);				// 몫만 출력
		System.out.println(7/2.0);
		System.out.println(8%5); 				// 나머지 값만 출력
*/		
/*
		// 2-1) 증감 연산자1
		// ++ : 증가 , -- : 감소
		
		int value1 = 3;
		value1++;
		System.out.println(value1);
		
		int value2 = 3;
		++value2;
		System.out.println(value2);
*/		
/*		
		// 2-2) 증감 연산자2
		int value3 = 3;
		int value4 = value3++;
	
		System.out.println(value3);					// 4
		System.out.println(value4);					// 3
		System.out.println("=======================");
		int value5 = 3;
		int value6 = ++value5;
		
		System.out.println(value5);					// 4
		System.out.println(value6);					// 3
*/
/*	*/	
		// 2-3) 증감연산자3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;		// 2 + 3 + 5
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);

	}

}
