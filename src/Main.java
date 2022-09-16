import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss topBoss = new Boss();
        topBoss.setHealth(1000);
        topBoss.setDamage(75);
        topBoss.setDefenceType("Air Defence");
        System.out.println("Boss's health: " + topBoss.getHealth() + ";" +
                " Boss's damage: " + topBoss.getDamage() + ";" +
                " Boss's defenceType: " + topBoss.getDefenceType() + ";");
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero's health: " + createHeroes()[i].getHealth() + ";" +
                    " Hero's damage: " + createHeroes()[i].getDamage() + ";" +
                    " Hero's superpower: " + createHeroes()[i].getSuperPower() + ";");
        }
    }

    public static Hero[] createHeroes(){
        Hero ironMan = new Hero(200,40,"flying");
        Hero captainAmerica = new Hero(150, 50);
        Hero captainMarvel = new Hero(250, 90,"energy");
        Hero myHeroes[] = {ironMan, captainAmerica, captainMarvel};
        return myHeroes;
    }
}