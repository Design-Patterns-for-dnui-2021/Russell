
public class PetFactory {
	public Pet selectPet(String sound) {
		if (sound.equalsIgnoreCase("quack")) return new Duck();
		if (sound.equalsIgnoreCase("bubble")) return new Shark();
		if (sound.equalsIgnoreCase("rawr")) return new Dragon();
		throw new Error("Invalid Sound!");
	}
}
