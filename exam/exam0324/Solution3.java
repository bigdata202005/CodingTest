package kr.green.exam0324;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		int ar[] = {1,3,2,5,4};

		System.out.println(solution(ar, 9));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);
		int i = 0;
		do {
			budget -= d[i++];
			answer++;
			System.out.println(budget);
		}while(i< d.length && (budget > 0 || budget>d[i]));
		return --answer;
	}

}