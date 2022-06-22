package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void plutoBeingFed() {
    VirtualPet underTest = new RoboticDog("pluto", 4, 5, 5, 5, 5, 5);
        underTest.feed();
        assertEquals(0, underTest.getHungerLvl());
    }

    @Test
    public void plutoDrinkingWater() {
        VirtualPet underTest = new RoboticDog("pluto", 7, 3, 8, 4, 5, 5);
        underTest.water();
        assertEquals(4, underTest.getThirstLvl());
    }

    @Test
    public void plutoPlaying() {
        VirtualPet underTest = new RoboticDog("pluto", 2, 2, 5, 7, 5, 5);
        underTest.play();
        assertEquals(3, underTest.getBoredomLvl());
    }
}
