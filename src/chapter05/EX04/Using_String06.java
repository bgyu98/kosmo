package chapter05.EX04;

import java.util.Arrays;

public class Using_String06 {
	public static void main(String[] args) {
		//String 의 다양한 메소드
		//5. 문자열 수정( toLowerCase(), toUpperCase() )
		//				소문자로 변환		대문자로 변환
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println("================");
		
		//replace(원본, 수정) //원본을 수정으로 변환해라
		String str2 = str1.replace("Study", "공부");
				
		
		System.out.println(str1.replace("Study", "공부"));
		System.out.println(str1);
		System.out.println(str2);
		
		//substring() : 글자를 잘라서 출력
		System.out.println(str1.substring(0,4));
		System.out.println(str1.substring(5,10));
		System.out.println(str1.substring(5));		//index 5 ~
		
		//split() : 특정 문자를 기준으로 잘라서 배열에 저장 <== 중요
		String[] strArr1 = "abc/def-ghi jkl".split("/|-| ");
		
		for(int i = 0; i < strArr1.length; i++) {
			System.out.print(strArr1[i] + " ");
		}
		System.out.println();
		for(String k : strArr1) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(strArr1));
		System.out.println("===========================");
		//공백을 기준으로 모두 잘라서 배열에 저장후 출력 for, Enhanced for, Arrays.toString()
		String[] strArr2 = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨 입니다.".split(" ");
		System.out.println("\n===========for===========\n");
		for(int i =0; i < strArr2.length; i++) {
			System.out.print(strArr2[i] + " ");
		}
		System.out.println("\n\n===========Enhaced for========\n");
		for(String kk : strArr2) {
			System.out.print(kk + " ");
		}
		System.out.println("\n\n==========Arrays.toString()==============\n");
		System.out.println(Arrays.toString(strArr2));
		
		//trim() : 좌우의 공백을 제거 
		System.out.println("==================");
		System.out.println("        abc            ".trim());
		
		//6. 문자열 비교 (==) : 참조자료형일때 Stack의 주소를 비교
		String str3 = new String("Java");
		String str4 = new String("Java");
		String str5 = new String("java");
		
		System.out.println(str3 == str4); 		//false <== 주소를 비교
		System.out.println(str4 == str5);		//false <== 
		System.out.println(str5 == str3);		//false <==
		
		
		//equals() : Heap 메모리의 값을 비교
		System.out.println("=========equals============");
		System.out.println(str3.equals(str4));		//true <==
		System.out.println(str4.equals(str5));		//false <==
		System.out.println(str5.equals(str3));		//false <==
		System.out.println(str3.equals(str5));		//false <==
		System.out.println(str3.equalsIgnoreCase(str5));		//true <== equalsIgnoreCase(); : 대소문자를 구분하지 말라
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
