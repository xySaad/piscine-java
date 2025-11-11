public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public void heal(Character c) {
        c.setCurrentHealth(Math.min(c.getCurrentHealth() + this.healCapacity, c.getMaxHealth()));
    }

    public int getHealCapacity() {
        return this.healCapacity;
    }

    public String toString() {
        if (this.getCurrentHealth() == 0)
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(),
                    this.healCapacity);

        return String.format("%s is a sorcerer with %d HP. It can heal %d HP.",
                this.getName(), this.getCurrentHealth(), this.healCapacity);
    }

}
