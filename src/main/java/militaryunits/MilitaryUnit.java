package militaryunits;

import components.IDamageComponent;
import components.IHealthComponent;

public class MilitaryUnit implements IMilitaryUnit {
    private final IHealthComponent healthComponent;
    private final IDamageComponent damageComponent;

    public MilitaryUnit(IHealthComponent healthComponent, IDamageComponent damageComponent) {
        this.healthComponent = healthComponent;
        this.damageComponent = damageComponent;
    }

    @Override
    public Integer doDamage() {
        return this.damageComponent.getDamage();
    }

    @Override
    public void sufferDamage(Integer damage) {
        this.healthComponent.takeDamage(damage);
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
