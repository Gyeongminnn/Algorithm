package Programmers;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String input = br.readLine();
	        String[] arr = input.split("");
	        boolean isReference = false; // 대괄호 안에 있는지 판별할 변수
	        List<String> newArr = new ArrayList<>();
	        String modify = "";
	        List<String> result_input = new ArrayList<>();
	        List<Integer> buffer = new ArrayList<>();
		
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i].equals("[")) { 
	                result_input.add("[");
	                isReference = true; // 대괄호 있을 경우 true로 변경
	            } else if (arr[i].equals("]")) { // 대괄호 끝나면 arrayList에 저장
	                int isCount = 0; // 참조문헌이 이전에 있었는지 확인할 변수
	                int breakpoint = 0; // 전에 나온 참조문헌이라면 breakpoint에 저장
									
	                for (int j = 0; j < newArr.size(); j++) {
	                    if (newArr.get(j).equals(modify)) {
	                        isCount = 1;
	                        breakpoint = j;
	                        modify = "";
	                        break;
	                    }
	                }
	                switch (isCount) {
	                    case 0: // 이전에 등장한 문자열 없는 경우
	                        newArr.add(modify);
	                        buffer.add(newArr.size() - 1);
	                        modify = "";
	                        break;
	                    case 1: // 이전에 등장한 문자열 있는 경우
	                        buffer.add(breakpoint);
	                        break;
	                    default:
	                        break;
	                }
	                buffer.sort(Integer::compareTo);
	                for (int j = 0; j < buffer.size(); j++) {
	                    result_input.add(" " + (buffer.get(j) + 1));
	                    if (j + 1 == buffer.size()) {
	                        break;
	                    }
	                    result_input.add(",");
	                }
	                buffer.clear();
	                result_input.add(" ]");
	                isReference = false;
	            } else if (isReference == true) {
	                if (arr[i].equals(",")) {
	                    newArr.add(modify);
	                    buffer.add(newArr.size() - 1);
	                    modify = "";
	                }
	                if (arr[i].equals(",") || arr[i].equals(" ")) {
	                    continue;
	                }
	                modify = modify + arr[i];
	            } else if (isReference == false) {
	                result_input.add(arr[i]);
	            }
	        }
	        for (int i = 0; i < result_input.size(); i++) {
	            System.out.print(result_input.get(i));
	        }
	        System.out.print("\n");
	        for (int i = 0; i < newArr.size(); i++) {
	            System.out.println("[" + (i + 1) + "] " + newArr.get(i));
	        }
	}

}
