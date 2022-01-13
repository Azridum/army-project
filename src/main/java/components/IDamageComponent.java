package components;

import states.IBonusDamageState;

public interface IDamageComponent {
    Integer getDamage();
    void changeState(IBonusDamageState bonusDamageState);
}
