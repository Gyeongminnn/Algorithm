package Programmers;

public class level1_5 {
	
	public static void main(String[] args) {
		
		// 1. 약수의 개수와 덧셈
		
		int left = 13;
		int right = 17;
		int result = 0;
		int count = 0;
		
		for(int i = left; i <= right; i++) {
			count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}

			if(count % 2 == 0) {
				result += i;
			}else {
				result -= i;
			}
		}
		
		System.out.println(result);
		
		
		// 2. 부족한 금액 계산하기
		
		int price = 3;
		int money  =20;
		int count2 = 4;
		int sub_answer = 0;
		long answer = 0;
		
		for(int i = 0; i <= count2; i++) {
			sub_answer += (price * i);
		}
		System.out.println(sub_answer);
		answer = sub_answer - money;
		System.out.println(answer);
		
		
 		
		
		
	}

}
