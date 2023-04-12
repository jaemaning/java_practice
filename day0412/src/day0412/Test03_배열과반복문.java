package day0412;

import java.util.Arrays;
import java.util.Scanner;

public class Test03_배열과반복문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		for (int i=0; i<5; i++) {
			scores[i] = sc.nextInt();
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(i+"번째 점수는"+scores[i]);
		}
		
		for (int num : scores) {
			System.out.println(num);
		}
		
		// Arrays.toString을 이용한 배열 출력
		System.out.println(Arrays.toString(scores));
		
		// 평균 
		int sum = 0;
		for (int num : scores) {
			sum += num;
		}
		System.out.println(sum/5);
		System.out.println(sum%5);
	}
}
