package components;

public class ArmoredHealthComponent implements IHealthComponent {
    private final IHealthComponent healthComponent;

    public ArmoredHealthComponent(IHealthComponent healthComponent) {
        this.healthComponent = healthComponent;
    }

    @Override
    public void takeDamage(Integer damage) {
        this.healthComponent.takeDamage(damage / 2);
    }

    @Override
    public boolean isDowned() {
        return this.healthComponent.isDowned();
    }

    @Override
    public Integer getHealth() {
        return this.healthComponent.getHealth();
    }
}
