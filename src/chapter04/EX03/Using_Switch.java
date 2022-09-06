package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch {
	public static void main(String[] args) {
		//switch문 - 반드시 break;를 사용해서 해당 case를 탈출
		
		//switch에서 break; 를 사용하지 않는 경우
		//해당 case로 점프 후에 하위의 모든 case를 실행
		int a = 1;
		
		switch(a){	//(위치변수) : 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력 : " + a);
			break;
		case 2:
			System.out.println("변수 값을 출력 : " + a);
			break;
		case 3:
			System.out.println("변수 값을 출력 : " + a);
		case 4:
			System.out.println("변수 값을 출력 : " + a);
		default:	//if 문의 else와 같이 사용
			System.out.println("변수 값을 출력 : " + a);
		}
		System.out.println("-=-===-==--=-=-=-=-=-==");
		
		
		//switch에서 break; 사용한 경우
		
		System.out.println("입력:");
		int b = 1;
		
		switch(b){	//(위치변수) : 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력 : " + b);
			break;
		case 2:
			System.out.println("변수 값을 출력 : " + b);
			break;
		case 3:
			System.out.println("변수 값을 출력 : " + b);
			break;
		case 4:
			System.out.println("변수 값을 출력 : " + b);
			break;
		default:	//if 문의 else와 같이 사용
			System.out.println("변수 값을 출력 : " + b);
			break;	//일반적으로 default에서 break는 생략된다.
		}
		
		
		//7점 이상인 경우 pass, 그렇지 않는 경우 fail 
		System.out.println("=-=-===-==-=-=-=-=-=-==");
		int c = 8;
		
		switch (c) {
		case 10:
			System.out.println("Pass");
			break;
		case 9:
			System.out.println("Pass");
			break;
		case 8:
			System.out.println("Pass");
			break;
		case 7:
			System.out.println("Pass");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		System.out.println("=======================--");
		//축약 표현
		c = 8;
		switch (c) {
		case 10: case 9: case 8: case 7:
			System.out.println("Pass");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		//switch 문 < === > if ~ else if 문과 상호 변환됨.
		System.out.println("----------------");
		System.out.println("----------------");
		int d = 8;
		
		switch (d) {
		case 10: case 9:
			System.out.println("A 학점");
			break;
		case 8: 
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		default:
			System.out.println("D 학점");
			break;
		}
		
		System.out.println("==========================");
		//위 구문을 if else if 문으로 변환, break 없이도 자동으로 구문을 빠져 나옴.
		d = 7;
		if (d > 9) {
			System.out.println("A 학점");
		}else if (d == 8) {
			System.out.println("B 학점");
		}else if (d == 7) {
			System.out.println("C 학점");		//실행 후 if문을 빠져나온다(break 사용 불필요)
		}else {
			System.out.println("D 학점");
		}
		
		
		
		
		
		
	}
	
}
