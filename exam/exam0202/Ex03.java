package kr.green.exam0202;

/*
문제 3] 버전비교
A씨는 두 개의 버전을 비교하는 프로그램을 작성해야 한다.
버전은 다음처럼 "." 으로 구분된 문자열이다.
버전 예) 1.0.0, 1.0.23, 1.1
두 개의 버전을 비교하는 프로그램을 작성하시오.
다음은 버전 비교의 예이다.
0.0.2 > 0.0.1
1.0.10 > 1.0.3
1.2.0 > 1.1.99
1.1 > 1.0.1
 */
public class Ex03 {
	public static void main(String[] args) {
		example("0.0.2", "0.0.1");
		example("1.0.10", "1.0.3");
		example("1.2.0", "1.1.99");
		example("1.1", "1.0.1");
		example("1.1", "1.1.1");
	}
	public static void example(String v1, String v2) {
		String[] t1 = v1.split("\\."); // .츠로 잘라서 배열로
		String[] t2 = v2.split("\\.");
		int min = Math.min(t1.length, t2.length); // 배열의 길이가 적은놈
		boolean flag = false; // 출력 여부 판단
		int i=0; // 배열 인덱스
		while(i<min) { // 길이가 적은 배열만큼만!!!
			int n1 = Integer.parseInt(t1[i]);  // 숫자로
			int n2 = Integer.parseInt(t2[i]);
			if(n1>n2) {
				flag = true; // 출력했다고 표시
				System.out.println(v1 + " > " + v2);
				break;
			}else if(n2>n1) {
				flag = true;
				System.out.println(v1 + " < " + v2);
				break;
			}else {
				i++; // 두개값이 같으면 다음으로
			}
		}
		if(!flag) { // 출력이되지 않았을때만 앞자리가 모두 같다!!!!
			if(t1.length>t2.length) {
				System.out.println(v1 + " > " + v2);
			}else if(t1.length<t2.length) {
				System.out.println(v1 + " < " + v2);
			}
		}
		
	}
}
