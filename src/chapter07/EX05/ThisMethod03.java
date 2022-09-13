package chapter07.EX05;

class Book{
	
	String bookName;	//책 이름
	String author;		//책 저자
	
	Book(){
		bookName = "책 이름 없음";
		author = "작자미상";
	}
	Book(String bookName){
		this();
		this.bookName = bookName;
	}
	Book(String bookName, String author){
		this(bookName);
		this.author = author;
	}
	void print() {
		System.out.println("책의 이름은 : " + bookName + "\n책의 저자는 : " + author);
	}
}

public class ThisMethod03 {

	public static void main(String[] args) {
		// 1.기본 생성자 호출
		System.out.println("==기본 생성자 호출==");
		Book book = new Book();
		book.print();
		
		// 2. 매개 변수가 1개인 생성자 호출 ("홍길동전")
		System.out.println("\n==매개 변수가 1 개인 생성자 호출==");
		Book book1 = new Book("홍길동전");
		book1.print();
		
		System.out.println("\n==매개 변수가 2 개인 생성자 호출==");
		Book book2 = new Book("심청전" , "누구세요?");
		book2.print();
		
		
		
	}

}
