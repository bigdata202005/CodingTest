package kr.green.exam0127;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 로또 번호 자동 생성기
 * 난수 : 사용자도 예측할 수 없는 수
 * JAVA에서는 두가지를 지원합니다. 
 */
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("몇게임 : ");
		int game = sc.nextInt();
		while(game>=0) {
			Set<Integer> lotto = new TreeSet<Integer>();
			while(lotto.size()<6) {
				lotto.add(rnd.nextInt(45)+1);
			}
			System.out.println(lotto);
			game--;
		}
		sc.close();
	}
}
