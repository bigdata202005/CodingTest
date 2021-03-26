package kr.green.exam0310;

/*
문제 3] 가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.

입출력 예
s			return
"abcde"		"c"
"qwer"		"we"
*/
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class Ex03 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution("abcde"), "c");
		assertEquals(solution.solution("qwer"), "we");
	}

	static class Solution {
		public String solution(String s) {
			String answer = "";
			if(s.length()%2==0) {
				answer = s.substring(s.length()/2-1,s.length()/2+1);
			}else {
				answer = s.charAt(s.length()/2)+"";
			}
			// System.out.println(answer);
			return answer;
		}
	}
}
