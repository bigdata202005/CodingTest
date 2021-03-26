package kr.green.exam0210;

/*
문제 1] 홀수와 짝수의 개수 구하기
홀수와 짝수의 개수를 구하는 프로그램을 만들어라.
[3, 4, 5, 6, 7]
= 홀수 3개, 짝수 2개
[12, 16, 22, 24, 29]
= 홀수 1개, 짝수 4개 
[41, 43, 45, 47, 49]
= 홀수 5개, 짝수 0개
홀수 : 2로 나누어 떨어지지 않는 정수
짝수 : 2로 나누어 떨어지는 정수
*/
public class Ex01 {
	public static void main(String[] args) {
		example(new int[] {3, 4, 5, 6, 7});
		example(new int[] {12, 16, 22, 24, 29});
		example(new int[] {41, 43, 45, 47, 49});

	}
	public static void example(int[] ar) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) count++;
		}
		System.out.println("홀수 " + (ar.length-count) + "개, 짝수 " + count +"개");
	}

}
