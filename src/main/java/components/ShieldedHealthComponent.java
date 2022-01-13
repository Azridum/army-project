package components;

import states.IShieldState;

public class ShieldedHealthComponent implements IHealthComponent {
    private final IHealthComponent healthComponent;
    private IShieldState shieldState;

    public ShieldedHealthComponent(IHealthComponent healthComponent, IShieldState shieldState) {
        this.healthComponent = healthComponent;
        this.shieldState = shieldState;
    }

    @Override
    public void takeDamage(Integer damage) {
        this.shieldState.blockDamage(this, this.healthComponent, damage);
    }

    @Override
    public boolean isDowned() {
        return this.healthComponent.isDowned();
    }

    @Override
    public Integer getHealth() {
        return this.healthComponent.getHealth();
    }

    public void changeState(IShieldState shieldState) {
        this.shieldState = shieldState;
    }
}
