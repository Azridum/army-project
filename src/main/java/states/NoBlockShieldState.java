package states;

import components.IHealthComponent;
import components.ShieldedHealthComponent;

public class NoBlockShieldState implements IShieldState {
    @Override
    public void blockDamage(ShieldedHealthComponent shieldedHealthComponent, IHealthComponent component, Integer damage) {
        component.takeDamage(damage);
    }
}
