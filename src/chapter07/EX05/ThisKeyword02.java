package chapter07.EX05;

// 반드시 this keyword를 사용해야 하는 경우 : 
// 	- 생성자, 메소드의 매개변수 이름, 필드이름이 동일한 경우 필드이름에 this를 명시해야 한다.

class Aaa{
	int m;
	int n;
	
	void init(int m, int n) {		//this 키를 명시하지 않는 경우
		m = m;		//3개의 m 모두 지역 변수
		n = n;
	}
}

class BB{
	int m;
	int n;
	
	void init(int m, int n) {		//this 키를 명시한 경우
		this.m = m;		//this.m : 필드,m : 지역변수
		this.n = n;
	}
	
}


public class ThisKeyword02 {

	public static void main(String[] args) {
		// 
				
		Aaa Aaa = new Aaa();
		Aaa.init(10, 20);
		System.out.println(Aaa.m);
		System.out.println(Aaa.n);
		
		System.out.println("====");
		BB bb = new BB();
		bb.init(10, 20);
		System.out.println(bb.m);
		System.out.println(bb.n);
	}

}
