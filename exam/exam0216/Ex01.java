package kr.green.exam0216;

import java.util.Random;

/*
문제 1] 배스킨라빈스31게임
게임규칙
게임의 참여자들은 차례를 정해 1부터 31까지의 수를 순차적으로 부른다. 
한번에 1~3개까지 수를 연달아 부를 수 있으며, 마지막 31을 부른 사람이 진다.
컴퓨터가 무조건 먼저 시작하고,1P는 무조건 2번째로 말한다.컴퓨터가 무조건 이기게 만들어라.
LEVEL1 예상
힌트1:4n-2라는 공식을 사용하면 됩니다.
힌트2:이 게임은 31을 부르면 지는 게임이니 30을 부르면 이깁니다.
*/
public class Ex01 {
	public static void main(String[] args) {
		example();
	}
	public static void example() {
		// 3개의 숫자를 낼 수 있다면, 상대방이 낸 갯수와 내가 낸 갯수가 4가 되도록 계속해나가면, 
		// 나중에는 내가 30까지만 부르면 되도록 합니다. 
		// 그러려면 30은 28+2니까 처음에 2개를 부르고, 나머지는 4개씩 맞춰나가면 30까지 채워집니다.
		Random rnd = new Random();
		System.out.println("COM : 1, 2");
		int k = 3;
		while(true) {
			int n = rnd.nextInt(3)+1; // 1~3까지 난수
			System.out.print("P1 : ");
			for(int i=1;i<=n;i++) {
				System.out.print(k + " ");
				if(k==31) {
					System.out.println("\nP1이 졌다!!!");
					return;
				}
				++k;
			}
			System.out.println();
			System.out.print("COM : ");
			for(int i=1;i<=4-n;i++) {
				System.out.print(k + " ");
				if(k==31) {
					System.out.println("\nCOM이 졌다!!!");
					return;
				}
				++k;
			}
			System.out.println();
			
		}
		
		
	}

}
