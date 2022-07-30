package makeApp20220730;

import java.util.Arrays;

public class ArrEx13 {

	public static void main(String[] args) {
	
		// 배열 복사 방법 1 : for문 이용
	
		// 원본 배열. 모든 방법에서 사용함.
		int[] arrInt = {1,2,3};
		
		// 복사할 배열
		int[] arrInt2 = new int[5];
		
		// 복사할 배열에 값 대입
		for(int i=0; i<arrInt.length; i++) {
			arrInt2[i] = arrInt[i];
		}
		
		// 배열 값 출력
		System.out.println("for문 이용");
		for(int i=0; i<arrInt2.length; i++) {
			
			System.out.print(arrInt2[i]+" ");
		}
		System.out.println();
		
		// 배열 복사 방법2 : arraycopy
		
		// 복사할 배열
		int[] arrInt3 = new int[5];
		
		System.arraycopy(arrInt, 0, arrInt3, 2, arrInt.length); 
				 //arraycopy(원본 배열, 복사할 시작 인덱스값, 복사 대상 배열, 대상 배열의 복사 위치 시작 인덱스, 복사할 길이)
		
		System.out.println("arraycopy 이용");
		for(int i=0; i<arrInt3.length; i++) {
			
			System.out.print(arrInt3[i]+" ");
		}
		System.out.println();
		
		// 배열 복사 방법3 : Array 클래스의 copyof() 메서드
		
		// 복사할 배열
		int[] arrInt4 = null;
		arrInt4 = Arrays.copyOf(arrInt, 5); // 배열을 5개의 길이로 생성해 대입. 나머지 자리에는 기본값 0 출력.
		
		System.out.println("copyof() 메서드 이용");
		for(int i=0; i<arrInt4.length; i++) {
			System.out.print(arrInt4[i]+" ");
		}
		

	}

}
