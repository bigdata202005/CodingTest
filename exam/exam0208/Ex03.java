package kr.green.exam0208;

/*
문제 3] 공백을 제외한 글자수 세기
네이버 글자수세기 등 특정 글의 글자를 세는 프로그램은 일반적으로 공백을 제외한 글자수만을 
세는 기능도 가지고 있다.
어떠한 문자열을 입력받았을 때 줄바꿈과 공백을 제외한 글자수만을 리턴하는 코드를 작성하시오.

입력 예시
공백을 제외한
글자수만을 세는 코드 테스트

출력 예시
18
*/
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example("공백을 제외한 글자수만을 세는 코드 테스트"));
		System.out.println(example(" 제외한 글자수만을 세는 코드 테스트"));
		System.out.println(example(" 제외한 글자수만을 세는 코드 "));
	}
	public static int example(String str) {
		int result = 0;
		for(char ch :str.toCharArray()) {
			if(ch != ' ') result++;
		}
		return result;
	}
}
