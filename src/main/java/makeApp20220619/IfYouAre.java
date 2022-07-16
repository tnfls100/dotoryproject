package makeApp20220619;

public class IfYouAre {

	public static void main(String[] args) {
		
		int grade = 0;
		
		boolean havePet = true;
		boolean haveDog = true;
		boolean haveCat = false;
		int asset = 460000000;
		String userName = "Sulin";
		
		grade = YourGrade(havePet, haveDog, haveCat, asset);		
		userGrade(userName, grade);
		
		havePet = false;
		asset = 5000;
		userName ="James";
		
		grade = YourGrade(havePet, haveDog, haveCat, asset);
		userGrade(userName, grade);
		
		
	}
	
	static void userGrade(String userName, int grade) {
		String firstStep = "";
		firstStep = userName+"'s grade is "+grade+"!";
		
		System.out.println(firstStep);
	}
	
	static int YourGrade(boolean havePet, boolean haveDog,
	boolean haveCat, int asset) {
		
		// 1~9 등급
		int grade = 0;
		
		// 재산이 46억 이상이면 1등급 상승
		if(asset >=460000000) {
			grade +=1;
		}
		
		// 반려동물 보유 유무로 등급 평가
		if(!havePet) {
			
			return grade;
			
		}else if(havePet){
			
			if(haveDog && haveCat) { 
				return grade = 5;
			}else  if(haveDog) {				
				return grade += 8; 
			}else if(haveCat) {
				return grade += 8;
			}
			
		}
		return grade;
		
	}

}
