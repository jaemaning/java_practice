package new_pjt;

import java.util.Scanner;

public class boj2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �Է°� �޾� ����
		int[] dices = new int[3];
		for (int i = 0; i < 3; i++) {
			dices[i] = sc.nextInt();
		}
		
		// ���� ��� �ٸ��� ���� ū ���� �����ϱ� ���� ����
		int max_dice = 0;
		
		// ���� ��� ���� ��
		if (dices[0] == dices[1] && dices[2] == dices[1] && dices[2] == dices[0] ) {
			System.out.println(10000+dices[0]*1000);
		}
		// ���� �ΰ��� ���� ��
		else {
			if (dices[0] == dices[1] || dices[0] == dices[2]) {
				System.out.println(1000+dices[0]*100);
			} else {
				if (dices[1] == dices[2]) {
					System.out.println(1000+dices[1]*100);
				} 
				// ���� ��� �ٸ� ��
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
