package kr.green.exam0127;
/*
 1 2 3 1 2 3 .... 
 123을 10번 출력하시오
 
 3 4 5 3 4 5 3 4 5 .... 
 3 4 5을 10번 출력하시오
 
 */
public class Ex06 {
	public static void main(String[] args) {
		for(int i=0;i<30;i++) {
			System.out.print(i%3+1 + " ");
		}
		System.out.println();
		for(int i=0;i<30;i++) {
			System.out.print(i%3+3 + " ");
		}
		System.out.println();
	}
}
