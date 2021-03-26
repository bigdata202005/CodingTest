package kr.green.exam0127;

import java.util.Random;

/*
 * 로또 번호 자동 생성기
 * 난수 : 사용자도 예측할 수 없는 수
 * JAVA에서는 두가지를 지원합니다. 
 */
public class Ex08 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(Math.random()); // 0~1사이의 난수 발생!!!
		}
		// 원하는 정수범위 난수 발생하기 : (int)(Math.random()*(최대-최소+1)) + 최소
		for(int i=0;i<10;i++) {
			// System.out.println((int)(Math.random()*(50-5+1)) +5); // 5~50사이의 난수 발생!!!
			System.out.println((int)(Math.random()*(101))); // 0~100사이의 난수 발생!!!
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// JDK 1.5에 추가
		Random rnd = new Random();
		for(int i=0;i<10;i++) {
			System.out.println(rnd.nextDouble()); // 0~1사이의 난수 발생!!!
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<10;i++) {
			System.out.println(rnd.nextInt()); // 정수 난수 발생!!!
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// 원하는 정수범위 난수 발생하기 : rnd.nextInt(최대-최소+1) + 최소
		for(int i=0;i<10;i++) {
			// System.out.println(rnd.nextInt(101)); // 0~100사이의 난수 발생!!!
			System.out.println(rnd.nextInt(46) + 5); // // 5~50사이의 난수 발생!!!
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<6;i++) {
			System.out.println(rnd.nextInt(45) + 1); // // 1~45사이의 난수 발생!!!
		}
	}
}
