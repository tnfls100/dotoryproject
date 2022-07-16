package makeApp20220619;

public class PlayerCharacter extends Character{

	public PlayerCharacter(String name, int hp, int atk) {
		super(name, hp, atk); // 부모에 있는 기능을 사용하겠다.
	}	
	//새로운 기능 추가
	public void attack(Character player) {
		super.attack(player);
		
		if(player.hp <= 25) {
			
			System.out.println(" I am stronger then you!");
			player.hp +=40;
			System.out.println(name +" hp : "+hp);
		}
	}
	
}
 