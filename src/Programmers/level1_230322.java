package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class level1_230322 {

	public static void main(String[] args) {
		
		// 1. 서울에서 김서방 찾기
		
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i] == "Kim") {
				answer = "김서방은 " + i + "에 있다";
			}
		}

		System.out.println(answer);
		
		// 2. 제일 작은 수 제거하기
		int[] arr = {4,3,2,1};
		int[] answer2 = {};
		int min = 0;
		int count = 0;
		if(arr.length > 1) {
			answer2 = new int[arr.length -1];
			
			min = Arrays.stream(arr).min().getAsInt(); // 배열의 최소값 찾기
			System.out.println(min);
			for(int i = 0; i < arr.length; i++) {
				
				if(arr[i] != min) {
					System.out.println(arr[i]);
					answer2[count] = arr[i];
					count++;
				}
				
			}
		}else {
			answer2 = new int[1];
			answer2[0] = -1;
		}
		
		System.out.println(Arrays.toString(answer2));
		
		// 3. 음양 더하기
		
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int[] sub_answer = new int[absolutes.length];
		int answer3 = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == true) {
				sub_answer[i] = absolutes[i];
			}else {
				sub_answer[i] = -absolutes[i];
			}
			
			answer3 += sub_answer[i];
		}
		
	
		System.out.println(answer3);
		
		
		// 4. 나누어 떨어지는 숫자 배열
		
		int array[] = {3,2,6};
		int divisor = 10;
		
		int[] answer4 = {};
		int numbercount =0, answercount = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				numbercount++;
			}
		}
		if(numbercount > 1) {
			answer4 = new int[numbercount];
			
			for(int i = 0; i < array.length; i++) {
				if(array[i] % divisor == 0) {
					answer4[answercount] = array[i];
					answercount++;
				}
			}
		}else {
			answer4 = new int[1];
			answer4[0] = -1;
		}
		
		Arrays.sort(answer4);
		System.out.println(Arrays.toString(answer4));
		
		
		// 5. 가운데 글자 가져오기
		
		String s = "abcdef";
		String answer5 = "";
		int number5 = 0;

		String[] sArr = s.split("");
		number5 = s.length() / 2;
		
		if(s.length() % 2 == 0) {
			answer5 = sArr[number5 - 1] + sArr[number5];
		}else {
			answer5 = sArr[number5];
		}
		
		System.out.println("5번 정답 : " + answer5);
		
		
		
		// 6. 내적
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		long answer6 = 0;
		
		for(int i = 0; i < a.length; i++) {
			answer6 += a[i] * b[i];
		}
		
		System.out.println("6번 정답 : " + answer6);
		
		
		
		// 7. 문자열 내림차순으로 배치하기
		
		String str = "Zbcdefg";
		String answer7 = "";
		String[] strArr = str.split("");
		
		Arrays.sort(strArr);
		
		for(int i = strArr.length - 1; i >= 0; i--) {
			answer7 += strArr[i];
		}
		
		System.out.println("7번 정답 : " + answer7);
		
		
		// 8. 직사각형 별찍기
		
		Scanner sc = new Scanner(System.in);
		
		int a8 = sc.nextInt();
		int b8 = sc.nextInt();
		String sub_answer8 = "";
		for(int i = 0; i < a8; i++) {
			sub_answer8 += "*";
			
		}
		
		for(int j = 0; j < b8; j++) {
			System.out.println(sub_answer8);
		}
 	}

}
