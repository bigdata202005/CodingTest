package kr.green.exam0210;

/*
문제 4] MVP를 찾아라
게임 개발
당신이 참여했던 RPG게임이 대박이 나서 당신과 당신의 회사는 새로운 게임을 개발하기로 했다.
여러 날의 회의 끝에 새로운 게임의 장르는 AOS(MOBA)로 현재 자신들의 RPG게임의 IP를 사용하기로 했다.
그렇게 몇 날 며칠을 토론을 하며 게임의 틀이 잡혀졌고 각고의 노력 끝에 게임을 출시했다.
반응은 좋았으나 많은 사람들이 게임에 MVP시스템이 있었으면 좋겠다고 게임 고객센터에 요청을 했다.
빠져나가기 쉬운 유저들을 붙잡아두기 위해선 유저들의 요청을 하루빨리 시행해야 했고
그 결과 실력이 가장 좋은 당신이 프로그래밍을 맡게되었다.
최대한 빠른 시일 내에 MVP를 출력하는 프로그램을 작성하시오.

조건
한 게임의 유저는 총 열명으로 두팀으로 나뉜다. (A1,A2...A5 와 B1,B2...B5로 구성된다.)
총 10줄에 걸쳐 각 유저들의 K/D/A를 입력받고 그에 따른 점수가 가장 높은 유저를 출력한다.
점수는 (K * 2 + A )/ (D+1) 을 기준으로 한다.
만약 같은 팀인데 점수가 똑같다면 점수가 똑같은 사람중에 어느 누구를 출력해도 상관이 없다.

1차 업데이트
이 게임도 성공을 하고 운영을 하던 도중 또 MVP시스템을 수정해달라는 글이 여럿 올라왔었다.
바로 연속으로 상대를 처치한 게임에서 자기가 MVP가 되지 않았다며 이에 반발을 했다.
그리고 자신의 팀이 이겼고 상대와 내가 점수가 똑같은데 왜 상대가 MVP냐는 글도 여럿 있었다.
그 글들을 보고 난 당신은 또 다시 MVP시스템을 업그레이드 하게 되었다.
업데이트 항목 : 연속으로 상대를 처치함에 따라 점수를 더하고 승리한 팀에게 모두 1점을 더하시오.
펜타킬 : P : 4
쿼드라킬 : Q : 3
트리플킬 : T : 2
더블킬 : D : 1
없음 : N : 0

입력
3/0/4 D
2/5/6 N
12/4/2 P
1/2/8 N
2/2/8 N
5/5/2 T
1/5/2 N
1/3/1 N
2/4/5 N
4/3/5 Q

출력
A3

오류가 있는 데이터는 존재하지 않는다. 즉, 데이터로는 더블킬인데 킬은 2킬보다 적은 경우는 주어지지 않는다.
데이터는 순서대로 주어지며 언제나 위쪽에 있는 데이터 5줄이 승자다.
 */
public class Ex04 {
	public static void main(String[] args) {
		example("3/0/4 D,2/5/6 N,12/4/2 P,1/2/8 N,2/2/8 N,5/5/2 T,1/5/2 N,1/3/1 N,2/4/5 N,4/3/5 Q".split(","));
	}

	public static void example(String[] ar) {
		int score[] = new int[ar.length]; // 점수를 저장할 배열
		// K/D/A , (K * 2 + A )/ (D+1)
		int max = -1, index = 0;
		for(int i=0;i<ar.length;i++) {
			String s = ar[i];
			int k = Integer.parseInt(s.split(" ")[0].split("/")[0]);
			int d = Integer.parseInt(s.split(" ")[0].split("/")[1]);
			int a = Integer.parseInt(s.split(" ")[0].split("/")[2]);
			String kill = s.split(" ")[1];
			// 업테이트 코드가 들어가야 한다.
			switch (kill) {
			case "P":
				 k *= 5;
				break;
			case "Q":
				k *= 4;
				break;
			case "T":
				k *= 3;
				break;
			case "D":
				k *= 2;
				break;
			}
			score[i] = (k * 2 + a)/(d+1);
			System.out.println(k + ", " + d + ", " + a + " : " + kill + " = " + score[i]);
			
			if(score[i]>max) {
				max = score[i];
				index = i;
			}
		}
		System.out.println(index);
		System.out.println((index<5 ? "A" : "B") + (index%5+1));
	}
}
