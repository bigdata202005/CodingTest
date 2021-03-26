package kr.green.exam0310;

import static org.junit.Assert.assertEquals;

/*
문제 2] 3진법 뒤집기
자연수 n이 매개변수로 주어집니다. 
n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 1 이상 100,000,000 이하인 자연수입니다.

입출력 예
n		result
45		7
125		229

입출력 예 설명

입출력 예 #1
답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
45			1200		0021				7
따라서 7을 return 해야 합니다.

입출력 예 #2
답을 도출하는 과정은 다음과 같습니다.
n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
125			11122		22111				229
따라서 229를 return 해야 합니다.
*/
import org.junit.Before;
import org.junit.Test;

public class Ex02 {
	Solution solution;

	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}

	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution(45), 7);
		assertEquals(solution.solution(125), 229);
		assertEquals(solution.solution2(45), 7);
		assertEquals(solution.solution2(125), 229);
		assertEquals(solution.solution3(45), 7);
		assertEquals(solution.solution3(125), 229);
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		int n = 45;
		String t = solution.dec2base(n, 3);
		System.out.println(t);
		t = solution.reverse(t);
		System.out.println(t);
		System.out.println(solution.base2dec(t, 3));
		
	}

	static class Solution {
	    public int solution(int n) {
	        StringBuffer sb = new StringBuffer(Integer.toString(n, 3));
			sb.reverse();
			int answer = Integer.parseInt(sb.toString(), 3);
	        return answer;
	    }
	    public int solution2(int n) {
	    	return Integer.parseInt(new StringBuffer(Integer.toString(n, 3)).reverse().toString(), 3);
	    }
	    public int solution3(int n) {
	    	String t = dec2base(n, 3);
			t = reverse(t);
			return base2dec(t, 3);
	    }
	    // 문자열 뒤집기
	    public String reverse(String str) {
	    	return new StringBuffer(str).reverse().toString();
	    }
	    // 10진법을 n진법으로
	    public String dec2base(int n, int base) {
	    	String ans = "";		//값을 더해주기 위한 빈 문자열 선언
	    	while (n > 0) {
	    		ans = (n % base) + ans;	//문자열의 앞에 num을 n으로 나눴을 때의 나머지를 더해준다.
	    		n /= base;		//다음 턴을 위해 num을 n으로 나눠준다.
	    	}
	    	return ans;
	    }
	    // n진법을 10진수로
	    public int base2dec(String n, int base) {
	    	int t = 1;
	    	int result = 0;
	    	for(int i=n.length()-1;i>=0;i--) {
	    		result += (n.charAt(i)-'0') * t;
	    		t *= base;
	    	}
	    	return result;
	    }
	}
}
