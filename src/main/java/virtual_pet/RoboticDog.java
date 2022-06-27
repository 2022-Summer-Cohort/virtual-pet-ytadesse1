package virtual_pet;

public class RoboticDog extends RoboticPet implements Walking {

    public RoboticDog(String name, int hungerLvl, int thirstLvl, int boredomLvl, int oilLevel,
                      int maintenanceLevel) {
        super(name, hungerLvl, thirstLvl, boredomLvl, oilLevel, maintenanceLevel);
    }

    @Override
    public void walk() {
        int boredomLvl = 5;
        boredomLvl--;
    }

//    public void maintain() {
//        maintenanceLevel++;
//    }
}
