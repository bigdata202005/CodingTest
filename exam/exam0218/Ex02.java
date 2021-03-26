package kr.green.exam0218;

/*
문제 2] 다음 입사문제 중에서
1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. 
(단 점들의 배열은 모두 정렬되어있다고 가정한다.)
예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
 */
public class Ex02 {
	public static void main(String[] args) {
		example(new int[] {1, 3, 4, 8, 13, 17, 20});
	}
	public static  void example(int[] ar) {
		// 두수 사이의 최소값
		int min = ar[ar.length-1], index = 0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i+1]-ar[i]<min) {
				min = ar[i+1]-ar[i];
				index = i;
			}
		}
		System.out.println("(" + ar[index] + ", " + ar[index+1] + ")");
	}
}
