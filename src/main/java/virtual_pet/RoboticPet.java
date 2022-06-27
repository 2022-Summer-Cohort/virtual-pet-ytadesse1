package virtual_pet;

public abstract class RoboticPet extends VirtualPet {

    protected int oilLevel;

    protected int maintenanceLevel;


    public RoboticPet(String name, int hungerLvl, int thirstLvl, int boredomLvl, int oilLevel, int maintenanceLevel) {
        super(name, hungerLvl, thirstLvl, boredomLvl);
            this.oilLevel = oilLevel;
            this.maintenanceLevel = maintenanceLevel;
    }

    @Override
    public void tick() {
        super.tick();
        oilLevel--;
        maintenanceLevel--;
    }

    @Override
    public void greeting() {
        System.out.println(getName() + "'s " + "hunger level is " + getHungerLvl() + ", his thirst level is a " + getThirstLvl()
                + ", his boredom level is a " + getBoredomLvl() + ", oil level is " + getOilLevel() + ", and the maintenance oil is " +
                getMaintenanceLevel() + ".");
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public void oilPet() {
        oilLevel++;
    }

    public void maintainRobots() {
        maintenanceLevel++;
    }




}
