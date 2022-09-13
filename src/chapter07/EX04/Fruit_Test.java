package chapter07.EX04;

class Fruit{
	//1.필드
	String name; 	//과일 이름
	String color;	//과일 색깔
	int count;		//과일의 개수
	int sugarContent;	//과일의 당도
	
	//2. 생성자
	Fruit(){}
	
	Fruit (String name, String color, int count, int sugarContent){
	this.name = name;
	this.color = color;
	this.count = count;
	this. sugarContent = sugarContent;
	}
	//3. show() : 필드의 값을 모두 출력
	void show() {
		System.out.println(name + " , " + color + " , " + count + " , " + sugarContent);
	}
	
	//4. getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
}

public class Fruit_Test {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본값을 직접 입력 후 / 직접 출력
		System.out.println("==바나나 정보==");
		Fruit banana = new Fruit();
		banana.name = "바나나";
		banana.color = "노란색";
		banana.count = 10;
		banana.sugarContent = 5;
		
		System.out.println("이름 : " + banana.name);
		System.out.println("색깔 : " + banana.color);
		System.out.println("바나나의 갯수 : " + banana.count + "개");
		System.out.println("바나나의 당도 : " + banana.sugarContent);
		// 2. apple 객체 : 생성자를 사용해서 4개의 필드에 초기값 할당.	show메소드를 사용
		System.out.println("\n==사과 정보==");
		Fruit apple = new Fruit("사과" , "빨간색" , 5 , 7);
		apple.show();
		
		// 3. strawberry : setter를 통해 값 입력 getter를 통해 출력
		System.out.println("\n==딸기 정보==");
		Fruit strawberry = new Fruit();
		strawberry.setName("딸기");
		strawberry.setColor("빨간색");
		strawberry.setCount(100);
		strawberry.setSugarContent(10);
		
		System.out.println(strawberry.getName());
		System.out.println(strawberry.getColor());
		System.out.println(strawberry.getCount());
		System.out.println(strawberry.getSugarContent());
		
		
		
	}

}
