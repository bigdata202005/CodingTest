package kr.green.exam0127;

/*
수박수박수박수박수박수?
문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	수박수
4	수박수박
 */
public class Ex03 {
	public static void main(String[] args) {
		Solution solution = new Solution();
//		System.out.println(solution.solution(3));
//		System.out.println(solution.solution(4));
		System.out.println(solution.solution(9));
//		System.out.println(solution.solution2(3));
//		System.out.println(solution.solution2(4));
		System.out.println(solution.solution2(9));
//		System.out.println(solution.solution3(3));
//		System.out.println(solution.solution3(4));
		System.out.println(solution.solution3(9));
//		System.out.println(solution.solution4(3));
//		System.out.println(solution.solution4(4));
		System.out.println(solution.solution4(9));
	}

	static class Solution {
		public String solution(int n) {
			long start = System.nanoTime();
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<5000;i++) sb.append("수박"); // 10000글자를 만들고
			System.out.println("실행시간1 : " + (System.nanoTime()-start) + "ns");
			return sb.substring(0, n); // 원하는 길이만큼 잘라낸다.
		}
		public String solution2(int n) {
			long start = System.nanoTime();
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<n;i++) sb.append("수박".charAt(i%2)); // 원하는 길이만큼만 문자를 만든다.
			System.out.println("실행시간2 : " + (System.nanoTime()-start) + "ns");
			return sb.toString();
		}
		public String solution3(int n) {
			long start = System.nanoTime();
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<n;i++) {
				if(i%2==0)
					sb.append("수");
				else
					sb.append("박");
			}
			System.out.println("실행시간3 : " + (System.nanoTime()-start) + "ns");
			return sb.toString();
		}
		public String solution4(int n) {
			long start = System.nanoTime();
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<n;i++) {
				sb.append((i%2==0) ? "수" : "박");
			}
			System.out.println("실행시간4 : " + (System.nanoTime()-start) + "ns");
			return sb.toString();
		}
	}
}
