package kr.green.exam0127;

import java.util.Scanner;

/*
 주민 등록 번호 유효성 검사하기
1. 주민번호 앞부터 12자리(지역번호까지)까지 각 자리를 2 3 4 5 6 7 8 9 2 3 4 5까지 곱한다.
2. 나온 숫자를 모두 더한다.
3. 더한 숫자를 11로 나눈 나머지를 구한다.
4. 11에서 나머지를 뺀 숫자를 구한다.
5. 4번의 결과를 10으로 나는 나머지를 구한다.
6. 5번의 결과가 13번째 자리와 같으면 올바른 주민번호이다.
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주민번호 -없이 13자리 입력(종료는 0) : ");
			String jj = sc.nextLine();
			if(jj.equals("0")) break;
			if(jj.length()!=13) { // 문자열.length() : 문자열의 길이
				System.out.println("13자리가 아닙니다.");
				continue;
			}
			try {
				Long.parseLong(jj); // long형으로 변환
			}catch (Exception e) {
				System.out.println("숫자만 입력해야 합니다.");
				continue;
			}
			// 여기까지 내려왔다는 것은 숫자로 13자리가 입력되었다.....
			// 1. 주민번호 앞부터 12자리(지역번호까지)까지 각 자리를 2 3 4 5 6 7 8 9 2 3 4 5까지 곱한다.
			// 2. 나온 숫자를 모두 더한다.
			int sum = 0;
			for(int i=0;i<12;i++) {
				// 문자열.chatAt(위치) : 1글자 얻기
				// System.out.println(jj.charAt(i) + ", " + (jj.charAt(i) - '0') + ", " +  ((i%8)+2));
				// jj.charAt(i) : char타입을 리턴하므로 계산을하면 ASCII코드값으로 계산 됩니다 
				// System.out.println(jj.charAt(i) + " * " +  ((i%8)+2) + " = " +  ((jj.charAt(i)) * ((i%8)+2)));
				// 그래서 문자를 숫자로 변환해야 한다. 
				// '1' - '0' = 49 - 48 = 1
				// 1  + '0' = 1 + 48 = 49 = '1'
				System.out.println(jj.charAt(i) + " * " +  ((i%8)+2) + " = " +  ((jj.charAt(i)-'0') * ((i%8)+2)));
				sum +=  (jj.charAt(i) - '0') * ((i%8)+2);
			}
			// 3. 더한 숫자를 11로 나눈 나머지를 구한다. 	 :   (sum%11)
			// 4. 11에서 나머지를 뺀 숫자를 구한다. 			 :  (11- (sum%11))
			// 5. 4번의 결과를 10으로 나는 나머지를 구한다.		: 	 (11- (sum%11)) % 10
			sum = (11- (sum%11)) % 10;
			
			if(jj.charAt(12)==sum + '0') {
				System.out.println(jj.substring(0,6) + "-" + jj.substring(6) + "는 맞는 번호입니다.");
			}else {
				System.out.println(jj.substring(0,6) + "-" + jj.substring(6) + "는 틀린 번호입니다.");
			}
		}
		sc.close();
	}

}
