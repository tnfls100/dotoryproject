package makeApp20220619;

public class Game {
	
	static class Player {
		
		String name = "" ;
		int hp = 0;
		int atk = 0;
		
		public Player(String name, int hp, int atk) { //생성자
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		
		
		public void attack(Enemy enemy) {
			System.out.println( this.name+" Attack!");
			enemy.hp -= this.atk;
			System.out.println("Enemy hp : "+ enemy.hp);
		}
		
		public boolean isLive() {
			if(hp<=0) {
				return false;
			}else {
				return true;
			}
		}
		
		public String name() {
			return this.name;
		}
		
		
		
	}
	
	static class Enemy {
		String name = "";
		int hp = 0;
		int atk = 0;
		
		public Enemy(String name, int hp, int atk) { //생성자
			this.name = name;
			this.hp = hp;
			this.atk = atk;
		}
		
		public void attack(Player player) {
			System.out.println( this.name+" Attack!");
			player.hp -= this.atk;
			System.out.println("Player hp : "+ player.hp);
		}
		
		public boolean isLive() {
			if(hp<=0) {
				return false;
			}else {
				return true;
			}
		}
		
		public String name() {
			return this.name;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("FIGHT!");
		
		Player player = new Player("Sulin", 60, 30);
		Enemy enemy = new Enemy("James", 50, 20);
		
		System.out.println(player.name()+" VS "+ enemy.name());
		
		while(player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if( !enemy.isLive() ) break;  // 죽으면 멈춘다
			enemy.attack(player);
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
