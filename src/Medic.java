public class Medic extends Hero implements HavingSuperAbility{

    private int healPoints;
    Hero[] heroes = {new Magic(),new Warrior() };


    public void increaseExperience(){
        System.out.println(" "+ heroes.length*100/10);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил SuperAbility HEAL");
    }
}
