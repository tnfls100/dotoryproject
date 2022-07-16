package makeApp20220619;

public class Character {

	String name = "" ;
	int hp = 0;
	int atk = 0;
	
	public Character(String name, int hp, int atk) { //생성자
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	public void attack(Character enemy) {
		System.out.println( this.name+" Attack!");
		enemy.hp -= this.atk;
		System.out.println(enemy.name+" hp : "+ enemy.hp);
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
