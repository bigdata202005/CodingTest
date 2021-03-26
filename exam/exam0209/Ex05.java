package kr.green.exam0209;

import java.util.Arrays;

/*
문제 5] 중앙값 구하기
리스트에 있는 숫자들의 중앙값을 구하는 프로그램을 만들어라.
[7, 9, 14] = 9
[24, 31, 35, 49] = 33
[17, 37, 37, 47, 57] = 37
중앙값 : 자료를 작은 값에서부터 크기순으로 나열할 때 중앙에 위치한 값
① 자료의 개수가 홀수이면 가운데 위치한 값이 중앙값이다.
② 자료의 개수가 짝수이면 가운데 위치한 두 값의 평균이 중앙값이다.
 */
public class Ex05 {
	public static void main(String[] args) {
		System.out.println(example(new int[] { 7, 9, 14 }));
		System.out.println(example(new int[] { 24, 31, 35, 49 }));
		System.out.println(example(new int[] { 17, 37, 37, 47, 57 }));
	}

	public static int example(int[] ar) {
		int result = 0;
		Arrays.sort(ar);
		int c = ar.length/2;
		if (ar.length % 2 == 0) {
			result = (ar[c-1]+ar[c])/2;
		} else {
			result = ar[c];
		}
		return result;
	}
}
