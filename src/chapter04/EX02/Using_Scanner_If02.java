package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If02 {
	public static void main(String[] args) {
		//점수(score)와 학년(year)을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
		//	4학년인 경우 70점 이상이면 합격, 중첩if문 사용 (if문 내에 if문)
		
		System.out.println("점수와 학년을 차례대로 입력해 주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		int year = sc.nextInt();
		
		if (year == 4) {
			if (score >= 70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			if (score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
