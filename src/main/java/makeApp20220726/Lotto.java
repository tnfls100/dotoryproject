package makeApp20220726;

public class Lotto {

	public static void main(String[] args) {
		// 로또 번호 생성 프로그램
		// 1. 로또 번호를 담을 길이가 6개인 정수 타입 배열 변수 생성
		
		int lotto[] = new int[6];
		
		
		int idx = 0;
		while(true) {
			int number = (int)(Math.random()*45)+1; // 2. 1~45까지 번호 중 하나를 선택
			
			boolean insert = true;
			for (int i = 0; i<=idx; i++) {
				if(lotto[i] == number ) {
					insert = false; // 3-1. 뽑은 번호가 배열에 있다면 다시 뽑고, 
					break;
				}
			}	
				if(insert == true) { // 3-2.없다면 배열에 넣는다
					lotto[idx] = number;
					idx++;
				}
				
				if(idx == 6) break; // 4. 번호를 다 뽑을 때까지 반복
			}
			
			// 5. 번호가 다 뽑히면 출력
			for (int i = 0; i<lotto.length; i++) {
				System.out.println(lotto[i]);
			}
		}

}
