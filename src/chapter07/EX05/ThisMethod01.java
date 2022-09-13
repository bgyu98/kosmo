package chapter07.EX05;

class Abc {
	Abc(){		//생성자(기본생성자) : 인풋 매개변수가 없는 생성자
		System.out.println("첫 번째 생성자 - 기본생성자");
	}
	Abc(int a){
		this();		//기본 생성자를 호출 , this()
		System.out.println("두 번째 생성자 호출");
	}
	Abc(int a, String b){
		this(30);	//매개변수가 정수1개인 생성자 호출
		System.out.println("세 번째 생성자 호출");
	}
	Abc(int a, String b , String c){
		this(30, "하권");
		System.out.println("네 번째 생성자 호출");
		
	}
	
	
	
	
	
}

public class ThisMethod01 {

	public static void main(String[] args) {
		// This Method : 자신 클래스의 다른 생성자를 호출
		//		-- 반드시 생성자 내부에서 사용됨. 메소드 내부에서는 사용할 수 없음.
		//		-- 반드시 생성자 첫번째 라인에 위치해야 한다.

		System.out.println("===기본 생성자 호출===");
		Abc abc1 = new Abc();		//기본 생성자 호출
		System.out.println("===매개변수가 1 개인 생성자 호출===");
		Abc abc2 = new Abc(50);
		System.out.println("===매개변수가 2 개인 생성자 호출===");
		Abc abc3 = new Abc(60, "하권");
		System.out.println("===매개변수가 3 개인 생성자 호출===");
		Abc abc4 = new Abc(70, "학원", "싫어");
		
		
		
		
	}

}
