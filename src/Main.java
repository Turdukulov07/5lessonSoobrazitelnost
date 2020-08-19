public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(1000, 80, "Скорость");

        System.out.println(boss.getBossHealth() + " "
                + boss.getBossDomage() + " " + boss.getBossDefence());
    }


    public  Hero [] createHeroes () {
        Hero[] heroes = new Hero[4];
        Hero warrior = new Hero(900, 120, "Воин героев");
        heroes[0] = warrior;

        Hero magical = new Hero(900, 120, "Магия героя");
        heroes[1] = magical;

        Hero physical = new Hero(900, 120, "Физичечкий сила");
        heroes[2] = physical;

        Hero kinetic = new Hero(900, 120, "Кинетик героя");
        heroes[3] = kinetic;

        return heroes;
    }
}
