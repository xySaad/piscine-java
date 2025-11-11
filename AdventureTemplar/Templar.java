public class Templar extends Character implements Healer, Tank {
    private final int shield, healCapacity;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.shield = shield;
        this.healCapacity = healCapacity;
    }

    public void heal(Character c) {
        c.setCurrentHealth(Math.min(c.getCurrentHealth() + this.healCapacity, c.getMaxHealth()));
    }

    public int getHealCapacity() {
        return this.healCapacity;
    }

    public int getShield() {
        return this.shield;
    }

    public String toString() {
        if (this.getCurrentHealth() == 0)
            return String.format(
                    "%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                    this.getName(), this.shield, this.getHealCapacity());

        return String.format(
                "%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.shield);

    }
}
