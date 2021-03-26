package kr.green.exam0215;

/*
문제 3] 대각선 길이 구하기
직각삼각형의 밑변이 x, 높이가 y일 때 남은 변(대각선)의 길이를 구하는 함수를 만들어주세요.
ps. 요즘 대각선계산기 어플이 인기가 있는 걸 보고 한번 직접 만들어보는 것도 좋다고 생각해서 
문제를 만들어 올립니다.
*/
public class Ex03 {
	public static void main(String[] args) {
		System.out.println(example(3,4));
		System.out.println(example(1,2));
	}

	public static double example(int x, int y) {
		return Math.sqrt(x*x + y*y);
	}
}
