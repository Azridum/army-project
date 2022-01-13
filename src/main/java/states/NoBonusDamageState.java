package states;

import components.IDamageComponent;

public class NoBonusDamageState implements IBonusDamageState {
    @Override
    public Integer calculateDamage(IDamageComponent statefulComponent, Integer initialDamage) {
        return initialDamage;
    }
}
