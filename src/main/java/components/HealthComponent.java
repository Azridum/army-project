package components;

public class HealthComponent implements IHealthComponent {
    private Integer health;
    private final Integer downThreshold;

    public HealthComponent(Integer health, Integer downThreshold) {
        this.health = health;
        this.downThreshold = downThreshold;
    }

    @Override
    public void takeDamage(Integer damage) {
        this.health -= damage;
    }

    @Override
    public boolean isDowned() {
        return this.health <= this.downThreshold;
    }

    @Override
    public Integer getHealth() {
        return this.health;
    }
}
