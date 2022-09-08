package chapter07.EX03;

class A{
	//클래스 내부에 생성자가 존재하지 않는 경우 컴파일러가 기본 생성자를 자동으로 만들어 준다.
	//A () {}
	
	//필드(인스턴스 메소드: 객체를 생성후 사용(호출)
	int m;
	
	//메소드
	void work() {
		System.out.println(m);
	}

}
class B{
	//필드
	int m;
	
	//생성자
	B () {};		//기본생성자 : 명시
	
	//메소드
	void work() {
		m += 1;
		System.out.println(m);
	}
}

class C{
	//필드
	int m;
	//생성자 : 매개변수가 하나인 생성자
		//클래스 내부에 생성자가 존재하면 컴파일러는 생성자를 넣지 않는다.
	C() {};
	C(int a){			//입력 매개변수, 입력 매개변수를 받는 변수, 필드의 변수 3개의 이름이 동일할때. 필드의 변수에 this.를 사용해야 한다.
		this.m = a;
	}
	//메소드
	void work() {
		System.out.println(m + 10);
	}
}


public class Using_Constructor01 {

	public static void main(String[] args) {
		// 객체 생성
		A a = new A();			//기본 생성자 호출 : A()
		a.m = 10;
		System.out.println(a.m);
		a.work();
		System.out.println("====");
		
		B b = new B();
		System.out.println(b.m);
		b.work();
		System.out.println("====");
		
		
		C c = new C(10);		//오류 발생 : 생성자가 클래스 내부에 하나라도 있으면 생성자를 자동으로 넣지 않는다.
		System.out.println(c.m);
		c.work();
		System.out.println("====");
		
		

	}

}
