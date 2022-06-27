package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();

        RoboticDog robotDog = new RoboticDog("Cash", 3, 1, 3, 7, 2);
        RoboticCat robotCat = new RoboticCat("Eddy", 2, 7, 4, 3, 6);
        OrganicDog organDog = new OrganicDog("Paco", 6, 2, 5, 3);
        OrganicCat organCat = new OrganicCat("Jack", 5, 5, 7, 4);

        shelter.admitPet(robotDog);
        shelter.admitPet(robotCat);
        shelter.admitPet(organDog);
        shelter.admitPet(organCat);

        String userInput = "";
        Scanner input = new Scanner(System.in);

        while (shelter.isAllAlive() && !userInput.equalsIgnoreCase("quit")) {
            shelter.showAllPetStatus();
            System.out.println("Type feed, water, play, adopt, admit, clean cage, clean litter box, or interact with a " +
                    "pet. Type quit to end.");
            System.out.println("Type 'clean organic dog cage' or 'clean organic cat litter box' for these two services specifically.");
            userInput = input.nextLine();

            switch (userInput.toLowerCase()) {
                case "feed":
                    shelter.feedAll();
                    break;

                case "water":
                    shelter.waterAll();
                    break;

                case "play":
                    shelter.playAll();
                    break;

                case "adopt":
                    System.out.println("Enter the name of the pet you want to adopt.");
                    shelter.adoptPet(input.nextLine());
                    break;

                case "admit":
                    System.out.println("What's your pet's name?");
                    String petName = input.nextLine();
                    System.out.println("Is your pet a robot or organic?");
                    String petType = input.nextLine();
                    System.out.println("Is it a cat or dog?");
                    String animalType = input.nextLine();
                    if (animalType.equalsIgnoreCase("cat") && petType.equalsIgnoreCase("robot")) {
                        shelter.admitPet(new RoboticCat(petName, 5, 8, 2, 6, 8));
                    } else if (animalType.equalsIgnoreCase("cat") && petType.equalsIgnoreCase("organic")) {
                        shelter.admitPet(new OrganicCat(petName, 6, 3, 6, 3));
                    } else if (animalType.equalsIgnoreCase("dog") && petType.equalsIgnoreCase("robot")) {
                        shelter.admitPet(new RoboticDog(petName, 2, 2, 2, 5, 2));
                    } else {
                        shelter.admitPet(new OrganicDog(petName, 4, 6, 7, 1));
                    }
                    break;


                case "clean cage":
                    shelter.cleanCage();
                    break;

                case "clean litter box":
                    shelter.cleanLitterBox();
                    break;

                case "maintain":
                    shelter.maintainRobots();
                    break;

                case "clean organic dog cage":
                    organDog.cleanCage();
                    break;

                case "clean organic cat litter box":
                    organCat.cleanLitterBox();
                    break;

                    case "interact":
                    System.out.println("Enter the name of the pet you want to interact with.");
                    String name = input.nextLine();
                    System.out.println("What would you like to do with the pet? Feed, play, or water.");
                    String selection = input.nextLine();
                    if (selection.equalsIgnoreCase("feed")) {
                        shelter.findPetByName(name).feed();
                    } else if (selection.equalsIgnoreCase("water")) {
                        shelter.findPetByName(name).water();
                    } else if (selection.equalsIgnoreCase("play")) {
                        shelter.findPetByName(name).play();
                    }
                    break;
            }
            shelter.tickAll();
        }
        if (userInput.equalsIgnoreCase("quit")) {
            System.out.println("Thanks for playing!");
        }
    }
}