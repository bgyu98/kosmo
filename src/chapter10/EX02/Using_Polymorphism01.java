package chapter10.EX02;

//다형성 (Polymorphism) : 하나의 객체가 여러가지 타입을 가질 수 있다.
//		- 메소드 오버라이딩을 사용해서 부모 클래스의 메소드를 재정의 해서 지식 클래스에서 재사용한다.
//

// 상속을 사용한 다형적 표현
	// - 상속 관계에서 객체를 생성시 부모 타입으로 선언 할 수 있다.
	// - 부모 타입으로 선언 하면 부모 클래스의 필드와 메소드만 사용 가능.
	// - 자식 객체를 생성하면서 부모 타입으로 지정하면 업캐스팅이 자동으로 된다.
	// - 다시 자식 클래스의 필드와 메소드를 사용하려면 다운캐스팅을 해야 사용 가능하다.
	// - 다운캐스팅은 수동으로 해야한다.

class A {}		//부모 클래스 (Super class)
class B extends A{}		//자식 클래스 (child class) , 부모 == A
class C extends B{}		//자식 클래스 , 부모 == B
class D extends B{}		//자식 클래스 , 부모 == B

public class Using_Polymorphism01 {

	public static void main(String[] args) {
		// 1. A 타입의 다형적 표현
		A a1 = new A();		//A 클래스는 A 타입이다. A는 A이다.
		A a2 = new B();		//B 클래스는 A 타입이다. B는 A이다.
		A a3 = new C();		//C 클래스는 A 타입이다. C는 A이다.
		A a4 = new D();		//D 클래스는 A 타입이다. D는 A이다.
		
		
		

	}

}
