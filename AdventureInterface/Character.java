import java.util.ArrayList;
import java.util.List;

public class Character {
    // statics
    private static List<Character> allCharacters = new ArrayList<>();

    public static String printStatus() {
        String status = Character.allCharacters.size() == 0
                ? "Nobody's fighting right now !\n"
                : "Characters currently fighting :\n";

        for (Character character : Character.allCharacters)
            status += String.format(" - %s\n", character);

        String result = "------------------------------------------\n"
                + status
                + "------------------------------------------\n";

        return result;
    }

    public static Character fight(Character a, Character b) {
        while (true) {
            a.attack(b);
            if (b.getCurrentHealth() == 0)
                return a;

            b.attack(a);
            if (a.getCurrentHealth() == 0)
                return b;
        }
    }

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
        Character.allCharacters.add(this);
    }

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
