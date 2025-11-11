public class Character {
    // fields
    private final int maxHealth;
    private final String name;
    private int currentHealth;

    // getters
    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public String getName() {
        return this.name;
    }

    // constructors
    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
    }

    // overrides
    public String toString() {
        if (this.currentHealth <= 0) {
            return this.name + " : KO";
        }
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    // methods
    public void takeDamage(int dmg) {
        this.currentHealth = Math.max(0, this.currentHealth - dmg);
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }
}
