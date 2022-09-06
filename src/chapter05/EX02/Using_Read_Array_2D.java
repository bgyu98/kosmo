package chapter05.EX02;

public class Using_Read_Array_2D {
	public static void main(String[] args) {
//		2차원 배열의 값을 읽기(정방형, 비정방형)
//			1차원 배열일때 : arr.length <== 열의 갯수
//			2차원 배열일때 : arr.length <== 행의 갯수
//						 arr[i].length <== 열의 갯수, i : 행의 번호.
		
		int [] arr0 = new int[100];
		System.out.println(arr0.length);
		
//		1. 2차원 배열의 길이 (정방형)
		int[][] arr1 = new int[2][3];
		System.out.println(arr1.length);	//2 <== 행의 갯수
		System.out.println(arr1[0].length);	//3 <== 0행의 열의 갯수
		System.out.println(arr1[1].length);	//3 <== 1행의 열의 갯수
		System.out.println("=====================================");
		
//		2. 2차원 배열의 길이 (비정방형)
		int[][] arr2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(arr2.length);	//2 <== 행의 갯수
		System.out.println(arr2[0].length);	//0번째 행의 열의 갯수
		System.out.println(arr2[1].length);	//1번째 행의 열의 갯수
		
		System.out.println("=====================================");
//		2차원 배열 출력 방법
//		1. 방법 1 : 방 번호를 직접 출력
		System.out.print(arr2[0][0] + " " + arr2[0][1] + " \n");
		System.out.print(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2] + " \n");
		System.out.println("=====================================");
//		2. for 문을 사용해서 출력
		for(int i = 0; i < arr2.length ; i++) {
			for(int ii = 0; ii < arr2[i].length; ii++) {
				System.out.print(arr2[i][ii] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=====================================");
//		3. enhanced for 문을 사용해서 출력
		for(int[] k : arr2) {
			for(int kk : k) {
			System.out.print(kk + " ");
		}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
