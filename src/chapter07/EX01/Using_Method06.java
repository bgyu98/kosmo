package chapter07.EX01;

public class Using_Method06 {

	static int add(int[] a) {
		// 들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("더한값은 : " + sum);
		return sum;
	}

	static int div(int[] a) {
		// 들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int sum = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(i % 7 == 0) {
				sum -= i;
			}
		}
		System.out.println("뺀 값은 : " + sum);
		return 0;
	}

	static int mul(int[] a) {
		// 들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		int sum = 1;
		
		for(int i = 1; i < a.length; i++) {
			if(i % 7 == 0) {
				sum *= i;
			}
		}
		System.out.println("곱한 값은 : " + sum);
		return 0;
	}

	static int avg(int[] a) {
		// 들어온 배열의 모든 값의 평균 값을 리턴
		int sum = 0;
		int count = 0;
		for(int i = 1; i < a.length; i++) {
			if(i % 7 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("평균 값은 : " + sum/(double)count);
		return 0;
	}

	public static void main(String[] args) {
		// 1~100 까지 7의 배수만 저장후 각 메소드 호출
		int arr[] = new int [100];
		add(arr);
		div(arr);
		mul(arr);
		avg(arr);
		
		
		
	}
}
