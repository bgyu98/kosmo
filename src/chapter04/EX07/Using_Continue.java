package chapter04.EX07;

public class Using_Continue {
	public static void main(String[] args) {
//		continue : continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
//			- if문과 같이 사용
		
		
//		1. 단일 loop에서 continue
		for (int i = 0; i < 10; i++) {	//0~9 : 10번
			System.out.print("A ");
			{continue;}		//구문을 빠져나가지 않고
//			System.out.println("B ");
		}
		System.out.println("\n" + "====");
		for (int i = 0; i < 10; i++) {	//0~9 : 10번
			System.out.print("A ");
			if (i % 2 == 0) {continue;}	//i : 0 , 2, 4, 6, 8
			System.out.println("B ");
			
			
		}
		System.out.println("====================");
		for(int i = 0; i < 10; i++) {
			if (i == 5 || i == 7) {continue;}
			System.out.print(i + " ");
		}
		System.out.println("====================");
//		1. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3의 배수만 출력 하세요.
//		2. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 5의 배수만 출력 하세요.
//		3. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3,5,7의 배수만 출력 하세요.
		
		for (int i = 1; i < 1001; i++) {
			if(i % 3 != 0) {continue;}
			System.out.println("3의 배수: " + i);
			System.out.println();
		}
		for (int i = 1; i < 1001; i++) {
			if(i % 5 != 0) {continue;}
			System.out.println("5의 배수: " + i);
			System.out.println();
		}
		for (int i = 1; i < 1000; i++) {
			if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {continue;}
			System.out.println("3,5,7의 배수: " + i);
		}
		
//		2. 다중 loop에서 continue
		for(int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				if(k == 3) {continue;}
				System.out.println(i + " , " + k);
			}
		}
		
		System.out.println("=========");
		out:for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				if(k == 3) {continue out;}
				System.out.println(i + " , " + k);
		
		
			}
		}System.out.println("==========");
		out:for(int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				if(k == 3) {
					i = 100;
					continue out;
				}
				System.out.println(i + " , " + k);
	}
}
	}
}
