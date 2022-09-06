package chapter04.EX05;

import java.util.Scanner;

public class Using_While03 {
	public static void main(String[] args) {
//		"그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		/*
		 * 1. String s = sc.nextLine(); 인풋 받는다. 2. s.splite(" "); <== 공백을 기준으로 잘라서 배열에
		 * 저장 3. 문자형 String을 정수형으로 변환, Integer.ParseInt() 4. 합계와 평균을 구하면 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		String s; 
		do {
			System.out.println("각 점수를 공백을 구분해서 넣으세요 >> ");
			s = sc.nextLine();
			if(s.equals("그만")) {break;}
			String[] arr = null;
			arr = s.split(" ");
			int b = 0;
			int sum = 0;
			double count = 0;
			for (int i = 0; i < arr.length; i++) {
					b = Integer.parseInt(arr[i]);
					sum += b;
					count++;
				}
			System.out.println("정수의 갯수 : " + count);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum / count);
		} while (true);
		System.out.println("프로그램을 종료합니다.");

	}
}
