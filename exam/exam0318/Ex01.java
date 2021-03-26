package kr.green.exam0318;

import static org.junit.Assert.assertEquals;

/*
문제 1] 이상한 문자 만들기
문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

입출력 예
s					return
"try hello world"	"TrY HeLlO WoRlD"
입출력 예 설명
"try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 
각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 
"TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
*/
import org.junit.Before;
import org.junit.Test;

public class Ex01 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution("try hello world"), "TrY HeLlO WoRlD");
	}

	static class Solution {
		public String solution(String s) {
			String answer = "";
			String[] ar = s.split(" "); // 단어 구분하여 배열로
			//System.out.println(Arrays.toString(ar) + " : " + ar.length);
			for(String t : ar) {
				if(t.contains(" ")) { // 공백이면 공백을 더해주고
					answer += " ";
					continue;
				}
				// 단어별로 홀짝 판단해서 대소문자로 변환
				for(int i=0;i<t.length();i++) {
					answer += i%2==0 ? (t.charAt(i)+"").toUpperCase() : (t.charAt(i)+"").toLowerCase();
				}
				answer += " ";
			}
			System.out.println(answer.trim());
			return answer.trim();
		}
	}
}
