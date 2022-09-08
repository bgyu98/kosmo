package chapter07.Book;

//클래스 생성
class W{
	int m = 3;		//필드
	int n = 4;		//필드
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}
}



public class FieldComponent {

	public static void main(String[] args) {
			
		W w = new W();
		
		System.out.println(w.m);
		System.out.println(w.n);
		
		w.work1();
		w.work2(7);
		
	}

}
