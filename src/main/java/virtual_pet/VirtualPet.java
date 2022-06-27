package virtual_pet;

public abstract class VirtualPet {
    private String name;

    private int hungerLvl;

    private int thirstLvl;
    private int boredomLvl;

    // Constructors
    public VirtualPet(String name, int hungerLvl, int thirstLvl, int boredomLvl) {
        this.name = name;
        this.hungerLvl = hungerLvl;
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

    public int getThirstLvl() {
        return thirstLvl;
    }

    public int getBoredomLvl() {
        return boredomLvl;
    }

    public void greeting() {
        System.out.println(name + "'s " + "hunger level is " + hungerLvl + ", his thirst level is a " + thirstLvl + ", his boredom level is a " + boredomLvl + ".");
    }

    public void feed() {
        hungerLvl = Math.max(0, hungerLvl-2);
    }

    public void water() {
        thirstLvl = Math.max(0, thirstLvl-2);
    }

    public void play() {
        boredomLvl = Math.max(0, boredomLvl-2);
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
