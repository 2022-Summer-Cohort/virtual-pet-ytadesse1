package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.admitPet("Pluto");

        String userInput = "";
        Scanner input = new Scanner(System.in);

        while (shelter.isAllAlive() && !userInput.equalsIgnoreCase("quit")) {
            shelter.showAllPetStatus();
            System.out.println("Type feed, water, play, adopt, admit, or interact with single pet. Type quit to end.");
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
                    System.out.println("Enter the name of the pet you want to admit.");
                    shelter.admitPet(input.nextLine());
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
        if (shelter.isAllAlive()) {
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("Sorry, a pet has perished.");
        }
    }
}