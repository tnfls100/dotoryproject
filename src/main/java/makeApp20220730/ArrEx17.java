package makeApp20220730;

public class ArrEx17 {

	public static void main(String[] args) {
		// 향상된 for문에 인덱스가 필요한 경우

		String[] names = {"토리", "풀이", "모모"};
		int[] weight = {5, 3, 6};
		
		int i = 0; //인덱스로 사용할 변수 선언
		
		for (String name : names) {
			System.out.println(name+" : "+weight[i]+"kg");
			i++;
		}
		
	}

}
