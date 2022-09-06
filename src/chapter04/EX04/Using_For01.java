package chapter04.EX04;

import java.util.Iterator;

public class Using_For01 {
	public static void main(String[] args) {
		
		/*
		 * for (초기값; 조건 ; 증가,증감값){
		 * 		실행문1;			<== 조건이 참 일동안 계속 반복, 거짓이 되면 for문을 빠져나온다.
		 * }
		 * 
		 */
		
		
		//기본 for 문
		int a ;
		for (a = 11 ; a > 3 ; a--) {
			System.out.println(a);
			
		}
		System.out.println("=====================");
		//초기값과 증가값에는 ,로 구분해서 여러개의 변수가 올 수 있다.
		
		int b, c, d;
		for (b = 0, c = 10, d = 20; b < 5; b++, c+=2, d+=5) {		//b:1 씩 증가, c:2 씩 증가, d:5 씩 증가
			System.out.println("| b : " + b + " | c : " + c + " | d : " + d + " |");
			System.out.println("---------------------------");
		}
		
		System.out.println("=====================");
		
		//for 문에서 무한루프	(조건이나 증가값을 잘못 처리할 경우)
		int e;
		for(e = 0; e < 10*5; e += 3*5) {
			System.out.println(e);
			//0 3 6 9
		}
		
		System.out.println("========for문 없이 1~10까지 덧셈============");
		// 1부터 10까지 for 문 없이 덧셈
		
		int sum1;
		sum1 = 0;
		sum1 += 1;		//sum1 = sum1 + 1		== 1
		System.out.println(sum1);
		sum1 += 2;		//sum1 = sum1 + 2		== 3
		System.out.println(sum1);
		sum1 += 3;		//sum1 = sum1 + 3		== 6
		System.out.println(sum1);
		sum1 += 4;		//sum1 = sum1 + 4		== 10
		System.out.println(sum1);
		sum1 += 5;		//sum1 = sum1 + 5		== 15
		System.out.println(sum1);
		sum1 += 6;		//sum1 = sum1 + 6		== 21
		System.out.println(sum1);
		sum1 += 7;		//sum1 = sum1 + 7		== 28
		System.out.println(sum1);
		sum1 += 8;		//sum1 = sum1 + 8		== 36
		System.out.println(sum1);
		sum1 += 9;		//sum1 = sum1 + 9		== 45
		System.out.println(sum1);
		sum1 += 10;		//sum1 = sum1 + 10		== 55
		System.out.println("1~10까지의 합 : " + sum1);
		
		int sum2;
		int i;
		for(sum2 = 0, i = 1; i < 11; i++ ) {
			System.out.println("sum2 : " + sum2 + " | i : " + i);
			sum2 += i;
		}
		System.out.println("sum2의 합: "+ sum2);
		
		
		//for문을 사용해서 0~1000까지 7의 배수의 합계
		//7의 배수의 합계 : 000
		
		int sum3;
		int bb;
		for (sum3 = 0, bb = 1; bb*7 < 1001 ; bb++ ) {
			sum3 += bb*7;
			System.out.println("sum3 : " + sum3 + " | bb : " + bb);
			
		}
		System.out.println("0~1000까지의 7의 배수의 합계 : "+ sum3);
		
		/*
		 * 	int sum3 = 0;
		 * 	
		 * 	for (int aa = 0; aa <= 1000 ; aa += 7){
		 * 		sum3 += aa;
		 * }
		 * System.out.println("0~1000까지의 7의 배수의 합계 : " + sum3);
		 * 
		 */
		
		System.out.println("=====================");
		
		
		
		//for문과 if문을 사용해서 1~10 까지 더한 값을 출력 하되 아래와 같이 출력하세요.
		// 	결과 : 1+2+3+4+5+6+7+8+9+10 = 55
		int sum4 = 0;
		int abc = 0;
		for (abc = 1, sum4 = 0; abc < 11 ; abc++) {
			sum4 += abc;
			if(abc < 10) {
			System.out.print(abc + "+");
			} else {
				System.out.println(abc + " = "+ sum4);
			}

		}
	}
}
		
		
		
		
		
	
