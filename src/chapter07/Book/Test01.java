package chapter07.Book;

// 클래스 정의 (붕어빵 틀)
class T{
	int m = 3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}


public class Test01 {
	public static void main(String[] args) {
		T t = new T();		//객체 생성 (붕어빵)
		
		//클래스 활용(붕어빵 먹기)
		//필드 활용 : 필드에 값을 읽기/쓰기
		t.m = 5;
		System.out.println(t.m);
		
		//메서드 활용 : 메서드를 호출
		t.print();
		
	}
}
