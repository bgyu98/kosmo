package chapter07.EX04;

class Person{
	//class : 객체를 생성하기 위한 템플릿(틀), 붕어빵 기계, 설계도
	//Object(객체, 인스턴스) : 붕어빵, 건축물 <== 인스턴스화(
	
	//1. 필드 : 클래스 블럭에서 선언된 변수(Heap) . 지역변수 : 메소드 블럭에서 선언된 변수(stack)
	String name;
	double height;
	float weight;
	int age;
	
	//2. 생성자 (Constructor) : 1. 리턴타입이 없다. 2. 클래스 이름과 동일(메소드)
		//필드의 기본값을 초기화하는 역할
		//생성자 오버로딩 : 생성자 이름은 동일, 식별자(인풋매개변수 타입, 갯수)
	Person(){}	//기본생성자 : 인풋 값이 비어있는 생성자 , 생략가능
	Person(String s){	//this 키워드 없이 필드에 값 할당. 변수명이 다르다.
		name = s;
	}
	Person(String name, double height){		//this : 인풋 매개변수명, 값을 받는 변수, 필드명
		this.name = name;
		this.height = height;
	}
	Person(String name, double height, float weight, int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		
	}
	//3. 메소드(함수) : 기능을 실행하는 코드가 저장. 호출시 작동, 메소드명();
	void show() {		//필드의 내용을 출력하는 메소드
		System.out.println(name + " , " + height + " , " + weight + " , " + age);
		
		} 
	//4. getter, setter		<<== 필드의 내용을 출력, 필드의 내용을 입력
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Using_Object_review {

	public static void main(String[] args) {
		// 객체 생성 , main method
		
		//1. 기본 생성자 호출
		Person person = new Person();
			//필드 내용 출력(1. 객체 명으로 출력)
		person.name = "바보";
		System.out.println(person.name);
		person.height = 190.1; person.weight = 90; person.age = 24;
		
		//getter를 사용해서 필드의 내용을 출력
		System.out.println("==================");
		System.out.println(person.getName());
		System.out.println(person.getWeight());
		System.out.println(person.getAge());
		System.out.println(person.getHeight());
		
		//show를 사용해서 필드의 내용을 출력
		System.out.println("==============");
		person.show();
		
		//2. 매개변수가 1개인 생성자 호출
		System.out.println("===매개변수 1개 출력===");
		Person Lee = new Person("이순신");
		System.out.println(Lee.name);
		System.out.println(Lee.height);
		System.out.println(Lee.weight);
		System.out.println(Lee.age);
		
		Lee.show();
		System.out.println("====================");
		Person four = new Person("이순신" , 190.5, 80.5F, 24);
		System.out.println(four.name);
		System.out.println(four.height);
		System.out.println(four.weight);
		System.out.println(four.age);
		
		//setter를 사용해서 필드의 값 할당, getter를 사용해서 필드의 값 출력
		System.out.println("==setter/getter 사용==");
		Person jung = new Person();
		
		//setter를 사용해서 필드에 값 할당.
		jung.setName("정말로");
		jung.setHeight(180.9);
		jung.setWeight(99.9F);
		jung.setAge(24);

		//getter를 사용해서 필드의 값을 호출
		System.out.println(jung.getName());
		System.out.println(jung.getHeight());
		System.out.println(jung.getWeight());
		System.out.println(jung.getAge());
		System.out.println();
		jung.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
