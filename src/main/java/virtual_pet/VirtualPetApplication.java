package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();

        shelter.admitPet(new RoboticDog("Paco", 3, 6, 4, 8, 4,2));
        shelter.admitPet(new RoboticCat("Danny", 3, 6, 4, 8, 4,2));
        shelter.admitPet(new OrganicDog("Roger", 3, 6, 4, 8, 4));
        shelter.admitPet(new OrganicCat("Paco", 3, 6, 4, 8, 4));

        String userInput = "";
        Scanner input = new Scanner(System.in);

        while (shelter.isAllAlive() || userInput.equalsIgnoreCase("quit")) {
            VirtualPet.greeting();
            System.out.println("Type feed, water, play, adopt, clean cage, clean litter box, or interact " +
                    "with pet.");
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

//                case "admit":
//                    System.out.println("Is your pet a robot or organic?");
//                    shelter.admitPet(input.nextLine());
//                    System.out.println("Is it a cat or dog?");
//                    shelter.admitPet(input.nextLine());
//                    if (userInput.equalsIgnoreCase("cat") && userInput.equalsIgnoreCase("robot")) {
//                        shelter.admitPet(RoboticCat);
//                    } else if (userInput.equalsIgnoreCase("cat") && userInput.equalsIgnoreCase("organic")) {
//                        shelter.admitPet(OrganicCat);
//                    } else if (userInput.equalsIgnoreCase("dog") && userInput.equalsIgnoreCase("robot")) {
//                        shelter.admitPet(RoboticDog);
//                    } else {
//                        shelter.admitPet(OrganicDog);
//                    }
//                    break;


                case "clean cage":
                    shelter.cleanCage();
                    break;

                case "clean litter box":
                    shelter.cleanLitterBox();
                    break;

                case "maintain":
                    shelter.maintainRobots();
                    break;

                    case "interact":
                    System.out.println("Enter the name of the pet you want to interact with.");
                    String name = input.nextLine();
                    System.out.println("What would you like to do with the pet? feed, etc.");
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
//        if (userInput.equalsIgnoreCase("quit")) {
//            System.out.println("Thanks for playing!");
//        }
    }
}