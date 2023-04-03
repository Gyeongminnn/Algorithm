package Programmers;

import java.util.Arrays;

public class level0_1 {

	public static void main(String[] args) {
		
		// 1. 인덱스 바꾸기
		
		String my = "hello";
		int num1 = 1, num2 = 2;
		
		String[] myArr = my.split("");
		String s = myArr[num1];
		myArr[num1] = myArr[num2];
		myArr[num2] = s;
		System.out.println(Arrays.toString(myArr));
		
		String answer = "";
		
		for(int i = 0; i < myArr.length; i++) {
			answer += myArr[i];
		}
		
		System.out.println(answer);
		
		// 2. 숫자 찾기
		
		int num = 123456;
		String k = "7";
		String str = num + "";
		String[] strArr = str.split("");
		int answer2 = 0;
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals(k)) {
				answer2 = i + 1;
				break;
			}else {
				answer2 = -1;
			}
		}
		
		System.out.println(answer2);
		
		// 3. 문자열 정렬하기(2)
		
		String my_str = "Bcad";
		String sub_str = my_str.toLowerCase();

		String[] my_strArr = sub_str.split("");
		String answer3 = "";
		Arrays.sort(my_strArr);
		
		for(int i = 0; i <my_strArr.length; i++) {
			answer3 += my_strArr[i];
		}
		
		System.out.println(answer3);
		
		// 4. 대문자와 소문자
		
		String str4 ="cccCCC";
		String answer4 = "";
		
		for(int i = 0; i <str4.length(); i++) {
			if(Character.isUpperCase(str4.charAt(i))) {
				answer4 += Character.toLowerCase(str4.charAt(i));
			}else {
				answer4 += Character.toUpperCase(str4.charAt(i));
			}
			
		}
		
		System.out.println(answer4);
		
		// 5. A로 B 만들기
		
		String before = "olleh";
		String after = "hello";
		int answer5 = 0;
		int sum1 = 0, sum2 = 0;
		
		
		for(int i = 0; i < before.length(); i++) {
			sum1 += before.charAt(i);
			sum2 += after.charAt(i);
		}
		
		answer5 = sum1 == sum2? 1 : 0;
		
		System.out.println(answer5);
		
		
		// 6. 암호 해독
		
		String cipher = "dfjardstddetckdaccccdegk";
		String answer6 = "";
		int code = 4; // 배열 번호 3, 7, 11이 될 것,,,
		
		String[] cArr = cipher.split("");
		if(code == 1) { // 코드 길이가 1일 때
			for(int i = 0; i < cArr.length; i++) {
				answer6 += cArr[code * i];
			}
		}else {
			
			for(int i = 1; i <= cArr.length / code; i++) {
				answer6 += cArr[(code * i) - 1];
			}
		}
		
		System.out.println(answer6);
		
		
		
	}

}
