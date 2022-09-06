package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If04 {
	public static void main(String[] args) {
		//에스프레소, 카페라떼, 아포가토 를 주문할 경우 가격이 3,500원
		//아메리카노를 주문할 경우 가격은 2,500원
		//그 외 메뉴를 출력 할 경우에는 우리 매장에 없는 메뉴 입니다.
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		
		System.out.println("주문하실 메뉴를 고르세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int price;
		String order = sc.next();
		
		if (order.equals("아메리카노")) {
			price = 2500;
			System.out.println("주문하신 <" + order + ">는 가격이 <" + price + ">원 입니다.");
		} else if (order.equals("카페라떼") || order.equals("에스프레소") || order.equals("아포가토")){
			price = 3500;
		System.out.println("주문하신 <" + order + ">는 가격이 <" + price + ">원 입니다.");
		}else {
			System.out.println("우리 매장에 없는 메뉴 입니다.");
		}
		sc.close();
	}
}
