package makeApp20220619;

import java.util.Random;

public class array {

	public static void main(String[] args) {
		
		//Random
		Random random = new Random();
		
		int money = 1000;
		
		while (money > 100) {
			//buy lucky
			money -=100;
			int number = random.nextInt(100);
			int luckyMoney = lucky(number);
			System.out.println("Number : "+ number + " / " 
										+"Lucky : "+luckyMoney);
			money += luckyMoney;
			
		}
		System.out.println("");
		System.out.println("YOU WASTE YOUR MONEY :D!");
		
		// 난수생성 4글자 문자열
		String randomText = random.ints(97, 123)
				.limit(4)
				.collect(StringBuilder::new, 
							StringBuilder::appendCodePoint, 
							StringBuilder::append)
				.toString();
		
		/*
		 * ints() : 시작과 끝 범위. 
			'a'는 97이고 'z'는 122

			limit() : 출력하고자 하는 길이 설정

			collect() : 결과를 어떻게 처리할지 정의. 
			여기서는 StringBuilder를 이용해 
			append, 즉 이어붙이기.

			toString() : 문자열로 변환.
		 */
		
		System.out.println("WOW! I will give you new name. "
										+ "that is MR."+randomText);
		
	}
	
	static int lucky(int number) {
		
		int[] luckyNum = new int[100];
		
		for(int i = 0; i < luckyNum.length; i++) {
			luckyNum[i] = 0;
		}
		
		
		luckyNum[8] = 460000000;
		luckyNum[30] = 10000;
		luckyNum[92] = 500;
		
		return luckyNum[number];
	}

}
