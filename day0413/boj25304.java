package new_pjt;

import java.util.Scanner;

public class boj25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int n = sc.nextInt();
		
		int total = 0;
		
		for (int i=0; i < n; i++) {
			int price = sc.nextInt();
			int cnt = sc.nextInt();
			
			total += price*cnt;
		}
		
		if (total == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
		
	}
}
