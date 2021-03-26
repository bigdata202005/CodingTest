package kr.green.exam0303;

/*
문제 1]ASCII Art N
Write a program that lets the user enter in an odd positive integer (you may assume the input is always valid), 
and prints out an ASCII art letter N made using the character N.

If the input is 1, the output is:
N
If the input is 3, the output is:

N N
NNN
N N
If the input is 5, the output is:

N   N
NN  N
N N N
N  NN
N   N
If the input is 7, the output is:

N     N
NN    N
N N   N
N  N  N
N   N N
N    NN
N     N
The pattern continues on like this. The output may contain trailing spaces.
*/
public class Ex01 {
	public static void main(String[] args) {
		example(1);
		example(3);
		example(5);
		example(7);
	}

	public static void example(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("N");
			for (int j = 1; j < n; j++) {
				if (i == j || (j == 0 || j == n - 1)) // 첫번째칸 또는 마지막칸 또는 i==j일때만 N출력
					System.out.print("N");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
