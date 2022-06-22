package virtual_pet;

public abstract class OrganicPet extends VirtualPet {

    public int cleanliness;

    public OrganicPet(String name, int hungerLvl, int urgeToSteal, int thirstLvl, int boredomLvl, int cleanliness) {
        super(name, hungerLvl, urgeToSteal, thirstLvl, boredomLvl);
        this.cleanliness = cleanliness;
    }

    public void cleanCage() {
        cleanliness = 10;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void cleanLitterBox() {
        cleanliness = 10;
    }

    @Override
    public void tick() {
        super.tick();
        cleanliness++;
    }

    public abstract void showStatus();
}
