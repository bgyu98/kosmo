package chapter07.EX01;

import java.util.Arrays;

public class Using_Method05 {

	//배열을 매개변수로 가지는 메소드
	static void printArray(int [] a) {
		System.out.println(Arrays.toString(a));
	}
	static void printArray2(int [][]a ) {
		System.out.println(Arrays.toString(a));
	}
	static void printArray(String[]s) {
		//메소드의 매개변수로 들어온 배열을 출력
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
	}
		
	
	
	
	public static void main(String[] args) {
		// 배열을 매개변수로 가지는 메소드

		//배열을 매개변수로 가지는 메소드 호출
//		int [][]a = new int[][] {{1,2,3},{4,5,6}};
		
		printArray2(new int[][] {{1,2,3},{4,5,6}});		//메소드 호출시 배열 변수에 값을 할당
		
		printArray(new int[] {4,5,6});		//객체 생성시 배열 변수에 값을 인풋
		int []a = new int[] {1,2,3};
		printArray(a);
		
//		printArray({7,8,9});		//오류 발생 선언과 값을 분리할 수 없어서 오류
		
		//String
		System.out.println("=====================");
		String []s = new String[] {"dd", "ddd", "dddd"};
		printArray(s);
		
		printArray(new String[] {"내일", "부터" , "추석", "연휴", "입니다."});
		
//		printArray({"내일", "부터" , "추석", "연휴", "입니다."});		/오류
		
		
	}

}
