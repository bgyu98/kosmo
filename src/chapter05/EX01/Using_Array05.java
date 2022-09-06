package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {
	public static void main(String[] args) {
		//1~500 까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력 2.for문 출력 3.Enhanced For, 4.toString
		// 합계 : 	평균 :
		
		int[] a = new int [166];
		int count = 0;
		for (int i = 0, j = 1; j <= 500; i++,j++) {
			if(j % 3 == 0) {
				a[i] += j;
				count++;
			}else {
				i--;
			}
		}
		System.out.println("직접 출력");
		System.out.print(a[0] + " ");
		System.out.print(a[1] + " ");
		System.out.print(". " + ". " + ". ");
		System.out.print(a[100] + " ");
		System.out.print(a[165] + " \n\n");
		System.out.println("for문 출력");
		for(int i = 0, j = 1; j <= 500; i++,j++) {
			if(j == 500) {
				a[i] = j*3;
				break;
				}if(i == 166) {
					break;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Enhanced For 출력");
		for(int k : a) {
			System.out.print(k + " ");
		}
		System.out.println("\n");
		System.out.println("Arrays 출력");
		System.out.println(Arrays.toString(a));
		
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/(double)count);
		
		
		
		
	}
}
