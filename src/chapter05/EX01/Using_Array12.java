package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {
	public static void main(String[] args) {
		
		// 1~ 1000까지 배열(arr)에 저장 후
//		1. 배열 선언
//		2. [입력]for문을 사용해서 arr배열 변수에 값을 할당
//		3. [입력]for문을 사용해서 arr배열 변수에 값을 출력
//		4. [출력] Enhanced for 문을 사용해서 값을 출력
//		5. [출력] Arrays.toString(arr)출력
		
//		1.문제
		int[] arr = new int [1000];
//		2.문제
		for (int a = 0, b =1 ; a < 1000; a++, b++) {
			arr[a] = b;
			}
//		3.문제
		System.out.println("for문을 사용해 출력");
		for (int a = 0; a < 1000; a++) {
			System.out.print(arr[a] + " ");
		}
//		4.문제
		System.out.println();
		System.out.println("enhanced for문을 사용해 출력");
		for(int k : arr) {
			System.out.print(k + " ");
		}
//		5.문제
		System.out.println();
		System.out.println("Arrays.toString문을 사용해 출력");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}
}
