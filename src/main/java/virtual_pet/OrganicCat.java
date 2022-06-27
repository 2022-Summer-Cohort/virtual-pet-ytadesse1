package virtual_pet;

public class OrganicCat extends OrganicPet {
    public OrganicCat(String name, int hungerLvl, int thirstLvl, int boredomLvl, int cleanliness) {
        super(name, hungerLvl, thirstLvl, boredomLvl, cleanliness);
    }

    @Override
    public void greeting() {
        System.out.println(getName() + "'s " + "hunger level is " + getHungerLvl() + ", his thirst level is a " + getThirstLvl()
                + ", his boredom level is a " + getBoredomLvl() + ", litter box cleanliness is " + getCleanliness() + ".");
    }
}
