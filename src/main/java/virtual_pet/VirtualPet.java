package virtual_pet;

public abstract class VirtualPet {
    private static String name;

    private static int hungerLvl;

    private static int urgeToSteal;
    private static int thirstLvl;
    private static int boredomLvl;

    // Constructors
    public VirtualPet(String name, int hungerLvl, int urgeToSteal, int thirstLvl, int boredomLvl) {
        this.name = name;
        this.hungerLvl = hungerLvl;
        this.urgeToSteal = urgeToSteal;
        this.thirstLvl = thirstLvl;
        this.boredomLvl = boredomLvl;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHungerLvl() {
        return hungerLvl;
    }

    public int getUrgeToSteal() {
        return urgeToSteal;
    }

    public int getThirstLvl() {
        return thirstLvl;
    }

    public int getBoredomLvl() {
        return boredomLvl;
    }

    public static void greeting() {
        System.out.println(name + "'s " + "hunger level is " + hungerLvl + ", his level of urgency to steal is at a " + urgeToSteal + ", his thirst level is a " + thirstLvl + ", his boredom level is a " + boredomLvl + ".");
    }

    public void feed() {
        hungerLvl = Math.max(0, hungerLvl-4);
    }

    public void water() {
        thirstLvl = Math.max(0, thirstLvl-4);
    }

    public void play() {
        boredomLvl = Math.max(0, boredomLvl-4);
    }

    public void tick() {
        hungerLvl++;
        thirstLvl++;
        boredomLvl++;
    }

    public boolean isAlive() {
        if (hungerLvl > 10) {
            return false;
        } else if (thirstLvl > 10){
            return false;
        } else {
            return true;
        }
    }
}
