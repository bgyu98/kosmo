package chapter05.EX02;

public class Using_Array_2D {
	public static void main(String[] args) {
		//2차원 배열을 출력
		
		int[][] arr1 = new int[][] {{1,2,3,4,5},{6,7},{8,9,10},{11,12}};
		
		//직접 출력
		System.out.print("첫 행열" + arr1[0][0] + " \n" +"마지막 행열" + arr1[3][1]);
		System.out.println();
		System.out.println("행의 갯수" + arr1.length);
		for(int i = 0; i < 4; i++) {
			System.out.printf("%d번째 행의 열의 갯수 : " + arr1[i].length ,i);
			System.out.println();
		}
		
		//for 문을 사용해서 출력
		System.out.println("-----for 문을 사용해서 출력-----");
		for(int i = 0; i < arr1.length; i++) {
			for(int ii = 0; ii < arr1[i].length; ii++) {
				System.out.print(arr1[i][ii] + " ");
			}
			System.out.println();
		}
		System.out.println("\n" + "===========================");
	
		//Enhanced for 문을 사용해서 출력
		System.out.println("-----Enhanced for 문을 사용해서 출력-----");
		for(int[] k : arr1) {
			for(int kk : k) {
				System.out.print(kk + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
