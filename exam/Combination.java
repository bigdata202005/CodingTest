package kr.green.exam;
/*
조합이란 n 개의 숫자 중에서 r 개의 수를 순서 없이 뽑는 경우를 말합니다.
예를 들어 [1, 2, 3] 이란 숫자 배열에서 2개의 수를 순서 없이 뽑으면
[1, 2]
[1, 3]
[2, 3]

이렇게 3 개가 나옵니다.
순열을 뽑았을 때 나오는 [2, 1] [3, 1] [3, 2] 등은 중복이라서 제거됩니다.
부분 집합처럼 이해하시면 됩니다.

여러 가지 방법이 있지만 핵심은 하나입니다.

배열을 처음부터 마지막까지 돌며
현재 인덱스를 선택하는 경우
현재 인덱스를 선택하지 않는 경우
이렇게 두가지로 모든 경우를 완전탐색 해주시면 됩니다.

변수	설명
arr		조합을 뽑아낼 배열
output	조합에 뽑혔는지 체크하는 배열
n		배열의 길이
r		조합의 길이

순열과 달리 조합은 r 을 유지할 필요가 없으므로 숫자를 하나 뽑을때마다 r 을 하나씩 줄여줍니다.
r == 0 일 때가 r 개의 숫자를 뽑은 경우입니다.

백트래킹 이용하여 구현
start 변수는 기준입니다.
start 인덱스를 기준으로 start 보다 작으면 뽑을 후보에서 제외, start 보다 크면 뽑을 후보가 됩니다.

예를 들어 [1, 2, 3] 배열이 있고 start 가 0 부터 시작합니다.
함수에 들어오면 먼저 i 가 start 부터 시작하는 for 문에 들어갑니다.
만약 0 인덱스인 1을 뽑는다면 visited[i] 는 true 가 되고 뽑지 않는다면 visited[i] 는 false 입니다.
1을 선택한 경우와 선택하지 않은 경우 둘 다 봐야합니다.
하지만 더이상 1은 고려 대상이 아니기 때문에 다음 for 문은 무조건 i+1 부터 시작해주어야 합니다.
 */
/**
 * 조합 : n 개 중에서 r 개 선택
 */
public class Combination {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
            comb(arr, visited, 0, n, i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
            combination(arr, visited, 0, n, i);
        }
    }

    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    // 재귀 사용
    // 사용 예시 : comb(arr, visited, 0, n, r)
    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }
        
        if (depth == n) {
            return;
        }

        visited[depth] = true;
        comb(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        comb(arr, visited, depth + 1, n, r);
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
