package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {
	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String 배열에 저장후 4가지로 출력
		
		String []a = new String [5];
		
		a[0] = "세종대왕";
		a[1] = "강감찬";
		a[2] = "이순신";
		a[3] = "이이";
		a[4] = "이황";
		
		System.out.print(a[0] + ", ");
		System.out.print(a[1] + ", ");
		System.out.print(a[2] + ", ");
		System.out.print(a[3] + ", ");
		System.out.print(a[4]);
		System.out.println();
		
		for(int i = 0; i < a.length ; i++) {
			if(i < 4) {
			System.out.print(a[i] + ", ");
			}else {
				System.out.print(a[i]);
			}
		}
		
		System.out.println();
		for(String k : a) {
			System.out.print(k + ", ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
	}
}
