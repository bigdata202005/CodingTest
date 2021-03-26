package kr.green.exam0208;

/*
문제 2] 자릿수를 출력하는 프로그램
양의 정수만 입력으로 받고 그 수의 자릿수를 출력해보자.
ex1) 3 > 1자리수, 
ex2) 649 > 3자리수 ....
 */
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(example(3));
		System.out.println(example(649));
		System.out.println(example2(3));
		System.out.println(example2(649));
	}

	public static int example(int n) {
		return (n+"").length();
	}
	
	public static int example2(int n) {
		int length = 0;
		while(n>0) {
			length++;
			n/=10;
		}
		return length;
	}
	
	
}
