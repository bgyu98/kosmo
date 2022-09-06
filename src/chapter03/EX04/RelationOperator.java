package chapter03.EX04;

public class RelationOperator {
	public static void main(String[] args) {
		
		//크기비교 : true , flase로 값을 반환
		System.out.println( 5 < 2 );	
		System.out.println( 5 > 2 );
		System.out.println( 5 < 5 );
		System.out.println( 5 <= 5 );
		System.out.println( 5 >= 5 );
		System.out.println("==================");
		
		//등가비교	:	
		// ==	: 같을때, != 같지 않을때
		int a = 5; int b = 2; int c = 5;
		System.out.println( a == b );
		System.out.println( a == c );
		System.out.println( a != b );
		System.out.println( a != c );
		System.out.println( b == c );
		System.out.println( b != c );
		System.out.println("==================");

		//참조 자료형일때 등가비교 (객체의 참조 주소를 비교하므로 //false)
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2);	//객체의 번지수를 비교함
		
		System.out.println("===============");
		System.out.println(str1);	//객체의 번지수를 출력
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
	}
}
