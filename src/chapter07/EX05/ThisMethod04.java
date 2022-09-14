package chapter07.EX05;

import chapter05.EX03.ArgumentOfMainMethod;

class Car{
	
	//this 키워드 : 필드나 메서드 선언시 사용 불가.
//				-- 생성자, 메서드 내부에서 필드나 메서드를 사용할 때 자신의 객체 필드나 메서드를 지칭
	// 			-- 자신의 객체의 필드, 메서드를 가르킨다. 기본적으로 생략해서 많이 사용.
	// 	this()	-- 생성자 내부에서만 사용, 반드시 첫 라인에 위치
	//			-- 자신의 객체의 다른 생성자를 호출
	//			-- 생성자를 오버라이딩 할 때 코드를 간략하게 사용
	
	String companyName;		//현대
	String color;			//검은
	double maxSpeed;		//200.0 Km/h
	
	//생성자
	Car(){		//리턴 타입이 없다, 클래스 이름과 동일
		companyName = "현대자동차";
		color = "검은색";
		maxSpeed = 200;
	}
	Car(String companyName){
		this();
		this.companyName = companyName;
	}
	Car(String companyName, String color){
		this(companyName);
		this.color = color;
	}
	Car(String companyName, String color, double maxSpeed){
		this(color);
		this.maxSpeed = maxSpeed;
	}
	void print() {
		System.out.println(companyName +"\n"+ color +"\n"+ maxSpeed + "Km/h");
	}
}



public class ThisMethod04 {
	public static void main(String[] args) {
		//1. 매개 변수 0개일때, 기본 필드의 값 출력 
		Car car1 = new Car();
		car1.print();
		
		System.out.println("===1개===");
		Car car2 = new Car("기아자동차");
		car2.print();
		
		System.out.println("===2개===");
		Car car3 = new Car("기아자동차", "하얀색");
		car3.print();
		
		System.out.println("===3개===");
		Car car4 = new Car("쌍용자동차", "파란색", 250);
		car4.print();
		
		
	}
}
