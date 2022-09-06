package chapter05.EX03;

import java.util.Arrays;

public class ArgumentOfMainMethod02 {
	public static void main(String[] args) {
		//Main Method로 값 던져 주기
		
		//args.length 내용 출력 하기
		System.out.println(args.length);
		
		//Main Method로 넘겨진 값을 자동으로 출력 하기
		for(int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println("\n======enhanced for==========");
		for(String k : args) {
			System.out.print(k + " ");
		}
		System.out.println("\n======Arrays.toString==========");
		System.out.println(Arrays.toString(args));
		
		
	}
}
