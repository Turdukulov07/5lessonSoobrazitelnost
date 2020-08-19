public class Hero {

    private int health;
    private double domage;
    private String superPower;
    public Hero() {}


    public Hero(int health, double domage, String superPower) {
        this.health = health;
        this.domage = domage;
        this.superPower = superPower;
    }

    public Hero(int health, double domage) {
        this.health = health;
        this.domage = domage;
        if(domage >= 0) {
        }else
            return;
    }

}
