package makeApp20220726;

public class ArrEx2 {

	public static void main(String[] args) {
        
        String[] arrInt = new String[5];
        
        // 배열 선언과 동시에 초기화
        String[] arrStr = { "dotory", "James", "Inho", "Jeaho"};
        
        String name = arrStr[3];
        
        System.out.println(name);
        
        //배열의 길이
        System.out.println(arrStr.length);  
       
        for(int i = 0; i <arrStr.length; i++) {
        	System.out.println(arrStr[i]);
        }

	}

}
