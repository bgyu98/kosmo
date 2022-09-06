package chapter04.EX01;

public class If_01 {
	public static void main(String[] args) {
		/*
		 * 제어문 : 프로그램의 순서를 바꾸는 구문
		 * 	- 선택 제어문 : if, switch
		 * 	- 반복 제어문 : for, while, do while
		 * if 
			-if ( 조건 ) { 실행문1; } ;	//조건이 참일때 실행문1을 실행
			
			-if ( 조건 ) { 
			 실행문1;		//실행문1 : 조건이 참일때
			 }else {
			 실행문2;		//실행문2 : 조건이 거짓일때
			 }
			 
			 if : 조건을 만족하는 실행문을 실행후 if문을 빠져나온다.	
			  break를 사용하지 않더라도 if문을 빠져나온다.
			 	switch문은 break를 사용해서 구문을 빠져나온다.
			 
			 - if ( 조건1 ) {			//조건1이 참일때, 실행문1을 실행
			 	실행문 1; 
			 } else if ( 조건2 ){		//조건2가 참일때, 실행문2를 실행
			 	실행문 2;
			 } else if ( 조건3 ){		//조건3가 참일때, 실행문3을 실행
			 	실행문 3;
			 }
			 .....
			 } else {				//위의 모든 조건을 만족하지 않을때 실행문10을 실행
			 	실행문10;
			 }
			 
		 */
		
		//if (조건) { 실행문1 }
		
		System.out.println("=====조건이 false일때========");
		if (3 > 5)	{
			System.out.println("안녕");
			System.out.println("방가");
		}
		System.out.println("======조건이 true일때=======");
		if (3 < 5)	{
			System.out.println("안녕");
			System.out.println("방가");
		}
		
		//if 조건에서 실행문이 1개 일때는 중괄호를 생략할 수 있다.
		System.out.println("=============");
		if( 5 > 3 ) {
			System.out.println("오늘은 비가 옵니다.");
			System.out.println("비가 보슬 보슬 옵니다. ");
		}
		
		/*2.if( 조건 ) {
			실행문1;			//조건이 참일때 실행문 1 실행
			}else {
			실행문2;			//조건이 거짓일때 실행문 2 실행			
			}
			
		*/
		System.out.println("====");			
		if (5 > 3) {		//조건은 반드시 true나 false가 나오게
			System.out.println("true");		//조건이 참일때 실행
		}else {
			System.out.println("false");	//조건이 거짓일때 실행
		}
		System.out.println("====");
		//변수 선언 : 동일한 변수를 여러개 선언시 ' , ' 로 구분
		//	- 기본 자료형 (8가지) : 초기값을 할당하지 않으면 오류 발생
						//boolean, byte, short, int, long, float, char, double, char
		//	- 참조 자료형 (무한대) : 초기값을 할당하지 않으면 컴파일러가 자동으로 넣어줌 
						//String (문자열) <== 참조 자료형
		int a , b;	//변수 선언만 한 경우
		//System.out.println(a);		//변수의 값을 할당하지 않고 출력
		a = 5; b = 0;		//변수에 초기값 할당.
		if (a > 5) {
			b = 10;
		}else {
			b = 20;
		}
		System.out.println(b);
		
		//if (조건) ~ else 구문을 삼항 연산자로 변환
		System.out.println("==삼항연산자==");
		System.out.println(a > 5 ? 10 : 20);
		
		//	3.조건이 여러개인 경우 : if (조건) ~ else if (조건) ~ else 구문
		//	 : 해당 조건을 만족하는 실행문을 실행후 if문을 탈출
		System.out.println("==================");
		int c;
		c = 55;
		
		if (c >= 90) {
			System.out.println("A학점입니다.");
		}else if (c >= 80) {
			System.out.println("B학점입니다.");
		}else if (c >= 70) {
			System.out.println("C학점입니다.");
		}else if (c >= 60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		
		System.out.println("if문 탈출됨");
		
		
		
		
	}
}
