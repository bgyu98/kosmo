package chapter07.EX03;

class Aaa {
	// 필드
	int a;
	int b;
	int c;
	int d;
	String name;

	// 생성자
	// 1. 기본생성자
	Aaa() {
		System.out.println("기본생성자 호출 ");
	}

	Aaa(int a) {
		this.a = a;
	}

	Aaa(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Aaa(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	Aaa(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	Aaa(int a, int b, int c, int d, String e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = e;
	}

	// 메소드
	void show() {
		System.out.println("|| a : " + a + " || b : " + b + " || c :  " + c + " || d : " + d + " ||");
		System.out.println("name : " + name);
		
	}
	//

}

public class Using_Constructor02 {

	public static void main(String[] args) {
		// Constructor (생성자) 오버로딩
		
		//객체 생성
		Aaa Aaa1 = new Aaa();
		Aaa1.show();
		System.out.println("====");
		
		//매개변수 1개인 기본 생성자 호출
		Aaa Aaa2 = new Aaa(10);
		Aaa2.show();
		System.out.println("====");
		
		//매개변수 2개인 기본 생성자 호출
		Aaa Aaa3 = new Aaa(10, 20);
		Aaa3.show();
		System.out.println("====");
		
		//매개변수 3개인 기본 생성자 호출
		Aaa Aaa4 = new Aaa(10, 20, 30);
		Aaa4.show();
		System.out.println("====");
		
		//매개변수 4개인 기본 생성자 호출
		Aaa Aaa5 = new Aaa(10, 20, 30, 40);
		Aaa5.show();
		System.out.println("====");
		
		//매개변수 4개 + name 기본 생성자 호출
		Aaa Aaa6 = new Aaa(10, 20, 30, 40, "홍길동");
		Aaa6.show();
		System.out.println("====");
		
	}

}
