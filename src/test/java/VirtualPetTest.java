import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

import junit.framework.Assert;

public class VirtualPetTest {
	VirtualPet animal = new VirtualPet("petName", "description", 100, 100, 100);

	@Test
	public void userGivesWaterAnimalsToIncreaseThirst() {
		int underTest = animal.waterPet();

		Assert.assertEquals(110, underTest);

	}

	@Test
	public void userGivesFoodToPetToIncreaseHunger() {
		int underTest = animal.feedPet();

		Assert.assertEquals(110, underTest);
	}
	
	@Test 
	public void userPlaysWithPetToIncreaseHappiness() {
		int underTest = animal.playWithPet();

		Assert.assertEquals(110, underTest);
	}
	@Test
	public void tickTakesAway() {
		int underTest = animal.tick();
		
		Assert.assertEquals(90, underTest);
	}


}
