package kr.green.exam0309;

/*
문제 3] 2016년
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
입출력 예
a	b	result
5	24	"TUE"
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
		assertEquals(solution.solution(1,1),"FRI");
		assertEquals(solution.solution(1,2),"SAT");
		assertEquals(solution.solution(5,24),"TUE");
	}

	static class Solution {
		public String solution(int a, int b) {
			String answer = "";
			int total = 0;
			String w[] = "FRI,SAT,SUN,MON,TUE,WED,THU".split(","); // 금,토,일,월,화,수,목
			int m[] = {31,29,31,30,31,30,31,31,30,31,30,31}; // 달의 마지막 날짜
			for(int i=1;i<a;i++) { // 전월까지의 일 수
				total += m[i-1];
			}
			total += b-1; // 일을 더한다.
			answer = w[total%w.length]; // 7로 나눈 나머지가 요일이다.
			System.out.println(answer);
			return answer;
		}
	}
}
