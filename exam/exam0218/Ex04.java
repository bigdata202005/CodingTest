package kr.green.exam0218;

import java.io.File;

/*
문제 1] 파일찾기
A라는 디렉토리 하위에 있는 텍스트 파일(*.txt) 중에서 LIFE IS TOO SHORT 라는 문자열을 포함하고 있는 
파일들을 모두 찾을 수 있는 프로그램을 작성하시오.
단, 하위 디렉토리도 포함해서 검색해야 함.
*/
public class Ex04 {
	public static void main(String[] args) {
		example("d:/IT_Java");
	}
	// 모든 파일목록 출력
	public static void example(String path) { // 경로를 받는다.
		File file = new File(path); // 파일객체 생성
		File list[] = file.listFiles(); // 폴더내의 모든 파일 목록을 받는다.
		for (File f : list) { // 반복
			if (f.isDirectory()) { // 디렉토리(폴더)하면
				example(f.getPath()); // 재귀호출
			} else { // 파일이라면
				System.out.println("file: " + f.getName()); // 출력
			}
		}
	}

}
