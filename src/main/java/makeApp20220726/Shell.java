package makeApp20220726;

public  class Shell extends Animal implements Pet{

	public Shell(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Swim() {
		// TODO Auto-generated method stub
		System.out.println(name+" :)");
	}

	public void Hungry() {
		System.out.println("Shell :)");
		
	} 
	
}
