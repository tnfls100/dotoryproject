package makeApp20220619;

public class EnemyCharacter extends Character{

	public EnemyCharacter(String name, int hp, int atk) {
		super(name, hp, atk); // 부모에 있는 기능을 사용하겠다.
	}
	
	@Override  // 없어도 됨. 붙여주는 이유는 가독성. 상속받은 메서드임을 알려줌
	public void attack(Character enemy) {
		super.attack(enemy);
		
		// 기능 추가
		if( hp <= 20) {
			System.out.println("I'm old! please don't attack me :( !! ");
			this.atk += 15; // 공격력 15 상승
			
			System.out.println("I eat beef! :D!");
			this.hp +=30; // 적의 체력 30 상승
			System.out.println(name +" hp : "+hp);
		}
		
		//super.attack(enemy);
		
		
	}

}
