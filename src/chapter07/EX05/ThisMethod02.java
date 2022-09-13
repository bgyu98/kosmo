package chapter07.EX05;

//Aa 클래스 : 여러개의 생성자 사용시 this() 없이 사용한 경우 : 중복된 값을 매번 입력 해야함.

class Aa{
	int m1, m2, m3, m4 ;	//정수 값을 담는 필드4개 선언
	Aa(){	//기본 생성자
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;		//기본값 설정
	}
	Aa(int a){		//매개변수가 하나인 메소드
		m1 = a; m2 = 2; m3 = 3; m4 = 4;
	}
	Aa(int a, int b){	//매개변수가 두 개인 메소드
		m1 = a; m2 = b; m3 = 3; m4 = 4;
	}
	void print() {	// 각 필드의 값을 출력 하는 메소드
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " \n");
		System.out.println("========");
	}
}
//Bbb 클래스 : 여러개의 생성자 사용시 this()를 사용한 경우 : 중복된 값을 제정
class asdf{
	int m1, m2, m3, m4;
	asdf(){
		m1 = 1; m2 = 2; m3 = 3; m4 =4;
	}
	asdf(int a){
		this();
		m1 = a;
	}
	asdf(int a, int b){
		this(a);
		m2 = b;
	}
	asdf(int a, int b, int c){
		this(a,b);
		 m3 = c;
	}
	asdf(int a, int b, int c, int d){
		this(a,b,c);
		m4 = d;
	}
	void print() {
	System.out.print(m1 + " ");
	System.out.print(m2 + " ");
	System.out.print(m3 + " ");
	System.out.print(m4 + " \n");
	System.out.println("========");
	}
}

public class ThisMethod02 {

	public static void main(String[] args) {
		// 1. 3개의 객체 생성(this 미사용)
		Aa aaa1 = new Aa();
		aaa1.print();
		
		Aa aaa2 = new Aa(10);
		aaa2.print();
		
		Aa aaa3 = new Aa(10, 20);
		aaa3.print();
		
		asdf bbb1 = new asdf();
		bbb1.print();

		asdf bbb2 = new asdf(10);
		bbb2.print();
		
		asdf bbb3 = new asdf(10,20);
		bbb3.print();
 
		asdf bbb4 = new asdf(10,20,30);
		bbb4.print();
		
		asdf bbb5 = new asdf(10,20,30,40);
		bbb5.print();
		
		
	}

}
