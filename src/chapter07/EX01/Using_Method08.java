package chapter07.EX01;

public class Using_Method08 {

	//가변 길이 배열 입력 매개변수
	static void method1(int...values) {			//가변 길이 배열 입력 매개변수
		for(int k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// 가변 길이 배열 매개변수 (FlexableSizeArray Argument)
		method1(1,2);
		method1(1,2,3,4,5);
		method1(1,2,3,4,5,6,7,8,9,10);
		
	}

}
