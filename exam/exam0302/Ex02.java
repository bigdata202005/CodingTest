package kr.green.exam0302;

/*
문제 2] 숫자 출력하기
20150111을 출력합니다.
4가지 기준만 만족하면 됩니다.
1. 코드 내에 숫자가 없어야 합니다.
2. 파일 이름이나 경로를 사용해서는 안됩니다.
3. 시간, 날짜 함수를 사용해서는 안됩니다.
4. 에러 번호 출력을 이용해서는 안됩니다.
*/

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example());
		example2();
	}
	public static  String example() {
		String result="";
		String t = "cabfabbb";
		for(char ch : t.toCharArray())  result += ch-'a';
		return result;
	}
	public static void example2() {
		"cabfabbb".chars().forEach(c -> System.out.print(c-'a'));
	}
}
