package kr.green.exam0315;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/*
문제 2] 문자열 다루기 기본
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
s		return
"a234"	false
"1234"  true
*/
public class Ex02 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertFalse(solution.solution("a234"));
		assertTrue(solution.solution("1234"));
	}
	static class Solution {
		boolean solution(String s) {
            if(s.length()!=4 && s.length()!=6) return false; // 길이가 조건에 맞지 않으면 거짓
            try {
	    	   Double.parseDouble(s); // 숫자로 변경. 에러가 나면 숫자가 아니다.
	    	   return true; // 에러가 없다면 숫자만로 되어있다.
	       }catch (Exception e) {
	    	   return false; // 에러가 났다는것은 숫자로 변경 못한다. 즉, 숫자 아닌놈이 있다.
	       }
	    }
	}
}
