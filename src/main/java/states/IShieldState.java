package states;

import components.IHealthComponent;
import components.ShieldedHealthComponent;

public interface IShieldState {
    void blockDamage(ShieldedHealthComponent shieldedHealthComponent, IHealthComponent component, Integer damage);
}
