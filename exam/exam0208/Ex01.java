package kr.green.exam0208;

import java.util.Arrays;

/*
문제 1] 어느 숫자가 중간값을 가지는 숫자일까?
3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간값을 가지는 숫자를 출력하세요. 
ex1) 2, 5, 3 => 3 
ex2) 4, 6, 4 => 4
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(example(2, 5, 3));
		System.out.println(example(4, 6, 4));
		
		System.out.println(example2(2, 5, 3));
		System.out.println(example2(4, 6, 4));
	}
	public static int example2(int a, int b, int c) {
		int ar[] = {a,b,c};
		Arrays.sort(ar);
		return ar[1];
	}
	
	public static int example(int a, int b, int c) {
		if (a > b) { // 앞의 두개에서 앞에것이 크면 교환
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		if (b > c) { // 뒤의 두개에서 앞에것이 크면 교환
			b = b ^ c;
			c = b ^ c;
			b = b ^ c;
		}
		if (a > b) {  // 앞의 두개에서 앞에것이 크면 교환
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		return b;
	}
}
