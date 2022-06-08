package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetShelterTest {
    @Test
    public void canAdmitPetToShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet("David");
        assertTrue(underTest.findPetByName("David") != null);
    }

    @Test
    public void canAdoptPetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet("Mo");
        assertTrue(underTest.findPetByName("Mo") != null);
        underTest.adoptPet("Adam");
        assertTrue(underTest.findPetByName("Adam") == null);
    }

    @Test
    public void populationMatchesShelterArrayList() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.shelterPopulation();
        assertEquals(2, underTest.shelterPopulation());
    }
}