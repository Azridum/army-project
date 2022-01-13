package states;

import components.IDamageComponent;

public interface IBonusDamageState {
    Integer calculateDamage(IDamageComponent damageComponent, Integer initialDamage);
}
