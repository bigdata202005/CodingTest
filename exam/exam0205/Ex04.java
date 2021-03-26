package kr.green.exam0205;
/*
문제 4] 이차방정식
A씨는 학교숙제로 이차방정식 문제를 풀어야 한다. 
하지만 시간이 얼마 없다. 
이 A씨를 도와주기 위한 이차방정식 풀이 프로그램을 작성해라.
(단, 일차방정식은 ax^2 + bx + c = 0의 꼴에서 a, b와 c를 입력받아 해를 구하고 
해를 구하기 위해 근의 공식을 사용해야 한다. 
또, 해는 정수로 반올림한 값을 구하고 해가 없거나 여러개인 경우도 모두 구해야 한다.)
 */
public class Ex04 {
	public static void main(String[] args) {
		example(1, 2, 3);
		example(1, 3, 1);
		example(1, 4, 4);

	}
	
	public static void example(int a, int b, int c) {
		 int D = b*b - 4*a*c; // 판별식
		 if(D>0) {
		        int x1 = (int) Math.round((-b + Math.sqrt(D)) / (2 * a));
		        int x2 = (int) Math.round((-b - Math.sqrt(D)) / (2 * a));
		        System.out.println(x1 + ", " + x2);
		 }else if(D==0) {
			 	int x=Math.round(-b/2*a);
		        System.out.println("중근입니다. " + x);
		 }else{
		        System.out.println("허근입니다");
		 }
	}
}
