package chapter03.EX05;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리 연산자 ( &&(and) , || (or) , ^(xor) , !(not) )
		//	-- 연산자 좌측과 우측에는 true, false
		// AND 연산 : &&	<== 좌우 모두 true일 때 true
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(true && (5<3));	//false
		System.out.println((5<=5) && (7>2));	//true
		System.out.println("=====================");
		
		//OR 연산 : || <== 좌우중 하나만 true면 true
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false		
		System.out.println((5<=5) || (7>2));	//true
		System.out.println("=====================");
		
		//XOR 연산 : ^ <== 좌우가 동일할 때 false
		System.out.println(true ^ true);	//false
		System.out.println(true ^ false);	//true
		System.out.println(false ^ true);	//true
		System.out.println(false ^ false);	//false
		System.out.println((5<=5) ^ (7>2));	//false
		System.out.println("=====================");

		//NOT 연산 : ! <== 결과의 반대
		System.out.println(!true);	//false
		System.out.println(!false);	//true
		System.out.println(!(5<=5));//false
		System.out.println(false || !(5<2));	//true
		System.out.println((5<=5) || ! (7>2));	//true
		System.out.println("=====================");

		//비트연산자로 논리 연산을 수행
		System.out.println(true & true);	//true
		System.out.println(true & false);	//false
		System.out.println(true | (5<3));	//true
		System.out.println((5<=5) | (7>2));	//true
		System.out.println("=====================");
		
		//숏 서킷 (short circuit) : 
		//	--	왼쪽의 결과 값만으로 유추 가능할 때 오른쪽의 값을 실행하지 않는것.
		//	-- 논리 연산자에서만 작동됨, (&&, ||, ^, !)
		// 	-- 비트연산자에서는 작동이 안됨 (&, | ,^ , ~)
		
		int value1 = 3;
		System.out.println(true && ++value1 < 6);	//short circuit
		System.out.println(value1);
		System.out.println("=====================");
		
		int value2 = 3;
		System.out.println(false & ++value2 > 3);	//모두 확인
		System.out.println(value2);
		System.out.println("=====================");
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);	//
		System.out.println(value3);
		System.out.println("=====================");
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
}
