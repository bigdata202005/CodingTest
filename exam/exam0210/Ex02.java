package kr.green.exam0210;

/*
문제 2] 삼각형 구별하기
3개의 각으로 삼각형의 예각, 직각, 둔각을 구별하는 프로그램을 만들어라.
[60, 60, 60] = 예각삼각형
[30, 60, 90] = 직각삼각형
[20, 40, 120] = 둔각삼각형
[0, 90, 90] = 삼각형이 아니다
[60, 70, 80] = 삼각형이 아니다
[40, 40, 50, 50] = 삼각형이 아니다
예각삼각형 : 3개의 각이 모두 예각인 삼각형
직각삼각형 : 1개의 각이 직각인 삼각형
둔각삼각형 : 1개의 각이 둔각인 삼각형
① 각이 3개가 아닐 경우 삼각형이 아니다.
② 3개의 각의 합이 180°가 아닐 경우 삼각형이 아니다.
 */
public class Ex02 {
	public static void main(String[] args) {
		example(new int[] {60, 60, 60});
		example(new int[] {30, 60, 90});
		example(new int[] {20, 40, 120});
		example(new int[] {0, 90, 90});
		example(new int[] {60, 70, 80});
		example(new int[] {40, 40, 50, 50});

	}

	public static void example(int[] ar) {
		if(ar.length!=3 || ar[0]<=0 || ar[1]<=0 ||ar[2]<=0 || ar[0]+ar[1]+ar[2]!=180) {
			System.out.println("삼각형이 아니다.");
		}else if(ar[0]==90 || ar[1]==90 ||ar[2]==90) {
			System.out.println("직각 삼각형이다.");
		}else if(ar[0]>90 || ar[1]>90 ||ar[2]>90) {
			System.out.println("둔각 삼각형이다.");
		}else{
			System.out.println("예각 삼각형이다.");
		}
	}
	
}
