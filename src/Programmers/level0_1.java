package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
		
		// 7. 문자열을 정수로 변환하기
		String n_str = "10";
		int answer7 = Integer.parseInt(n_str);
		
		// 8. 최댓값 만들기(2)
		
		int[] numbers = {1,2,-3,4,-5};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		int sub_a = 0, sub_b = 0;
		int answer8 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				sub_a = numbers[0] * numbers[1];
			}else if(numbers[i] > 0) {
				answer8 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
			}
		}
		
		if(sub_a != 0 && sub_a > answer8) {
			answer8 = sub_a;
		}
		System.out.println("8번 정답 : " + answer8);
		
		// 9. 컨트롤 제트
		String s9 = "1 2 Z 3";
		String[] arr = s9.split(" ");
		System.out.println("확인 : " + Arrays.toString(arr));
		int z = 0;
		int answer9 = 0;
		for(int i = 0; i < arr.length; i++) {
			
			
			if(!arr[i].equals("Z")) {
				answer9 += Integer.parseInt(arr[i]);
			}else {
				z = i;
				answer9 -= Integer.parseInt(arr[z -1]);
			}
		}
		
		System.out.println(answer9);
		
		// 10. 배열 회전 시키기
		
		int[] nums = {4, 455, 6, 4, -1, 45, 6};
//		int[] nums = {1,2,3};
		String direction = "left";
		
		int[] answer10 = new int[nums.length];
		int cnt = 0;
		if(direction.equals("right")) {
			System.out.println("right");
			for(int i = 1; i < nums.length; i++) {
				answer10[i] = nums[i - 1];
			}
			answer10[0] = nums[nums.length - 1];
		}else if(direction.equals("left")) {
			System.out.println("left");
			
			for(int i = 0; i < nums.length - 1; i++) {
				System.out.println("for문 실행");

				answer10[i] = nums[i + 1];
				System.out.println("출력 "  + nums[i + 1]);
			}
			answer10[nums.length - 1] = nums[0];
		}
		
		System.out.println(Arrays.toString(answer10));
		
		// 11. 중복된 문자 제거
		String st = "people";
		String[] array = st.split("");
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		
		for(String al : array) lhset.add(al);
		
		System.out.println(lhset);
		
		String answer11 = "";
//		System.out.println(lhset.size());
		Iterator<String> iter = lhset.iterator();
		
		while(iter.hasNext()) {
			answer11 += iter.next();
		}
		
		System.out.println(answer11);
	}

}
