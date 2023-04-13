package new_pjt;

import java.util.Scanner;

public class boj2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 한줄 통으로 받고 쪼개기
		String[] a = sc.nextLine().split(" ");
		
		// 받아온 줄을 int로 형변환
		int ho = Integer.parseInt(a[0]);
		int mi = Integer.parseInt(a[1]);
		// 다음 줄 받아오기 숫자 하나
		int b = sc.nextInt();
		
		// 시간 계산 과정
		int b0 = b / 60;
		int b1 = b % 60;
		
		// 시간 계산 과정 후 24시간이 넘으면 다시 0시부터 진행 하므로 % 24로 나머지 처리
		int c = (mi + b1) / 60;
		int changed_ho = (ho + b0 + c) % 24;
		int changed_mi = (mi + b1) % 60;
		
		// 출력
		System.out.printf("%d %d",changed_ho, changed_mi);
		
		// scanner 종료
		sc.close();
	}
}
