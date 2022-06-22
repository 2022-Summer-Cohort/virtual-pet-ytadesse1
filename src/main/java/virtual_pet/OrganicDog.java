package virtual_pet;

public class OrganicDog extends OrganicPet implements Walking {


    public OrganicDog(String name, int hungerLvl, int urgeToSteal, int thirstLvl, int boredomLvl, int cleanliness) {
        super(name, hungerLvl, urgeToSteal, thirstLvl, boredomLvl, cleanliness);
    }

    @Override
    public void walk() {
        int boredomLvl = 0;
        boredomLvl--;
        cleanliness++;
    }

    @Override
    public void showStatus() {
        System.out.println("my name" + getName() + "hunger" + "hungerLevel" + "boredom" + "boredomLevel" + "thirst" + "thirstLevel" + "my litterbox is" + cleanliness);
    }
}
