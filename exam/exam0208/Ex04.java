package kr.green.exam0208;

import java.util.Arrays;

/*
문제 4] 자신을 제외한 곱셈
배열 [a, b, c, d]를 입력하면 배열[bcd, acd, abd, abc]를 출력하는 코드를 작성하시오.
(단, 나눗셈 사용 금지)
입출력되는 배열은 어떤 형식이든 상관없습니다.

입력 예시
2, 6, 4, 7

출력 예시
168, 56, 84, 48
 */
public class Ex04 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(example(new int[] {2,6,4,7})));
	}
	
	public static int[] example(int[] ar) {
		 int result[] = new int[ar.length];
		 for(int i=0;i<ar.length;i++) {
			 result[i] = 1; // 곱하기이므로 1로 초기화
			 for(int j=0;j<ar.length;j++) {
				 if(i!=j) result[i] *= ar[j]; // 같지 않을때만 곱한다.
			 }
		 }
		 return result;
	}
}
