package chapter04.EX07;

public class Using_Break {
	public static void main(String[] args) {
//		break; <== 해당 구문({})을 탈출 할 때 사용, if 조건과 같이 사용
//			- 1단계만 탈출
//		for, while, do while (반복문을 탈출할때 사용,
		
//		#1. 단일 loop 에서 탈출
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;						//한 단계 탈출
		}
		System.out.println("===========================");
		
//		break는 for, while, do while 내에서 if 조건문과 같이 사용
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {break;}						
		}
		
//		#2. 다중 loop 에서 break 사용
//			case1. 하나의 loop문만 탈출
		System.out.println("===========================");
		for (int i = 0; i < 5; i++) {		//5번 loop
			for(int j = 0; j < 5; j++) {	//5번 loop
				if(j ==2) {break;}			//하나의 for 문만 빠져나감
				System.out.println(i + "," + j);
			}
		}
		
//			case2-1. 한꺼번에 탈출	(바깥쪽 for 문의 변수의 값을 조건이 false가 되게 만듦)
		System.out.println("===========================");
		for (int i = 0; i < 5; i++) {		//5번 loop
			for(int j = 0; j < 5; j++) {	//5번 loop
				if(j ==2) {
					i = 100;
					break;
				}
				System.out.println(i + "," + j);
		
			}
		}
//			case2-2. 한꺼번에 탈출 (label을 사용해서 탈출)
		System.out.println("===========================");
		jump: for (int i = 0; i < 5; i++) {		//5번 loop
				for(int j = 0; j < 5; j++) {	//5번 loop
					if(j == 2) {
						break jump;
				}
				System.out.println(i + "," + j);
			}
		}
	}
	
}

























