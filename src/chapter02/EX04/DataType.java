package chapter02.EX04;

public class DataType {
	public static void main(String[] args) {
		/*
		 자바의 자료형
		 	- 기본 자료형 8가지 : 첫자가 소문자
		 		- boolean	: ture, flase
		 		- byte		: 정수 (1byte)8bit , -2^7 ~ 2^7-1
		 									-128 ~ 127
		 		- short		: 정수 (2byte)16bit , -2^15 ~ 2^15-1
		 									-32768 ~ 32767
		 		- int		: 정수 (4byte)32bit , -2^31 ~ 2^31-1
		 		- long		: 정수 (8byte)64bit, 값을 할당할때 1234L
		 									-2^63 ~ 2^63-1
		 		- float		: 실수 (4byte), 값을 할당할때 123.45F
		 		- double	: 실수 (8byte)
		 		- char		: 문자 , ' '
		 		
		 	- 참조 자료형 무한대 : 첫자가 대문자 < String 은 참조 자료형이다.>
		 		- String : 문자열 , " "
		 	 		배열, 클래스/인터페이스
		 */
		
		boolean Aaaa;	//ture, false
		Aaaa = true; Aaaa = false;
		System.out.println(Aaaa);
		
		short bbb;		//정수 값만 할당 가능
		bbb = 32767;
		System.out.println(bbb);
		
		byte bb;
		short cc;
		bb = (byte)500;
		cc = (short)50000000;
		System.out.println("bb 의 출력값 : " + bb);
		System.out.println("cc 의 출력값 : " + cc);

	}
}
