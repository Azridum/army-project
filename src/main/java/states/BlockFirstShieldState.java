package states;

import components.IHealthComponent;
import components.ShieldedHealthComponent;

public class BlockFirstShieldState implements IShieldState {
    @Override
    public void blockDamage(ShieldedHealthComponent shieldedHealthComponent, IHealthComponent component, Integer damage) {
        shieldedHealthComponent.changeState(new NoBlockShieldState());
    }
}
