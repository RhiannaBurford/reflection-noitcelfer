public class Warrior {
    private String name;
    private int health;

    public void attack() {
        System.out.println("Attacking!");
    }

    private void takeDamage(int amount) {
        health -= amount;
    }

    public String getName() {
        return name;
    }
}