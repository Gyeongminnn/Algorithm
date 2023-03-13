package Programmers;

import java.util.Arrays;

public class level1_1 {
	
	public static void main(String[] args) {
		// x만큼 간격이 있는 n개의 숫자
		
		long x = 2;
		// 문제에서는 x가 int형이었는데 int로 하면 x + (x*i)를 했을 때 오버플로우가 발생해서 long형으로 변경했다!
		int n = 5;
		long[] answer = new long[n];
		
		for(int i = 0; i < n; i++) {
			answer[i] += x + (x*i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
