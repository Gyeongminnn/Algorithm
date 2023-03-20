package Programmers;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;

public class level1_4 {
	public static void main(String[] args) {
		// 정수 내림차순으로 배치하기
		
		long n = 118372;
		String number = String.valueOf(n); // long 타입 String 타입으로 변환
		String[] numberArr = number.split("");
		Arrays.sort(numberArr); // 내림차순 정렬
		String sub_answer = "";
		
		for(int i = numberArr.length-1; i >=0; i--) {
			sub_answer += numberArr[i];
		}
		
		long answer = Long.parseLong(sub_answer); // String 타입 long 타입으로 변환
		
		System.out.println("1번 문제 정답 : " + answer);
		
		
		
		// 두 정수 사이의 합
		
		int a = 5, b = 3;
		long answer2 = 0;
		int min, max = 0;

		if(a >= b) { // 작은 수랑 큰 수 저장
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		if(a == b) {
			answer2 = min;
		}else {
			for(int i = min; i <=max; i++) {
				answer2 += i;
			}
		}
		System.out.println("2번 문제 답 : " + answer2);
		
		
		// 콜라즈 추측
		
		long num = 626331;
		int count = 0;
		
		if(num != 1) {
			
			for(int i = 0; i <= 500; i++) {
				if(num % 2 == 0) {
					num = num / 2;
					count++;
					if(num == 1) {
						break;
					}
				}else {
					num = num * 3 + 1;
					count++;
					if(num == 1) {
						break;
					}
				}
			}
		}
		
		if(count > 500) {
			count = -1;
		}
		System.out.println("3번 문제 답 : " + count);
	}
}
