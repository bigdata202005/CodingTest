package kr.green.exam0203;

/*
문제 1] 1~1000에서 각 숫자의 개수 구하기
예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자

10 = 1, 0
11 = 1, 1
12 = 1, 2
13 = 1, 3
14 = 1, 4
15 = 1, 5

그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
 */
public class Ex01 {
	public static void main(String[] args) {
		example();
	}

	public static void example() {
		int [] cnt = new int[10]; //  개수를 구할 배열
		for(int i=1;i<=1000;i++) {
			int t = i;
			while(t>0) {
				cnt[t%10]++;
				t /= 10;
			}
		}
		for(int i=0;i<cnt.length;i++) {
			System.out.println(i + " : " + cnt[i] + "개");
		}
	}
}
