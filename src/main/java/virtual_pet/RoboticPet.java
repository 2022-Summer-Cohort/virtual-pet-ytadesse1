package virtual_pet;

public class RoboticPet extends VirtualPet {

    protected int oilLevel;

    protected int maintenanceLevel;


    public RoboticPet(String name, int hungerLvl, int urgeToSteal, int thirstLvl, int boredomLvl, int oilLevel, int maintenanceLevel) {
        super(name, hungerLvl, urgeToSteal, thirstLvl, boredomLvl);
            this.oilLevel = oilLevel;
            this.maintenanceLevel = maintenanceLevel;
    }

    @Override
    public void tick() {
        super.tick();
        oilLevel--;
        maintenanceLevel--;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void oilPet() {
        oilLevel += 10;
    }

    public void maintainRobots() {
        maintenanceLevel += 10;
    }


}
