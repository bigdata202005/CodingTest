package kr.green.exam0315;

import static org.junit.Assert.assertEquals;

/*
문제 3] 문자열 내림차순으로 배치하기
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s			return
"Zbcdefg"	"gfedcbZ"
*/

import java.util.Arrays;
import java.util.Collections;

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
		assertEquals(solution.solution("Zbcdefg"),"gfedcbZ");
	}

	static class Solution {
		public String solution(String s) {
			String[] str = s.split(""); // 문자열 배열
			Arrays.sort(str, Collections.reverseOrder());// 정렬
			return String.join("", str); // 배열을 합쳐 1개의 문자열로 만든다.
		}
	}
}
