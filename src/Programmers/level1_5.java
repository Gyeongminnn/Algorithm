package Programmers;

import java.util.Arrays;

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
		
		// 3. 주사위의 개수
		
		int[] box = {10,8,6};
		int n = 3;
		
		int answer3 = 1;
		
		for(int i = 0; i < box.length; i++) {
			answer3 *= box[i] / n; 
		}
		
		System.out.println("답 : " + answer3);
		
 		// 4. 문자열 정렬하기 (1)
		
		String my_string = "hi12392";
		int count4 = 0;
		String sub_ans = "";
		int[] result4 = {};
		for(int i = 0; i < my_string.length(); i++) {
			if(isParseInt(my_string.charAt(i)) == true) {
				count4++;
				sub_ans += my_string.charAt(i);
			}
		}
		
		result4 = new int[count4];
		for(int i = 0; i < count4; i++) {
			result4[i] = Integer.parseInt(sub_ans.split("")[i]);
		}
		Arrays.sort(result4);
		System.out.println("4번 정답 : " + Arrays.toString(result4));
		
		// 5. 예산
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer5 =0;
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++) {
			budget -= d[i];
			if(budget < 0) {
				break;
			}
			answer5++;
		}
		
		
		
		System.out.println("답 확인 : " + answer5);
	}
	
	public static boolean isParseInt(char ch) {
		String str = ""+ch;
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

}
