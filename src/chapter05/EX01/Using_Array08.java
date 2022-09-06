package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {
	public static void main(String[] args) {
		/*
		 * 정수 배열 방 10개를 생성하고 임의의 값을 10개의 방에 저장 그 중 최댓값을 뽑아서 출력 하는 프로그램을 생성해 보세요.
		 *  출력 : 배열방 10개에서 최댓값은 : 000
		 */

		int[] i = new int[10];
		System.out.print("정수 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		i[0] = sc.nextInt();
		int max = i[0];
		int min = i[0];

		for (int a = 1; a < i.length; a++) {
			int b = sc.nextInt();
			i[a] = b;

			if (i[a] > max) {
				max = i[a];
			}
			if (i[a] < min) {
				min = i[a];
			}
					
		
			
		}
		System.out.println(" 배열방 10개에서 최대값은 : " + max);
		System.out.println(" 배열방 10개에서 최소값은 : " + min);
		
		System.out.println("==2번째 방법은 Arrays.sort() 메소드를 사용해서 출력==");
		Arrays.sort(i);	//배열 방의 값을 정렬을 한다. 0 ( 최소값 ) ,1 , 2, 3 ,4 ,5, 6, ... arr.length -1
		System.out.println("최대값 : " + i[i.length-1]);	//최대값
		System.out.println("최소값 : " + i[0]);
		
		System.out.println("===Stream을 사용하는 경우===");
		System.out.println("최대값 : " + Arrays.stream(i).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(i).min().getAsInt());
	}
	
}
