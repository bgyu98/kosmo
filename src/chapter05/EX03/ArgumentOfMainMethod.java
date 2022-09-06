package chapter05.EX03;

public class ArgumentOfMainMethod {
	public static void main(String[] args) {
		//main Method 의 입력 매개변수 전달 하기 , 메소드(객체지향언어) = 함수
		//	-메소드(함수)의 형식 : 리턴타입 메소드명 (입력매개변수){실행부}
//								void main (String[] args){실행부}
		
		
		//메인 메소드의 입력 매게변수 args[i] 값을 받아서 각 변수에 할당.
		
		// 안녕하세요 3 5.8			<== String[] args
		
		String a = args[0];		//안녕하세요
		String b = args[1];		//3
		String c = args[2];		//5.8
		
		//출력
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//연산
		System.out.println(b + 1);		//3 (String) + 1 (int) = 31
		System.out.println(c + 1);		//5.8(String) + 1 (int) = 5.81
		
		//숫자형식으로 되어있는 Stirng => 정수, 더블형으로 변환
					//Integer.parseInt(String변수)
					//Double.parseDouble(String변수)
		
		//연산 (형 변환후 연산)
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		System.out.println(d + 1);
		System.out.println(e + 1);
		
		
		
		
		
	}
}
