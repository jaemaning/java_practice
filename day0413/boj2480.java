package new_pjt;

import java.util.Scanner;

public class boj2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력값 받아 오기
		int[] dices = new int[3];
		for (int i = 0; i < 3; i++) {
			dices[i] = sc.nextInt();
		}
		
		// 값이 모두 다를때 가장 큰 값을 저장하기 위한 변수
		int max_dice = 0;
		
		// 값이 모두 같을 때
		if (dices[0] == dices[1] && dices[2] == dices[1] && dices[2] == dices[0] ) {
			System.out.println(10000+dices[0]*1000);
		}
		// 값이 두개만 같을 때
		else {
			if (dices[0] == dices[1] || dices[0] == dices[2]) {
				System.out.println(1000+dices[0]*100);
			} else {
				if (dices[1] == dices[2]) {
					System.out.println(1000+dices[1]*100);
				} 
				// 값이 모두 다를 때
				else {
					for (int num : dices) {
						if (max_dice < num) {
							max_dice = num;
						}
					} System.out.println(max_dice*100);
				}
			}
		}
		
		sc.close();
	}
}
