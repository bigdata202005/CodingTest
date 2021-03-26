package kr.green.exam0308;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
/*
문제 1] 완주하지 못한 선수
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"]

입출력 예 설명
예제 #1 : "leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
예제 #2 : "vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
예제 #3 : "mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
*/
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Ex01 {
	public static void main(String[] args) throws FileNotFoundException {
		Solution solution = new Solution();
		System.out.println(solution.solution(new String[] {"leo", "kiki", "eden"},new String[] {"eden", "kiki"}));
		System.out.println(solution.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},
				                             new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println(solution.solution(new String[] {"mislav", "stanko", "mislav", "ana"},
				                             new String[] {"stanko", "ana", "mislav"}));
	}
	Solution solution;
	@Before // 테스트 전에 실행할 메서드 지정
	public void before() {
		solution = new Solution();
	}
	// 테스트에 사용할 메서드 지정
	@Test
	public void test() {
		assertEquals(solution.solution(new String[] {"leo", "kiki", "eden"},new String[] {"eden", "kiki"}),"leo");
		assertEquals(solution.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},
                                       new String[] {"josipa", "filipa", "marina", "nikola"}),"vinko");
		assertEquals(solution.solution(new String[] {"mislav", "stanko", "mislav", "ana"},
                                       new String[] {"stanko", "ana", "mislav"}),"mislav");
	}
	// 문제 풀이
	static class Solution {
	    public String solution(String[] participant, String[] completion) {
	    	 // 정렬
	         Arrays.sort(participant);
	         Arrays.sort(completion);
	         int i;
	         for ( i=0; i < completion.length; i++){ // 완주자 반복
	            if (!participant[i].equals(completion[i])){ // 같지 않으면
	                return participant[i]; // 완주하지 못한사람
	            }
	        }
	        return participant[i]; // 마지막까지 반복했는데 모두 있다면 참가자중 마지막 사람이 완주하지 못했다.
	    }
	}
}
