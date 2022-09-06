package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {
	public static void main(String[] args) {
		/*
		 * 문제1.
		 * 	스캐너로 "Gold" 를 넣으면 "금메달 입니다."를 출력
		 *  스캐너로 "Silver" 를 넣으면 "은메달 입니다."를 출력
		 *  스캐너로 "Bronze" 를 넣으면 "동메달 입니다."를 출력
		 *  그 외는 "메달이 없습니다."
		 *  
		 *  문제2.
		 *  	스캐너로 월을 인풋받아서 해당 월의 총 날짜를
		 *  	"<월>은 <며칠>일 까지 있습니다." 
		 */
		

		System.out.println("메달을 입력해 주세요 (Gold, Silver, Bronze)");
		Scanner sc = new Scanner(System.in);
		String medal = sc.next();
		
		switch (medal) {
		case "Gold": case "gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver": case "silver" :
			System.out.println("은메달 입니다.");
			break;
		case "Bronze": case "bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		
		
		System.out.println("===========================");
		System.out.println("몇월인지 입력하세요 :");
		int month = sc.nextInt();
		int day = 0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 29;
			break;
		default:
			System.out.println("존재하지 않는 달입니다.");
		}
		System.out.printf("<%d>월은 <%d>일 까지 있습니다.", month, day);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
