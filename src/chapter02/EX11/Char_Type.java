package chapter02.EX11;

public class Char_Type {
	public static void main(String[] args) {
		// char 데이터 타입 : 하나의 문자만 저장, 문자
		//	- 문자, 숫자, 유니코드로 저장 할 수 있다.
		//	- ' '를 사용해서 저장
		//	- 2문자 이상 넣을 수 없다. 2문자 이상 넣으려면 String으로.
		
		// 유니코드( 2byte) : 전 세계 모든 문자를 16진수로 표기
		
		//1. 문자로 저장하는 방법 : ' '
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';	//3 이라는 문자
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("==================");
		
		//2. 정수로 저장하는 방법 : 
		char value4 = 65;		//A	== 65
		char value5 = 0xac00;	//0x == 16진수
		char value6 = 51;		//3 == 51
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		System.out.println("=================");
		//3. 유니코드 형식으로 저장 ( \\u ) ; ' '를 사용해서 넣는다.
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		
		
		
		char value100 = 35;	// # == 35
		char value101 = '\uac12';
		System.out.println(value7);
		System.out.println(value100);
		System.out.println(value101);
		System.out.println(value8);
		System.out.println(value9);
		
		//구글 검색을 사용해서 자신의 이름을 유니코드로 표현
		
		char a = '\ubcc0'; 
		char b = '\uc815';
		char c = '\ud658';
		
		System.out.printf("%c%c%c\n", a, b,c );
		
		char aa = 'A';
		char bb = 65;
		char cc = 0b1000001;	//0b 뒤에 오는 값이 2진수 이다.
		char dd = 00101;		//00 뒤에 오는 값은 8진수 이다.
		char ee = 0x0041;		//0x 뒤에 오는 값은 16진수 이다.
		char ff = '\u0041';
		
		
		
		System.out.println((int)aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(ff);
		
		
	}
}
