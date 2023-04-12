package day0412;

public class Test01_array {
	public static void main(String[] args) {
		// 배열 변수
		int[] arr;
		int arr2[]; // 권장 x 가능은 함
		
		// 진짜 배열 생성 
		int[] arr3 = new int[5]; // int 형의 경우 0으로 초기화
		int[] arr4 = new int[] {1,2,3,4,5}; // 원하는 값으로 초기화 할 때
		int[] arr5 = {1,3,5,7,9}; // 반드시 한 줄에 써줘야 함
		
		int[] arr6;
		arr6 = new int[7];
		// arr6 = {1,2,3,4,5} 불가능
		arr6 = new int[] {1,2,3,4,5,6}; // 가능
		
		System.out.println(arr4[0]);
	}
}
