package day0412;

import java.util.Arrays;

public class Test04_배열의복사 {
	public static void main(String[] args) {
		int[] scores = new int[] {29, 45, 67, 84, 92};
		
		int[] newScores = new int[10];
		for (int i=0; i<5; i++) {
			newScores[i] = scores[i];
		}
		System.out.println(Arrays.toString(newScores));
		
		int[] newScores2 = Arrays.copyOf(scores, scores.length*2);
		System.out.println(Arrays.toString(newScores2));
		
		// 최대 최소 구하기
		int min = scores[0];
		int max = scores[0];
		
		for (int num : scores) {
			if (min > num) {
				min = num;
			}
			if (max < num) {
				max = num;
			}
		}
		
		System.out.printf("min : %d, max : %d", min,max);
		
		// 빈도수 구하기 0 ~ 9 까지 나온다고 가정
		int[] arr = {0, 0, 2, 1, 0 ,3 ,6, 2, 5, 7, 8, 5, 3};
		// 카운팅 배열
		int[] count = new int[10];
		
		for (int num: arr) {
			count[num] += 1;
		}
		
		System.out.println(Arrays.toString(count));
	}
}
