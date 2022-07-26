package makeApp20220726;

public  class Shark extends Animal implements Pet{

	public Shark(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Swim() {
		// TODO Auto-generated method stub
		System.out.println(name+"~~~");
	}

	public void Hungry() {
		System.out.println("I'am Starving");
		
	} 
	
	
	
}
