package chapter07.Book;

class E {
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		int k;
//		System.out.println(k);		//지역 변수는 초기화해야 사용 가능
	}
	
}
public class InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		E e = new E();
		e.printFieldValue();
	}

}
