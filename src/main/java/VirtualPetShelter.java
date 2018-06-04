import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter {
	

	private Map<String, VirtualPet> pets = new HashMap<>();
	public VirtualPetShelter() {
		
	}

	public Collection<VirtualPet> getAllPetStatus() {
		return pets.values();

	}

	public VirtualPet getAPetByName(String petName) {
		return pets.get(petName);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public void  adoptPet(String petName) {
	   pets.remove(petName);
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feedPet();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.waterPet();
		}
	}

	public void playWithAPet(String petName) {
		pets.get(petName).playWithPet();
	}
	
	public void callTick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
	}
		
		}


	
}

		
	

