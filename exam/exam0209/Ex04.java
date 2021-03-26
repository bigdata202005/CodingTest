package kr.green.exam0209;

/*
문제 4] 평균 구하기
리스트에 있는 숫자들의 평균을 구하는 프로그램을 만들어라.
[4, 6, 8] = 6
[11, 17, 20, 24] = 18
[26, 33, 45, 51, 60] = 43
평균 : 자료의 값의 총합을 자료의 개수로 나눈 값
 */
public class Ex04 {
	public static void main(String[] args) {
		System.out.println(example(new int[] {4, 6, 8}));
		System.out.println(example(new int[] {11, 17, 20, 24}));
		System.out.println(example(new int[] {26, 33, 45, 51, 60}));
	}
	
	public static int example(int[] ar) {
		 int sum = 0;
		 for(int i=0;i<ar.length;i++) {
			 sum += ar[i];
		 }
		 return sum/ar.length;
	}
}
