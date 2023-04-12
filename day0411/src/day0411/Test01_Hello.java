package day0411;

import java.io.*;
import java.util.StringTokenizer;

public class Test01_Hello {
	public static void main(String[] args) throws Exception {

		// 자료를 한줄로 통으로 받아서 strs 리스트에 하나씩 잘라 넣어줌
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		
		// 리스트에 담긴 자료 하나하나 꺼내 옴
		long num1 = Long.parseLong(strs[0]);
		long num2 = Long.parseLong(strs[1]);
		long num3 = Long.parseLong(strs[2]);
		
		// 출력
		System.out.println(num1+num2+num3);
	}
}
