package kr.green.exam0226;

/*
문제 1]10진수를 n진수로 변환하기
9다음은 233 이란 10진수를 2진수로 변환하는 과정을 나타낸 그림이다.
위 그림을 참조하여 라이브러리를 사용하지 말고 10진수를 n진수로 변환하는 프로그램을 작성하시오..
(단, n의 범위는 2 <= n <= 16)

예)
2진수로 변환 : 233 --> 11101001
8진수로 변환 : 233 --> 351
16진수로 변환 : 233 --> E9
*/
public class Ex01 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.println(i + " : " + example(i, 2) + ", " + example(i,8) + ", " + example(i,16));
		}
		System.out.println(example(233,2));
		System.out.println(example(233,8));
		System.out.println(example(233,16));
		System.out.println(Integer.toBinaryString(233));
		System.out.println(Integer.toOctalString(233));
		System.out.println(Integer.toHexString(233));
	}

	public static String example(int n, int base) {
		String result = "";
		String str = "0123456789ABCDEF";
		while(n!=0) {
			result = str.charAt(n%base) + result; // 나눈 나머지를 앞에 붙인다.
			n/=base; // 나눈 몫을 가지고 반복
		}
		return result;
	}
}
