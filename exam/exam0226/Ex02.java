package kr.green.exam0226;

/*
문제 2] 문자열 압축하기
문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
입력 예시: aaabbcccccca
출력 예시: a3b2c6a1
*/

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example("aaabbcccccca"));
	}
	public static  String example(String str) {
		String result="";
		char oldChar = str.charAt(0); // 이전문자
		int count = 0; // 개수
		for(char ch : str.toCharArray()) { // 반복
			if(oldChar==ch) { // 이전글자가 같으면 개수 증가
				count++;
			}else { // 다르면
				result += oldChar+"" + count; // 글자와 숫자 출력하고 
				oldChar = ch; // 이전문자 변경
				count = 1; // 개수를 1로 초기화
			}
		}
		result += oldChar+""+count; // 마지막 문자 등록
		return result;
	}
}
