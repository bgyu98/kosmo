package chapter04.EX06;

import java.util.Scanner;

public class Using_do_While03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;
		
		do {
			System.out.println("==================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("==================================================");
			System.out.println("원하는 숫자를 선택 하세요 >>");
			nu = sc.nextInt();
			if(nu == 1) {
//				1. 19단 출력
				System.out.println("==1. 19단 출력==");
				int a = 0;	int b = 0;
				for (a = 1 ; a < 20; a++) {
					System.out.println();
					for(b = 1; b < 20; b++) {
						System.out.printf(a + "*" + b + "=" + a*b + "  ") ;
					}
				}System.out.println();
			}else if (nu == 2) {
//				2. 홀수단 출력
				System.out.println("==2. 홀수단 출력==");
				int	a = 0; int b = 0;
				for(a = 0; a < 19; a++) {
					a++;
					System.out.println();
					for(b = 1; b < 20; b++) {
						System.out.printf(a + "*" + b + "=" + a*b + "  ") ;
					}
				}System.out.println();
			}else if (nu == 3) {
//				3. 3의 배수단 출력
				System.out.println("==3. 3의 배수단 출력==");
				int a = 0; int b = 0;
				for(a = 1; a < 19; a++) {
					a++; a++;
					System.out.println();
					for(b = 1; b < 20; b++) {
						System.out.printf(a + "*" + b + "=" + a*b + "  ") ;
					}
				}System.out.println();
			}else if (nu == 4){
				break;
			}System.out.println();
		}while(run);
		System.out.println("프로그램 종료");
		sc.close();
	}
}








