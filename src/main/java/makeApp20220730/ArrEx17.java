package makeApp20220730;

public class ArrEx17 {

	public static void main(String[] args) {
		// 인덱스가 필요한 경우

		String[] names = {"토리", "풀이", "모모"};
		int[] weight = {5, 3, 6};
		
		int i = 0; //인덱스
		
		for (String name : names) {
			System.out.println(name+" : "+weight[i]+"kg");
			i++;
		}
		
	}

}
