package kr.green.exam0305;

/*
문제 2] 소수의 개수 구해보기.
2이상 1000이하 자연수의 집합에서 소수의 개수를 구하는 알고리즘을 작성하시오. 

에라토스테네스의 체 : 소수를 구하는 방법 중 하나입니다.
*/

public class Ex02 {
	public static void main(String[] args) {
		example(1000);
	}

	public static void example(int n) {
		boolean ar[] = new boolean[n];
		ar[0] = ar[1] = true;
		// 2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
	    // (지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
	    for(int i=2;i<n;i++) {
	        if(ar[i]) continue; // 이미 지워진 수라면 건너뛰기
	        // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
	        for(int j=2*i;j<n; j+=i) {
	            ar[j] = true;
	        }
	    }
	    int count = 0;
	    for(int i=0;i<n;i++) {
	    	if(!ar[i]) {
	    		System.out.printf("%4d", i);
	    		count++;
	    		if(count%10==0) System.out.println();
	    	}
	    }
	    System.out.println("\n" + count + "개!!!");

	}
}
