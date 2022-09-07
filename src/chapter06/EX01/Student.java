package chapter06.EX01;

public class Student {

	
	//필드 : 클래스 블럭에 선언된 변수 : Heap 영역에 저장됨, 강제 초기화됨
	int kor;	//국어 점수
	int eng;	//영어 점수
	int met; 	//수학 점수
	String name;	//학생 이름
	
	//생성자
	Student () {}
	Student (int kor, int eng, int met, String name){
		this.kor = kor;
		this.eng = eng;
		this.met = met;
		this.name = name;
		
	}
	
	//메소드
	void call() {
		int sum;
		sum = kor + eng + met;
		double avg;
		avg = sum / 3.0;
		System.out.println(name + "의 총 점수 : " + sum + "이고, 평균은 : " + avg);
	}
	
	
	
	
	
	
}
