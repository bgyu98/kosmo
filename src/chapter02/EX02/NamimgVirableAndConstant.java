package chapter02.EX02;

public class NamimgVirableAndConstant {

	public static void main(String[] args) {
		/* 변수의 이름 부여	: 변수 == 값을 변경 가능
		 	- 변수 이름은 영문, 한글 사용 가능 (한글은 권장X)
		 	- 첫자는 소문자
		 	- 특수문자는 : _ , $
			- 첫자에 숫자는 올 수 없음
			- JAVA의 키워드로(예약어) 쓰는 문자는 올 수 없음. [ex)int, double, String...]
		 */
		
		boolean aBcD;	// aBcD 변수에 true or false
		
		aBcD = true;
		System.out.println(aBcD);
		
		aBcD = false;
		System.out.println(aBcD);
		
		byte 가나다;		//사용은 가능 하나 권장 사항이 아님.
		short _abcd;	//특수문자는 _ , $ 만 가능
		char $ab_cd;	
		double main; 	//메소드 이름을 변수 이름으로 사용 가능, 
						//사용 방법이 달라서 사용 가능
		//float int;	//예약어를 변수명으로 사용하면 오류 발생
						//class, int, double, char, byte...
		String myClassName ;	//첫단어는 소문자, 여러 단어가 있을때 첫단어 대문자
	
		
		/*
		 	상수의 이름 부여	: 상수 == 값을 변경 불가능
		 		- 대문자로 처리
		 		- 변수 선언문 앞에 final 키워드를 사용.
		 */
		final double PI ;
		PI = 3.141592;
		
		System.out.println(PI);
		
		//PI = 1234.00;			//상수는 값을 수정할 수 없다.
		//System.out.println(PI);
		
		final int MY_DATA ; //상수 (규칙)
		int myData ;		//변수
				
	}
	
}

