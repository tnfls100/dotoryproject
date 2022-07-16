package makeApp20220619;

public class main {

	public static void main(String[] args) {
		// 2022. 06. 19
		
		int num = 2018;
		int num2 = 4;
		
		int num3 = num + num2;
		int multiply = num * num2;
		
		String name = "Tory";
		String introduce = " so Cute and Charming :D!";
		
		
		char sex = 'F';
		long under21 = 210000000;
		float iDontKnow = 345.5342f;
		
		
		System.out.println("토리의 밥그릇 앱 만들기 시작");
		System.out.println(num);
		System.out.println(num3);
		System.out.println(multiply);
		
		
		System.out.println(name + introduce);
		System.out.println(sex);
		System.out.println(under21);
		System.out.println(iDontKnow);
		
		
		System.out.println("-----------------");
		
		int plusResult = plus(1,2);
		
		
		System.out.println(plusResult); 
		print2times("HI! How are you?");

	}
	
	static void print2times(String text) {
		System.out.println(text);
		System.out.println(text);
	}
	
	static int plus(int x, int y) {
		return x+y;
	}

}
