package kr.green.exam0127;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 로또 번호 자동 생성기
 * 난수 : 사용자도 예측할 수 없는 수
 * JAVA에서는 두가지를 지원합니다. 
 */
public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("몇게임 : ");
		int game = sc.nextInt();
		while(game>=0) {
			int lotto[] = new int[6];
			for(int i=0;i<lotto.length;i++) { // 6개
				lotto[i] = rnd.nextInt(45)+1; // 난수 발생
				for(int j=0;j<i;j++) { // 중복 검사
					if(lotto[i]==lotto[j]) {
						i--; // 현재 발생한 번호를 버린다.
						break;
					}
				}
			}
			Arrays.sort(lotto); // 정렬
			System.out.println(Arrays.toString(lotto)); // 배열 출력
			game--;
		}
		sc.close();
	}
}
