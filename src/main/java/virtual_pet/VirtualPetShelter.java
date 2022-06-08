package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter () {
        shelter = new ArrayList<>();
        shelter.add(new VirtualPet("Rick", 3, 2, 5, 7));
        shelter.add(new VirtualPet("Tom", 2, 7, 8, 3));
    }

    public int shelterPopulation() {
        return shelter.size();
    }

    public void admitPet(String name) {
        shelter.add(new VirtualPet(name, 4, 3, 2, 6));
    }

    public void adoptPet(String name) {
        shelter.remove(findPetByName(name));
    }

    public VirtualPet findPetByName(String name) {
        for (VirtualPet temporaryPet : shelter) {
            if (temporaryPet.getName().equalsIgnoreCase(name)) {
                return temporaryPet;
            }
        }
        return null;
    }

    public void showAllPetStatus() {
        for(VirtualPet pet: shelter) {
            pet.greeting();
        }
    }

    public void feedAll() {
        for(VirtualPet pet: shelter){
            pet.feed();
        }
    }

    public void waterAll() {
        for(VirtualPet pet: shelter) {
            pet.water();
        }
    }

    public void playAll() {
        for(VirtualPet pet: shelter) {
            pet.play();
        }
    }

    public void tickAll() {
        for(VirtualPet pet: shelter) {
            pet.tick();
        }
    }

    public boolean isAllAlive() {
        for(VirtualPet pet: shelter) {
            if (!pet.isAlive()) {
                return false;
            }
        }
        return true;
    }
}
