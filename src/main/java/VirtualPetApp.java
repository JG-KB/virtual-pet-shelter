import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		int numberPicked;
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		
		VirtualPet animal1 = new VirtualPet("Bite", "a Giga Monster", 100, 100, 100);
		VirtualPet animal2 = new VirtualPet("Nova", "a Star Cat", 100, 100,100);
		
		shelter.addPet(animal1);
		shelter.addPet(animal2);
		
		System.out.println(" Welcome to the Internet Animal Shelter!");
		System.out.println(" Here is the status of the current internet animals in the shelter.");
		System.out.println("|Name\t" + "|Hunger\t" + "|Thirst\t" + "|Boredom" + "|\t");
		
		
		
		for (VirtualPet animalsInShelter : shelter.getAllPetStatus()) {
			
			System.out.println("|" + animalsInShelter.getPetName() + "\t|" + animalsInShelter.getHunger() + "\t|"
					+ animalsInShelter.getThirst() + "\t|" + animalsInShelter.getHappiness() + "\t|");
		}

		do {
			System.out.println("What would you like to do ?");
			System.out.println(" Press 1 if you would like to feed the animals.");
			System.out.println(" Press 2 if you would like to give water to the animals.");
			System.out.println(" Press 3 if you would like to play with the animals.");
			System.out.println(" Press 4 if you would like to adopt a pet.");
			System.out.println(" Press 5 if you would like to admit a pet.");
			System.out.println(" Press 6 if you would like to quit the app.");
			numberPicked=input.nextInt();
			shelter.callTick();

			if (numberPicked ==1) {
				System.out.println("You have picked to feed the animals, they are grateful!");
				shelter.feedAllPets();
				for (VirtualPet animalsInShelter : shelter.getAllPetStatus()) {
					System.out.println("|" + animalsInShelter.getPetName() + "\t|" + animalsInShelter.getHunger() + "\t|"
							+ animalsInShelter.getThirst() + "\t|" + animalsInShelter.getHappiness() + "\t|");
				}
				} else if (numberPicked==2) {
				System.out.println("You have picked to give water to all the animals, they are grateful!");
				shelter.waterAllPets();
				for (VirtualPet animalsInShelter : shelter.getAllPetStatus()) {
					System.out.println("|" + animalsInShelter.getPetName() + "\t|" + animalsInShelter.getHunger() + "\t|"
							+ animalsInShelter.getThirst() + "\t|" + animalsInShelter.getHappiness() + "\t|");
					
				}
				}else if (numberPicked==3) {
				System.out.println("You have picked to play with an animal.");
				System.out.println("Here are our animals and what they are.");
				for (VirtualPet animalsInShelter : shelter.getAllPetStatus()) {
					System.out.println(animalsInShelter.getPetName() + " " + animalsInShelter.getDescription() );
				}
				input.nextLine();
				System.out.println("What is the name of the animal you wish to play with?");
				String petToPlayWith=input.nextLine();
				shelter.getAPetByName(petToPlayWith).playWithPet();
		System.out.println(petToPlayWith + " is happy you played with them");
		for (VirtualPet animalsInShelter : shelter.getAllPetStatus()) {
			System.out.println("|" + animalsInShelter.getPetName() + "\t|" + animalsInShelter.getHunger() + "\t|"
					+ animalsInShelter.getThirst() + "\t|" + animalsInShelter.getHappiness() + "\t|");
								
				
		}
	}else if (numberPicked==4) {
		System.out.println("You can adopt one of these animals today.");
		for (VirtualPet animalsInShelter : shelter.getAllPetStatus()) {
			System.out.println("|" + animalsInShelter.getPetName() + "\t|" + animalsInShelter.getHunger() + "\t|"
					+ animalsInShelter.getThirst() + "\t|" + animalsInShelter.getHappiness() + "\t|");
	}
		input.nextLine();
		System.out.println("What was the name of the animal you wished to adopt?");
		String animalToBeAdopted = input.nextLine();
		shelter.adoptPet(animalToBeAdopted);
		System.out.println(" Please give the animal plenty of love.");
}else if (numberPicked==5) {
	System.out.println("Thanks for bringing in this helpless animal.");
	input.nextLine();
	System.out.println("What is the animal's name");
	String newAnimalInName = input.nextLine();
	System.out.println("Can you describe the new animal?");
	String newAnimalInDescription = input.nextLine();
	shelter.addPet(new VirtualPet(newAnimalInName, newAnimalInDescription, 100,100,100));
	System.out.println("We will do our best with " + newAnimalInName);
	
}else if (numberPicked==6) {
	System.out.println("Come back again soon");
	break;
}
			System.out.println("Anything else?");
	
}while (numberPicked !=0);
		}
	}
