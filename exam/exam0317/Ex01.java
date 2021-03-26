package kr.green.exam0317;

import static org.junit.Assert.assertEquals;

/*
문제 1] 문자열을 정수로 바꾸기
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

제한 조건
s의 길이는 1 이상 5이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 "0"으로 시작하지 않습니다.
입출력 예
예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
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
		assertEquals(solution.solution("1234"), 1234);
		assertEquals(solution.solution("-1234"), -1234);
	}

	static class Solution {
		public int solution(String s) {
			// return Integer.parseInt(s); // int리턴
			return Integer.valueOf(s); // Integer 리턴
		}
	}
}
