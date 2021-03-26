package kr.green.exam0215;

/*
문제 5] Cardinal to Ordinal 기수를 서수로 바꾸기
기수(Cardinal)를 입력하면 영어 서수(Ordinal)로 출력하는 함수를 작성합니다.
1, 21, 31, 41, ... → 1st, 21st, 31st, 41st, ...
2, 22, 32, 42, ... → 2nd, 22nd, 32nd, 42nd, ...
3, 23, 33, 43, ... → 3rd, 23rd, 33rd, 43rd, ...
11, 12, 13, 111, 112, 113, 211, 212, 213, ...  → 11th, 12th, 13th, 111th, 112th, 113th, 211th, 212th, 213th, ...
4, 5, 6, 11, 12, 13, 101, 111, 112, ... → 4th, 5th, 6th, 11th, 12th, 13th, 101th, 111th, 112th, ...
*/
public class Ex05 {
	public static void main(String[] args) {
		example(new int[] {1, 21, 31, 41});
		example(new int[] {2, 22, 32, 42});
		example(new int[] {3, 23, 33, 43});
		example(new int[] {11, 12, 13, 111, 112, 113, 211, 212, 213});
		example(new int[] {4, 5, 6, 11, 12, 13, 101, 111, 112});
	}
	public static void example(int[] ar) {
		for(int n : ar) {
		    if (n%10==1 && n%100!=11)
		        System.out.println(n+"st");
		    else if(n%10==2 && n%100!=12)
		    	System.out.println(n +"nd");
		    else if(n%10==3 && n%100!=13)
		    	System.out.println(n +"rd");
		    else
		    	System.out.println(n +"th");
		}
	}
}
