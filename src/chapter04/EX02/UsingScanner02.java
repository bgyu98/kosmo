package chapter04.EX02;

import java.util.Scanner;

public class UsingScanner02 {
	public static void main(String[] args) {
		
		System.out.println("당신의 이름을 입력해주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String aa = sc.next();
		System.out.println("나이");
		int bb = sc.nextInt();
		System.out.println("몸무게");
		double cc = sc.nextDouble();
		
		System.out.printf("당신의 이름은 '%s' 이고 나이는 '%d'살 이고 " + "당신의 몸무게는 '%2.2f' Kg 입니다.\n", aa, bb, cc);
		
		System.out.print("당신의 이름은 " + aa + "이고 나이는 " + bb + "이고 몸무게는 " + cc + "입니다.\n");
	
		sc.close();
		
	}
}
