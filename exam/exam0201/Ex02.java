package kr.green.exam0201;

import java.util.Arrays;

/*
문제 2] Duplicate Numbers
일전에 뭐 게임 회사에서 본 간단한 퀴즈 테스트 입니다.
0~9까지의 문자로 된 숫자를 입력 받았을 때, 
이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 
확인하는 함수를 구하시오.
sample inputs: 
0123456789 01234 01234567890 6789012345 012322456789

sample outputs: 
true false false true false
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example("0123456789"));
		System.out.println(example("01234"));
		System.out.println(example("01234567890"));
		System.out.println(example("6789012345"));
		System.out.println(example("012322456789"));
	}
	
	public static boolean example(String num) {
		String[] str = num.split(""); // 1글자씩 잘라 배열로 만든다.
		Arrays.sort(str); // 정렬한다.
		// System.out.println(Arrays.toString(str) + " : " + String.join("", str));
		return String.join("", str).equals("0123456789"); // 다시 문자열로 합쳐 "0123456789"이면 참
	}
}
