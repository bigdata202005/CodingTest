package kr.green.exam0217;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
문제 2] Primary Arithmetic(첫 번째 계산)
아이들은 여러 자리 숫자들을 더하기 위해서 우에서 좌로 숫자를 하나씩 차례대로 더 하라고 배웠다. 
1을 한 숫자 위치에서 다음 자리로 더하기위해 이동하는 "한자리올림"연산을 많이 발견하는 것은 중요한 
도전이 된다. 
당신의 일은 교육자가 그들의 어려움을 평가하기 위하여, 덧셈 문제들의 각 집합에 대해서 한자리올림 
연산들의 수를 계산하는 것이다.

입력
입력의 각 라인은 10개의 숫자들보다 미만인 양의 정수들 두 개를 포함한다. 
입력의 마지막 라인은 0 0 을 포한한다.

출력
마지막을 제외한 입력의 각 라인에 대해서 당신은 두 숫자들을 더한 결과에서 
한자리올림 연산들의 수를 아래 처럼 보여지는 형식으로 계산하여 출력해야 한다.

입력 샘플
123 456
555 555
123 594
0 0

출력 샘플
No carry operation.
3 carry operations.
1 carry operation.


 */
public class Ex02 {
	public static void main(String[] args) {
		example();
	}
	public static  void example() {
		try {
			Scanner sc1 = new Scanner(new File("data.txt"));
			while(sc1.hasNextLine()) {
				String line = sc1.nextLine(); // 1줄 읽고
				Scanner sc2 = new Scanner(line); // 읽은 줄을 다시 스캐너로
				int n1 = sc2.nextInt(); // 정수로 읽기
				int n2 = sc2.nextInt();
				if(n1==0 && n2==0) break; // 종료
				int count = 0; // 자리올림 개수 세기
				if(n1>n2) { // 앞의 숫자가 크면 교환
					int t = n1;
					n1 = n2;
					n2 = t;
				}
				while(n1>0) {
					if(n1%10 + n2%10 >= 10) count++; // 각자리 합이 10이상이면 자리올림
					n1/=10; // 1자리 버림
					n2/=10;
				}
				if(count==0) {
					System.out.println("No carry operation.");
				}else if(count==1) {
					System.out.println("1 carry operation.");
				}else {
					System.out.println(count + " carry operations.");
				}
				sc2.close();
			}
			sc1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
