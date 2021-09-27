
public class Game {

	public static void main(String[] args) {
		PetFactory factory = new PetFactory();
		
		// selecting pet using quack sound = duck
		Pet pet = factory.selectPet("quack");
		pet.displayInfo();
		
		// change pet into bubble sound = shark
		pet = factory.selectPet("bubble");
		pet.displayInfo();
		
		// change pet into rawr sound = dragon
		pet = factory.selectPet("rawr");
		pet.displayInfo();
	}

}
