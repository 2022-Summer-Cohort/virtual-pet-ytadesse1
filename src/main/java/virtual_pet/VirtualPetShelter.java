package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new RoboticDog("Ricky", 3, 2, 5, 7, 2, 4));
        shelter.add(new RoboticCat("Lizzo", 2, 7, 8, 3, 6, 3));
        shelter.add(new OrganicCat("Paco", 3, 2, 5, 7, 2));
        shelter.add(new OrganicDog("Cash", 2, 7, 8, 3, 4));
    }

    public int shelterPopulation() {
        return shelter.size();
    }

    public void admitPet(VirtualPet pet) {
        shelter.add(pet);
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
        for (VirtualPet pet : shelter) {
            pet.greeting();
        }
    }

    public void feedAll() {
        for (VirtualPet pet : shelter) {
            pet.feed();
        }
    }

    public void waterAll() {
        for (VirtualPet pet : shelter) {
            pet.water();
        }
    }

    public void playAll() {
        for (VirtualPet pet : shelter) {
            pet.play();
        }
    }

    // TODO make methods for maintaining robotic pets and for cleaning organic pets
    //

    public void tickAll() {
        for (VirtualPet pet : shelter) {
            pet.tick();
        }
    }

    public boolean isAllAlive() {
        for (VirtualPet pet : shelter) {
            if (!pet.isAlive()) {
                return false;
            }
        }
        return true;
    }

    public void cleanCage() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            }
        }
    }

    public void cleanLitterBox() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanLitterBox();
            }
        }
    }

    public void maintainRobots() {
        for (VirtualPet pet : shelter) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).maintainRobots();
            }
        }
    }

    public void oilAll() {
        for (VirtualPet pet : shelter) {
            // instanceof = is the pet an instanceof RoboticPet
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oilPet();
            }
        }
    }

    public void walk() {
        for (VirtualPet pet : shelter) {
            // instanceof = is the pet an instanceof RoboticPet
            if (pet instanceof Walking) {
                ((Walking) pet).walk();
            }
        }
    }

}
