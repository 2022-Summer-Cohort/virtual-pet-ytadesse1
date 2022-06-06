package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
//        System.out.println("This is Pluto, your new dog.");
//        System.out.println("You will need to feed him, give him water, and keep him active.");
        VirtualPet pluto = new VirtualPet("Pluto", 5, 5, 5, 5);

        String userInput = "";
        Scanner input = new Scanner(System.in);

        while (pluto.isAlive()) {
            pluto.greeting();
            System.out.println("Type feed, water, or play.");
            userInput = input.nextLine();

            switch (userInput.toLowerCase()) {
                case "feed":
                    pluto.feed();
                    break;

                case "water":
                    pluto.water();
                    break;

                case "play":
                    pluto.play();
                    break;
            }
            pluto.tick();

            if (pluto.getThirstLvl()>10 || pluto.getHungerLvl()>10) {
                System.out.println("Pluto is knocked out.");
            }
        }
    }
}