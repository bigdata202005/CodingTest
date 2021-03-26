package kr.green.exam0209;

/*
문제 3] 숫자를입력받으면 그에맞는자릿수 출력
(난이도:기초) 숫자를 입력받으면 그에해당하는 자릿수를 출력하는 코드를 작성하라.
입력 : 156 출력 : 100의자리수
입력 : 18961 출력 : 10000의자릿수
*/
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example(156) + "의 자릿수");
		System.out.println(example(18961) + "의 자릿수");
	}

	public static int example(int n) {
		int result = 1;
		while (n > 10) {
			result *= 10;
			n /= 10;
		}
		return result;
	}
}
