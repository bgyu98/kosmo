package chapter07.EX04;

class Car{
	//1. field
	String company;
	String model;
	String color;
	double maxSpeed;
	
	//2. 생성자
	Car () {}
	
	Car (String company, String model, String color, double maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//3. 메소드 (show() : 필드의 값을 출력)
	void show() {
		System.out.println(company + " , " + model + " , " + color + " , " + maxSpeed);
	}
	//4. 메소드 (getter setter)

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}

public class Car_Test {

	public static void main(String[] args) {
		// 객체 생성
		// car1		현대자동차 그랜져		<<== 필드의 값을 직접 입력 / 출력
		Car car1 = new Car();
		car1.company = "현대자동차";
		car1.model = "그랜져";
		car1.color = "검정";
		car1.maxSpeed = 260;
		
		System.out.println("===그랜져===");
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		
		// car2		쌍용자동차 체어맨		<<== 생성자를 통해서 값 입력 / show() 값 출력
		System.out.println("\n==체어맨==");
		Car car2 = new Car("쌍용자동차" , "체어맨", "하양", 280);
		car2.show();
		
		
		// car3		기아자동차 K9		<<== setter/getter
		Car car3 = new Car();
		car3.setCompany("기아자동차");
		car3.setModel("K9");
		car3.setColor("파랑");
		car3.setMaxSpeed(270);
		
		System.out.println("\n==K9==");
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed());
	}
}
