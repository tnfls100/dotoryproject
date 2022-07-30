package makeApp20220730;

public class ArrEx16 {

	public static void main(String[] args) {
		// 향상된 for문
		// 값을 읽을 수만 있고 변경할 수 없음

		int[] arr = {1,2,3,4,5,6};
		
		// 기존 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 향상된 for문
		for(int number : arr) {
			System.out.println(number);
		}
	}

}
