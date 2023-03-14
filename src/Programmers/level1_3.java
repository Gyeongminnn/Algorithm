package Programmers;

public class level1_3 {

	public static void main(String[] args) {
		
		// 정수 제곱근 판별
		long n = 121;
		long num = 0;
		long answer = -1;
		for(int i = 0; i < n; i++) {
			if(i * i == n && i == i) {
				num = i;
				break;
			}
		}
		
		if(num > 0) {
			answer = (num + 1) * (num+1);
		}
		
		System.out.println(answer);
	}

}
