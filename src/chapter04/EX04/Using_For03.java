package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {
	public static void main(String[] args) {
		//for문 내에 if 사용
		//정수 (음수, 양수)를 스캐너로 5개 인풋 받아서
		//양수만 더한 값을 출력 하세요.
		
		Scanner sc = new Scanner(System.in);
		int i ;	// 횟수
		int a;	// 스캔받는값
		int b = 0;		// 양수만 더한 값
		int sum = 0; 	// 전체값
		double c = 0;		//양수의 갯수
		for(i = 1; i < 6 ; i++) {
			a = sc.nextInt();
			sum += a;
			if(a > 0) {
				b += a;			
				c++;
			}
		}System.out.println("양수만 더한 값 = " + b );
		System.out.println("평균값 = " + b/c);
		System.out.println("전체값 = " + sum + "전체값의 평균 = " + sum/c);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
