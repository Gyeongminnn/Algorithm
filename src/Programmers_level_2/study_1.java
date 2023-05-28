package Programmers_level_2;

import java.util.Arrays;

public class study_1 {

	public static void main(String[] args) {
		// 1. 최솟값 만들기
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		int answer = 0;
		int[] sub_b = new int[b.length];
		int cnt = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = b.length - 1; i >= 0; i--) {
			sub_b[cnt] = b[i];
			cnt++;
		}
		for(int i = 0; i < a.length; i++) {
			answer += a[i] * sub_b[i];
		}
		
		System.out.println(answer);
		
		// 2. jadenCase 문자열 만들기
		
		String s = "people unFollowed me ";
		String answer2 = "";
		s = s.toLowerCase();
		
		String[] sArr = s.split("");

		System.out.println(Arrays.toString(sArr));
		if(!sArr[0].matches("[0-9]")) {
			sArr[0] = sArr[0].toUpperCase();
		}
		
		for(int i = 0; i < sArr.length; i++) {
			
			if(sArr[i].equals(" ") && i != sArr.length - 1) {
				sArr[i + 1] = sArr[i + 1].toUpperCase();
			}
			
			answer2 += sArr[i];
			
		}
		
		
		System.out.println(answer2);
	}

}
