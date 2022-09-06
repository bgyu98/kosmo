package chapter04.EX05;

import java.util.Scanner;

public class Using_While02 {
	public static void main(String[] args) {
//		"그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		/*
		 * 1. String s = sc.nextLine(); 인풋 받는다.
		 * 2. s.splite(" "); <== 공백을 기준으로 잘라서 배열에 저장
		 * 3. 문자형 String을 정수형으로 변환, Integer.ParseInt()
		 * 4. 합계와 평균을 구하면 됩니다.
		 */
		
		
		
		
		
		
		
		System.out.println("정수를 입력, '그만'으로 계산 : ");
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		String a = sc.next();
		int b = 0;
		while (true) {
			if(a.equals("그만")) {
				break;}
			b = Integer.parseInt(a);
			sum += b;
			count++;
			a = sc.next();
		}
			if(count == 0) {
				System.out.println("입력된 정수가 없습니다.");
			}else {
				System.out.println("합계 : " + sum + " || 평균 : " + sum/(double)count);
			}
		}
	}

