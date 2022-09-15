package chapter10.EX02;

class Aa{
	int a = 10;
}
class Bb extends Aa{
	int b = 20;
}
class Cc extends Bb{
	int c = 30;
}
class Dd extends Bb{
	int d = 40;
}

public class Using_Polymorphism01_1 {

	public static void main(String[] args) {
		// 다형적 표현
		Aa a = new Aa();
		System.out.println(a.a);

		Bb b = new Bb();
		System.out.println(b.b);
		System.out.println(a.a);
		
		Aa a1 = new Bb();
		System.out.println(a1.a);
		

		
	}

}
