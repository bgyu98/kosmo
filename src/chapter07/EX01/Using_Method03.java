package chapter07.EX01;

public class Using_Method03 {
	
	//인스턴스 필드 : 객체화 해야만 사용가능
	int c;		//인스턴스 필드 : static 키가 붙지 않는 필드(객체화를 해야 사용 가능)
	int d;
	//static field : 객체화 하지 않고 바로 사용 가능
	static int e;
	static int f;
	
	//인스턴스 메소드 : 객체화 해야만 사용 가능
	void abc() {
		System.out.println("abc() 메소드 호출 ");
	}
	
	//static 메소드 : 객체화 없이 호출이 가능
	static void def() {
		System.out.println("def() 메소드 호출 ");
	}
	
	//static 메소드 내부에 인스턴스 메소드를 바로 사용할 수 없다. 객체화 하면 사용 가능
	
	
	public static void main(String[] args) {
		Using_Method03 u = new Using_Method03();
		
		// main 메소드도 method이다.
		int a; // 지역 변수이다. <<== Stack에 저장 Stack영역은 강제 초기화가 안됨.
				// Stack에 값이 저장, main 메소드 내에서만 사용됨.

		a = 10;

		System.out.println(a); // 강제 초기화가 되지 않기 때문에 초기값을 넣지 않고 출력시 오류

		// main 메소드 내부에서는 메소드 선언 불가 , 클래스 블럭에서 선언가능
//		오류 발생
//		void abc() {
//			System.out.println("안녕하세요");
		//
		
		//필드명, 메소드명 앞에 static키가 적용되어 있으면 객체 생성없이 호출
		//	static 메소드 내에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
		//	static 메소드 내에서는 static 필드나, static 메소드를 사용할 수 있다.
		
//		c = 5;	//오류 발생 (static 메소드 내부에서 인스턴스 필드 직접 호출 불가능)
		e = 11;	//같은 클래스 내에서 직접 호출, static 필드 호출
		System.out.println(e);
//		abc(); //인스턴스 메소드 / 오류 발생
		def(); //스태틱 메소드 
		
		
		
		
		
		
		
	}

}
