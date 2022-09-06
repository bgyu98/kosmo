package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_02 {
	public static void main(String[] args) {
		
		String[][] arr1 = new String[][] {{"홍길동","이순신","세종대왕"}, {"독수리","부엉이","닭","오리"},{"붕어","가물치","잉어"},{"호랑이","사자"}};
		
//			: 사람 이름 : 홍길동 이순신 세종대왕
//			: 새이름 	 : 독수리 부엉이 닭 오리
//			: 물고기 이름 : 붕어 가물치 잉어 
//			: 포유류 이름 : 호랑이 사자
		
//		1. for
		for(int i = 0; i < arr1.length; i++) {
			if(i == 0) {
				System.out.print("사람 이름 : ");
			}else if(i == 1) {
				System.out.print("새 이름 : ");
			}else if(i == 2) {
				System.out.print("물고기 이름 : ");
			}else {
				System.out.print("포유류 이름 : ");
			}for(int ii = 0; ii < arr1[i].length; ii++) {
				System.out.print(arr1[i][ii] + " ");
				}System.out.println();
		}
		System.out.println("=============================");
//		2. Enhanced for
		for(String[] k : arr1) {
			for(String kk : k) {
				if(kk == "홍길동") {
					System.out.print("사람 이름 : ");
				}if(kk == "독수리") {
					System.out.print("새 이름 : ");
				}if(kk == "붕어") {
					System.out.print("물고기 이름 : ");
				}if(kk == "호랑이") {
					System.out.print("포유류 이름 : ");
				}System.out.print(kk + " ");
			}System.out.println();
		}
		System.out.println();
//		3. Arrays.toString()
		System.out.println("=============================");
		for(int i = 0; i < arr1.length; i++) {
			if(i == 0) {
				System.out.print("사람 이름 : ");
			}if(i == 1) {
				System.out.print("새 이름 : ");
			}if(i == 2) {
				System.out.print("물고기 이름 : ");
			}if(i == 3) {
				System.out.print("포유류 이름 : ");
			}System.out.println(Arrays.toString(arr1[i]));
		}
		
		
		
		
		
		
		
		
	}
}
