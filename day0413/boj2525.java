package new_pjt;

import java.util.Scanner;

public class boj2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ������ �ް� �ɰ���
		String[] a = sc.nextLine().split(" ");
		
		// �޾ƿ� ���� int�� ����ȯ
		int ho = Integer.parseInt(a[0]);
		int mi = Integer.parseInt(a[1]);
		// ���� �� �޾ƿ��� ���� �ϳ�
		int b = sc.nextInt();
		
		// �ð� ��� ����
		int b0 = b / 60;
		int b1 = b % 60;
		
		// �ð� ��� ���� �� 24�ð��� ������ �ٽ� 0�ú��� ���� �ϹǷ� % 24�� ������ ó��
		int c = (mi + b1) / 60;
		int changed_ho = (ho + b0 + c) % 24;
		int changed_mi = (mi + b1) % 60;
		
		// ���
		System.out.printf("%d %d",changed_ho, changed_mi);
		
		// scanner ����
		sc.close();
	}
}
