package virtual_pet;

public class VirtualPet {
    private String name;

    private int hungerLvl;

    private int urgeToSteal;
    private int thirstLvl;
    private int boredomLvl;

    private int foodInFridge;
    private int keys;
    private int phone;
    private int life;

    // Constructors
    public VirtualPet(String name, int hungerLvl, int urgeToSteal, int thirstLvl, int boredomLvl) {
        this.name = name;
        this.hungerLvl = hungerLvl;
        this.urgeToSteal = urgeToSteal;
        this.thirstLvl = thirstLvl;
        this.boredomLvl = boredomLvl;
        this.foodInFridge = foodInFridge;
        this.keys = keys;
        this.phone = phone;
        this.life = life;
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

    public void greeting() {
        System.out.println(name + "'s " + "hunger level is " + hungerLvl + ", his level of urgency is steal is at a " +
                urgeToSteal + ", his thirst level is a " + thirstLvl + ", and his boredom level is level "
                + boredomLvl + ".");
    }

    public void feed() {
        hungerLvl = -1;
    }

    public void water() {
        thirstLvl = -1;
    }

    public void play() {
        boredomLvl = -1;
    }

    public void tick() {
        hungerLvl++;
        thirstLvl++;
        boredomLvl++;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setHungerLvl(int hungerLvl) {
        this.hungerLvl = hungerLvl;
    }

    public void setUrgeToSteal(int urgeToSteal) {
        this.urgeToSteal = urgeToSteal;
    }

    public void setThirstLvl(int thirstLvl) {
        this.thirstLvl = thirstLvl;
    }

    public void setBoredomLvl(int boredomLvl) {
        this.boredomLvl = boredomLvl;
    }


    // if statements
    if (hungerLvl > 5) {
        urgeToSteal++;
    }

    if (thirstLvl > 5) {
        urgeToSteal++;
    }

    if (boredomLvl > 5) {
        urgeToSteal++;
    }

    if (urgeToSteal > 10) {
        System.out.println("Pluto has gone crazy.");
    }
}
