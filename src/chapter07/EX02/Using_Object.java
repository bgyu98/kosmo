package chapter07.EX02;

//class 외부에 올 수 있는것 : 패키지, 임포트(다른 패키지),외부 클래스

class A{ //클래스 : 객체를 생성하기 위한 설계도
	//클래스 내부에 올 수 있는것 : 1. 필드 (클래스에서 선언된 변수) 2. 생성자 3. 메소드 4. 이너(내부)클래스 
	int m;
	int n;
	double k;
	String l;
	
	//생성자 : 클래스는 반드시 생성자가 존재해야 한다.  특징 : 1. 클래스 이름과 동일 2. 리턴이 존재하지 않아야 한다.
	//			기본 생성자(입력 매개변수가 없는 생성자)는 생략 될 수 있다. A() {}
	//			객체 생성시 생성자 호출
	//			객체의 초기값을 셋팅
	//			기본 생성자는 생략되어 있을 경우 컴파일러가 자동으로 만듦
	//			클래스 내부의 다른 생성자가 존재할시 컴파일러가 기본 생성자를 자동으로 만들어 주지 않는다.
	A () {
		System.out.println("기본 생성자 호출");
	}
	//메서드 : 리턴타입 메서드명 (입력매개변수) {실행코드;}
	//			프로그램의 기능을 코드로 작성
	//			호철해서 작동됨, work1()
	void work1() {
		System.out.println("work1메서드 호출");
	}
	//work2(정수2개 매개변수)
	int work2(int a, int b) {
		System.out.println("work2 메서드 호출");
		return a+b;
		
	}
	//work3
	double work3 (int a, double b, String c) {
		System.out.println("work3 메서드 호출");
		System.out.println(a + " , " + b + " , " + c);
		return a + b ;
	}
	
	String work4 (String a) {
		
		return a;
	}
	
}



public class Using_Object {
	public static void main(String[] args) {
		//객체 생성 : main 메소드에서 생성
		
		A a1 = new A();
		//A : 클래스
		//a1 : 객체
		//new : 객체를 생성해라, Heap에 객체를 생성해라
		//A(); : 클래스 내부에 생성자 호출, 기본생성자 : 입력 매개변수가 없는 생성자, 생략가능
		
		//객체의 필드값 출력
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		
		//객체의 필드의 값을 수정
		a1.m = 5;
		a1.n = 10;
		a1.k = 10.101;
		a1.l = "하기싫다";
		
		//수정 후 출력
		System.out.println("=====값 수정 후=====");
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		System.out.println("======================");
		
		//메서드 호출
		a1.work1();
		int k = a1.work2(2,3); 
		System.out.println(k);
		System.out.println(a1.work2(4, 7));
		
		System.out.println("=======================");
		
		//메서드 호출 (work3(정수,실수,문자열)) - return double
		double d = a1.work3(10,20.221,"오늘");
		System.out.println(d);
		System.out.println("================");
		System.out.println(a1.work3(30, 30.3, "날씨"));
		System.out.println("==================");
		
		//메서드 호출 (work4(문자열)) - 리턴 String
		
		String s = a1.work4("안녕");
		System.out.print(s);
		System.out.println(a1.work4("하세요"));
		
		//	클래스 	: 객체를 생성하기 위한 설계도
		//	객체 		: 클래스를 기반으로 만들어진 인스턴스
		//	인스턴스화 	: 클래스는 객체화 해야 사용 가능 하다. ex) A a = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		
		
		
		
		
		
	}
}
