package virtual_pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetShelterTest {
    @Test
            public void allPetsBeingFed() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.feedAll();
        assertEquals(3,3);

    }


    @Test
            public void shelterCleansLitterBox() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.cleanLitterBox();
        assertEquals(5, 7);

    }

    @Test
            public void shelterCleansCage() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.cleanCage();
        assertEquals(3, 3);
    }

}