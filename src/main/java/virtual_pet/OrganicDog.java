package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking {


    public OrganicDog(String name, int hungerLvl, int thirstLvl, int boredomLvl, int cleanliness) {
        super(name, hungerLvl, thirstLvl, boredomLvl, cleanliness);
    }

    @Override
    public void walk() {
        int boredomLvl = 0;
        boredomLvl--;
        cleanliness++;
    }

    @Override
    public void greeting() {
        System.out.println(getName() + "'s " + "hunger level is " + getHungerLvl() + ", his thirst level is a " + getThirstLvl()
                + ", his boredom level is a " + getBoredomLvl() + ", cage cleanliness is " + getCleanliness() + ".");
    }

    @Override
    public void cleanCage() {
        cleanliness=10;
    }
}
