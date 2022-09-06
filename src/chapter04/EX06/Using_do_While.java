package chapter04.EX06;

public class Using_do_While {
	public static void main(String[] args) {
		
//		While : 조건을 비교 후 실행문을 실행;
/*		while (조건) {
			실행문;
		}
		*/
		
		
//		do while : 1번은 실행후 조건을 비교후 실행;
			/*
			  do {
				실행문
			}while(조건);
			*/
		
		
//		1. while
		int a ;
		a = 11;
		System.out.println("========while문 ( 조건이 참 일때만 실행문 실행 )=======");
		while(a < 10) {
			System.out.println(a + " ");
			a++;
		}

		System.out.println();
	
		System.out.println("========do while : 조건과 상관없이 실행문을 1번 실행 후 조건이 참이면 반복 ");
		a = 11;
		do {
			System.out.println(a + " ");
			a++;
		}while(a < 10);
		
		
		System.out.println();
//		while 문과 do while 문 10번 실행
		System.out.println("=======while=====");
		
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
			
		}
		System.out.println();
		System.out.println("======do while======");
		
		a = 0;
		do {
			System.out.printf(a + " ");
			a++;
		}while(a < 10);
		
		
		
		
		
		
		
		
		
		
		
	}
}
