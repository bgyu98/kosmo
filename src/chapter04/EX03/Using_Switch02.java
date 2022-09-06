package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {
	public static void main(String[] args) {
		//switch 문으로 처리
		//에스프레소, 카페라떼, 아포가토 를 주문할 경우 가격이 3,500원
		//아메리카노를 주문할 경우 가격은 2,500원
		//그 외 메뉴를 출력 할 경우에는 우리 매장에 없는 메뉴 입니다.
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		
		System.out.println("주문하실 메뉴를 선택해 주세요.");
		System.out.println("에스프레소, 카페라떼, 아포가토, 아메리카노");
		System.out.println(": ");
		Scanner sc = new Scanner(System.in);
		
		String aa = sc.next();
		/*
		switch (aa) {
		case "에스프레소":
			System.out.println("주문하신 <에스프레소>는 가격이 <3500>원 입니다.");
			break;
		case "카페라떼":
			System.out.println("주문하신 <카페라떼>는 가격이 <3500>원 입니다.");
			break;
		case "아포가토":
			System.out.println("주문하신 <아포가토>는 가격이 <3500>원 입니다.");
			break;
		case "아메리카노":
			System.out.println("주문하신 <아메리카노>는 가격이 <2500>원 입니다.");
			break;
		default:
			System.out.println("주문하신 메뉴는 우리 매장에 없는 메뉴 입니다.");
			break;
		}
		sc.close();
		
		switch (aa) {
		case "에스프레소":
			System.out.printf("주문하신 <%s>는 가격이 <3500>원 입니다.\n", aa);		
			break;
		default:
			break;
		}
		*/
		
		
		
		int price = 0;
		
		switch (aa) {
		case "에스프레소": case "카페라떼": case "아포가토":
			price = 3500;
			System.out.printf("주문하신 커피는 %s 이고, 가격은 %d 원 입니다.",aa , price);
			break;
		case "아메리카노":
			price = 2500;
			System.out.printf("주문하신 커피는 %s 이고, 가격은 %d 원 입니다.",aa , price);
			break;
		default:
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		
		
		sc.close();
		
		
		
		
		
		
	}
}
