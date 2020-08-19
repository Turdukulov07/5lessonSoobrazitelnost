public class Boss {

    private int bossHealth;
    private double bossDomage;
    private String bossDefence;

    public Boss() {}

    public Boss(int bossHealth, double bossDomage, String bossDefence) {
        this.bossHealth = bossHealth;
        this.bossDomage = bossDomage;
        this.bossDefence = bossDefence;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public double getBossDomage() {
        return bossDomage;
    }

    public void setBossDomage(double bossDomage) {
        this.bossDomage = bossDomage;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }
}
