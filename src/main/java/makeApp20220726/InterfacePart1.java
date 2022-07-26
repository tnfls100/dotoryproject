package makeApp20220726;

public class InterfacePart1 {

	public static void main(String[] args) {
		
		Animal dolphin = new Dolphin("fresh");
		Animal shark = new Shark("blood");
		Animal shell = new Shell("chew");
		
		dolphin.Swim();
		shark.Swim();
		shell.Swim();
		
		Pet pet1 = new Dolphin("A");
		Pet pet2 = new Shark("B");
		Pet pet3 = new Shell("C");
		
		pet1.Hungry();
		pet2.Hungry();
		pet3.Hungry();
		
	}

}
