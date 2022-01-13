package states;

import components.IDamageComponent;

public class FirstStrikeBonusDamageState implements IBonusDamageState {
    private final Integer bonusDamage;

    public FirstStrikeBonusDamageState(Integer bonusDamage) {
        this.bonusDamage = bonusDamage;
    }

    @Override
    public Integer calculateDamage(IDamageComponent statefulComponent, Integer initialDamage) {
        statefulComponent.changeState(new NoBonusDamageState());

        return initialDamage * this.bonusDamage;
    }
}
