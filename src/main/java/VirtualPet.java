
public class VirtualPet {

	private String petName;
	private String description;
	private int hunger;
	private int thirst;
	private int happiness;

	public VirtualPet(String petName, String decription) {
		this.petName = petName;
		this.description = description;
	}

	public VirtualPet(String petName, String description, int hunger, int thirst, int happiness) {

		this.petName = petName;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.happiness = happiness;

	}

	public String getPetName() {
		return petName;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHappiness() {
		return happiness;
	}

	public int waterPet() {
		thirst += 10;
		return thirst;
	}

	public int feedPet() {
		hunger += 10;
		return hunger;
	}

	public int playWithPet() {
		happiness += 10;
		return happiness;
	
	}

	public int tick() {
		hunger -= 10;
		thirst -= 10;
		happiness -= 10;
		return happiness;
		
	}

}


