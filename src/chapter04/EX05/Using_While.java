package chapter04.EX05;

import java.util.Scanner;

public class Using_While {
	public static void main(String[] args) {
//		스캐너를 사용해서 -1이 될 때까지 정수값을 넣어서 평균
		
		System.out.println("입력");
		Scanner sc = new Scanner(System.in);
		int count = 0;	//정수가 입력되는 갯수를 카운트하는 변수
		int sum = 0;	//입력 받는 정수를 모두 더한 값
		
		int n = sc.nextInt();	//콘솔에서 정수값을 입력 받아 n 변수에 할당.
		
		while(n != -1) {	//입력 받은 정수 값이 - 1이 아니면 while 문을 실행
			sum += n ;		//sum = sum + n;
			count ++;	//정수 값을 count함.
			n = sc.nextInt();		//-1이 입력되면 루프를 빠져나옴
		}if(count == 0) {
			System.out.println("입력된 정수가 없습니다.");
		}else {
			System.out.println("입력된 정수는 : " + count + "개 입니다.");
			System.out.println("입력된 정수의 합은 : " + sum + "입니다.");
			System.out.println("평균은 : " + sum/(double)count + "입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
