package makeApp20220619;

public class Game0703 {

	public static void main(String[] args) {
		
		int round = 1;
		
		PlayerCharacter player = new PlayerCharacter("Sulin", 100, 60);
		EnemyCharacter enemy = new EnemyCharacter("James", 80, 30);
		
		System.out.println("LET'S FIGHT");
		System.out.println("");
		System.out.println("------------  ROUND"+round+"  ---------------");
		round++;
		

		
		System.out.println(player.name()+" VS "+ enemy.name());
		
		
		while(player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if( !enemy.isLive() ) break;  // 죽으면 멈춘다
			enemy.attack(player);
			
			System.out.println("------------  ROUND"+round+"  ---------------");
			round++;	
			
		}
		
		if(player.isLive()) {
			System.out.println("");
			System.out.println("OH! JEEZ!");
			System.out.println(player.name()+" WIN :D!!");
		}else {
			System.out.println(enemy.name()+" WIN :(!!");
		}

	}
}
