package kr.green.exam0203;

import java.util.Scanner;

/*
문제 4] 완전수 구하기
자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수를 완전수라고 한다. 
예를 들면, 6과 28은 완전수이다. 
6=1+2+3 // 1,2,3은 각각 6의 약수 
28=1+2+4+7+14 // 1,2,4,7,14는 각각 28의 약수
입력으로 자연수 N을 받고, 출력으로 N 이하의 모든 완전수를 출력하는 코드를 작성하라.
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			int sum = 0; // 약수의 합
			for(int j=1;j<i;j++) { // 1부터 자신을뺸 값까지
				if(i%j==0) sum += j; // 나누어 떨어지면 약수이다.
			}
			if(i==sum) { // 약수의 합과 자신이 같으면 완전수
				System.out.print(i + " ");
			}
		}
		System.out.println();
		sc.close();
	}
}
