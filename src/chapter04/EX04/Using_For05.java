package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {
	public static void main(String[] args) {
		// 이중 for문을 이용해서 1단~ 9단까지 출력.
		/*
		 * 1*1=1 1*2=2 1*3=3
		 */

		for (int f = 1; f < 10; f++) {
			for (int s = 1; s < 10; s++) {
				System.out.print(f + "*" + s + "=" + f * s + "\t");
			}
			System.out.print("\n");

		}
		System.out.println("==================");

		// 1단~19단 까지 3의 배수만 출력
		int f = 0;
		int s = 0;
		for (f = 1; f < 20; f++) {
			for (s = 1; s < 20; s++) {
				if (f % 3 == 0) {
					System.out.print(f + "*" + s + "=" + f * s + "  ");
				}
			}
			System.out.println();
		}
		// 스캐너에서 입력 받은 단만 출력 (1~9단)
		// 출력할 단을 입력 하세요 (1~9단)>>>
		// ====
		// 1*1=1
		// 1*2=2
		// ...
		// 1*9=9

		int a = 0;
		int asdfasdfasdfb = 0;
		System.out.println("출력할 단을 입력 하세요 (1~9단)>>>");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for (asdfasdfasdfb = 1; asdfasdfasdfb < 10; asdfasdfasdfb++) {
			System.out.println(a + "*" + asdfasdfasdfb + "=" + a * asdfasdfasdfb);
		}
		sc.close();

	}
}
