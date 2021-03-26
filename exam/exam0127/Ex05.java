package kr.green.exam0127;
/*
 게시판 페이징
A씨는 게시판 프로그램을 작성하고 있다.
A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
출력 : 총페이지수
A씨가 필요한 프로그램을 작성하시오.

예) 프로그램 수행 시 다음과 같은 결과값이 나와야 함.
m	n	출력
0	1	0
1	1	1
2	1	2
1	10	1
10	10	1
11	10	2
 */
public class Ex05 {
	public static void main(String[] args) {
		System.out.println(paging(0, 1));
		System.out.println(paging(1, 1));
		System.out.println(paging(2, 1));
		System.out.println(paging(1, 10));
		System.out.println(paging(10, 10));
		System.out.println(paging(11, 10));
		System.out.println("~~~~~~~");
		for(int i=1;i<=20;i++) System.out.println(i + ", " + 5 + " = " + paging2(i, 5));
	}
	public static int paging(int totalCount, int pageSize) {
		int totalPage = totalCount/pageSize; // 천체개수를 페이지당개수로 나눈 몫이 총페이지 수이다.
		if(totalCount%pageSize!=0) totalPage++; // 이때 총갯수가 페이지당 개수의 배수가 아니면 +1을 해줘야 함!!!!
		return  totalPage;
	}
	// 위 문제를 if문 없이 해결하시오!!!!
	public static int paging2(int totalCount, int pageSize) {
		return  (totalCount-1)/pageSize + 1;
	}

}
