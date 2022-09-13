package chapter07.EX04;

import java.util.Scanner;

class Rate{		//환율을 계산하는 클래스
	//1. 필드
	float rate;	//환율을 저장하는 변수	//1377.36원 == 1달러
	float won;
	float usd;
	float tousd;
	float tokwr;
	//2. 메소드 생성( 달러를 인풋받아서 원화로 반환하는 메소드 ) ,메소드 이름 : toKWR()
	void toKWR (){
		tokwr = won*rate;
	}
	//3. 메소드 생성( 원화를 인풋받아서 달러로 반환하는 메소드 ) , 메소드 이름 : toUSD()
	void toUSD() {
		tousd = usd/rate;
	}
	//4. setRate() 메소드 생성 : setter를 사용해서 rate 필드의 값을 할당.
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getWon() {
		return won;
	}
	public void setWon(float won1) {
		this.won = won1;
	}
	public float getUsd() {
		return usd;
	}
	public void setUsd(float usd1) {
		this.usd = usd1;
	}
	
	
}
	

public class Converter_Test {

	public static void main(String[] args) {
		// 네이버를 검색해서 오늘 환율을 알아와서 
		// 객체 생성후 스캐너로 환율을 인풋 받아서 setRate() 메소드에 저장 후 
		// 100만원 == > 몇 달러인지
		// 100달러 == > 몇 만원인지
		Rate rate = new Rate();
		Scanner sc = new Scanner(System.in);
		System.out.println("환율을 입력하세요");
		float dol = sc.nextFloat();
		System.out.println("원화를 입력하세요");
		float won1 = sc.nextFloat();
		System.out.println("달러를 입력하세요");
		float usd1 = sc.nextFloat();
		rate.setRate(dol);
		rate.setWon(won1);
		rate.setUsd(usd1);
		System.out.print("원화 -> 달러 : ");
		System.out.printf("%.2f", rate.tousd);
		System.out.print("\n달러 - > 원화 : ");
		System.out.printf("%.2f", rate.tokwr);
		System.out.println(rate.getUsd());
//		double per2 = 3.141592;
//		double per1 = Double.parseDouble(String.format("%10.2f", per2));
//		System.out.println(per1);
	}

}
