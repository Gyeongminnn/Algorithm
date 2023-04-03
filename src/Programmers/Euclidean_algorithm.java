package Programmers;

import java.util.Arrays;

public class Euclidean_algorithm {
		
	public static void main(String[] args) {
		
		/*
		 * < 유클리드 호제법 >
		 * 
		 *  - 숫자 A와 B가 있고, A를 B로 나눈 나머지 C가 있음
		 *  - 이때, A와 B의 최대공약수는 B와 C의 최대공약수와 같다
		 *  - 이러한 성질을 이용하여 계속 나눗셈을 진행했을 때
		 *    C가 0이 되는 숫자는 A와 B의 최대공약수가 된다.
		 *   
		 *  * 최대공배수 = 최대공약수 * (A / 최대공약수) * (B / 최대공약수)
		 */
		
		// 최대공약수, 최소공배수
		
		Solution s = new Solution();
		
		System.out.println(Arrays.toString(s.solution(3, 12)));
		System.out.println(Arrays.toString(s.solution(2, 5)));
		
		
	}

	

}

class Solution {
	
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		answer[0] = greatest(n, m);
		answer[1] = n * m / answer[0];
 		
		return answer;
	}
	
	public int greatest(int n, int m) {
		int greatest = 0;
		int max = 0, min = 0;
		
		if(n >= m) {
			max = n;
			min = m;
		}else {
			max = m;
			min = n;
		}
		
		int remainder = max % min;
		
		if(remainder == 0) {
			greatest = min;
			
		}else {
			return greatest(min, remainder);
		}
		
		return greatest;
	}
}


