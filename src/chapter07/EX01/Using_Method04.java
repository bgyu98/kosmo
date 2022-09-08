package chapter07.EX01;

public class Using_Method04 {
	
	//같은 클래서에서 메소드 호출
	// - main method는 static 키가 붙은 메소드
	//		static 메소드에서는 인스턴스 메소드를 직접 호출이 불가능(
	
	static void print() {
		System.out.println("안녕");
	}
	static int twice (int k) {		//인풋 값을 두 배로 돌려주는 메소드
		return k * 2;
	}
	static double sum (int m, double n) {		//두 값을 더해서 돌려주는 메소드
		return m + n;
	}
	
	
	public static void main(String[] args) {
		// 클래스 내부에서 메소드 호출
		print();
		System.out.println(twice(7));
		System.out.println(sum(3,4.7));
	}

}
