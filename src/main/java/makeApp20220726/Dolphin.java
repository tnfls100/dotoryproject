package makeApp20220726;

public  class Dolphin extends Animal implements Pet{
	
	public Dolphin(String name) {
		super(name);
		
	}


	@Override
	public void Swim() {
		System.out.println(name+"~~~");
		
	}

	public void Hungry() {
		System.out.println("WOW");
		
	} 
	
}
