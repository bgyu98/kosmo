package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If {
	public static void main(String[] args) {
		// 문제 : Scanner로 국어점수, 영어, 수학, 과학, 음악 점수를 인풋 받습니다.
		//	if문을 사용해서 평균이 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70 >= C학점, 60 >= D학점, 나머진 F학점
		
		System.out.println("국어, 영어, 수학, 과학, 음악 점수를 차례대로 입력해 주세요 : ");
		
		Scanner sc = new Scanner(System.in);
		double aa = sc.nextDouble();
		double bb = sc.nextDouble();
		double cc = sc.nextDouble();
		double dd = sc.nextDouble();
		double ee = sc.nextDouble();
		
		
		
		
		double ff = ( aa + bb + cc + dd + ee ) / 5.0;
		if (ff >= 90) {
			System.out.println("A학점");
		}else if (ff >= 80) {
			System.out.println("B학점");
		}else if (ff >= 70) {
			System.out.println("C학점");
		}else if (ff >= 60) {
			System.out.println("D학점");
		}else 
			System.out.println("F학점");
		System.out.println("점수 : " + ff);
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}
