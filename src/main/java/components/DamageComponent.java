package components;

import states.IBonusDamageState;

public class DamageComponent implements IDamageComponent {
    private final Integer damage;
    private IBonusDamageState state;

    public DamageComponent(Integer damage, IBonusDamageState state) {
        this.damage = damage;
        this.state = state;
    }

    public Integer getDamage() {
        return this.state.calculateDamage(this, this.damage);
    }

    @Override
    public void changeState(IBonusDamageState bonusDamageState) {
        this.state = bonusDamageState;
    }
}
