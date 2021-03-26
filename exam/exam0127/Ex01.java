package kr.green.exam0127;

public class Ex01 {
	public static void main(String[] args) {
		int count = 0;		// 개수를 세어줄 변수
		for(int i=1;i<=10000;i++) { // 1~10000까지 반복
			int t = i; // 임시 변수로 피신
			while(t>0) {  // t값이 0보다 클때까지 반복
				if(t % 10==8) count++; // %10하면 맨 뒷자리 1자리가 나온다. 이숫자가 8이면 개수 증가
				t /= 10; // 맨뒷자리를 계산 했으면 버린다.
			}
		}
		System.out.println("8의 개수 : " + count);
	}
}
