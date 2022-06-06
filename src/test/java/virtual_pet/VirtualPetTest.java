package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void plutoBeingFed() {
    VirtualPet underTest = new VirtualPet("pluto", 4, 5, 5, 5);
        underTest.feed();
        assertEquals(0, underTest.getHungerLvl());
    }

    @Test
    public void plutoDrinkingWater() {
        VirtualPet underTest = new VirtualPet("pluto", 7, 3, 8, 4);
        underTest.water();
        assertEquals(4, underTest.getThirstLvl());
    }

    @Test
    public void plutoPlaying() {
        VirtualPet underTest = new VirtualPet("pluto", 2, 2, 5, 7);
        underTest.play();
        assertEquals(3, underTest.getBoredomLvl());
    }
}
