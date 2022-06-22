package virtual_pet;

public class OrganicCat extends OrganicPet {
    public OrganicCat(String name, int hungerLvl, int urgeToSteal, int thirstLvl, int boredomLvl, int cleanliness) {
        super(name, hungerLvl, urgeToSteal, thirstLvl, boredomLvl, cleanliness);
    }

    @Override
    public void showStatus() {
        System.out.println("my name" + getName() + "hunger" + "hungerLevel" + "boredom" + "boredomLevel" + "thirst" + "thirstLevel" + "my litterbox is" + cleanliness);
    }
}
