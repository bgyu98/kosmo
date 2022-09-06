package chapter04.EX05;

public class Using_While01 {
	public static void main(String[] args) {
		/*
		 * while (조건) { 실행문; }
		 */
		
		/*
		 * while문은 반복 횟수를 알 수 없는 경우 사용.
		 * for문은 반복 횟수를 알 수 있는 경우 사용.
		 * -- 초기값 선언을 반드시 While문 밖에서 선언을 해야 한다. <while 문 내에서 선언시 무한 루프> -- 증가값은 while문
		 * 내에서 선언을 함. <증가값을 선언하지 않으면 무한 루프>
		 */
		
		
//		1. while 문에서 반복 횟수가 0인 경우
		
		System.out.println("=========반복 횟수 0============");
		int a = 0;		//변수의 초기값은 while 밖에서 선언
		while (a < 0) {		//false
			System.out.print(a + " ");	//조건이 true 일때만 실행
		}
		
//		2. while 문에서 반복 횟수가 1 번인 경우 (break 이용)
		
		System.out.println("=========반복 횟수 break ==========");
		a = 0;
		while (a == 0) {
			System.out.print(a + " \n");
			break;
		}
		
//		3. while 문에서 반복 횟수가 1 번인 경우 (증가값 사용)
		System.out.println("=========반복 횟수 증가값 사용 ==========");
		a = 0;
		while (a == 0) {
			System.out.print(a + " \n");
			a++;
			
		}
		System.out.println("========반복 횟수 10번 ========");
		a = 0;
		while ( a < 10 ) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		System.out.println("====초기값을 while 문 내에 넣는 경우 : <무한루프> ");
		
		while ( a < 10 ) {
			a = 0;
			System.out.print(a + " ");
			a++;
		}
//		while 문은 조건을 생략 할 수 없다.
//		for 문은 조건 생략시 무한루프
//		while 문에서 무한 루프를 돌릴때 조건에 true
		
		System.out.println();
		System.out.println("=====");
		
		a = 0;
		boolean b;
		b = true;
		while (b) {
			System.out.print(a + " ");
			a++;
			if(200 < a) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
