package factories;

import components.ArmoredHealthComponent;
import components.DamageComponent;
import components.HealthComponent;
import militaryunits.IMilitaryUnit;
import militaryunits.MilitaryUnit;
import states.FirstStrikeBonusDamageState;

public class HeavyCavalryMilitaryUnitFactory implements IMilitaryUnitFactory {
    @Override
    public IMilitaryUnit createUnit() {
        return new MilitaryUnit(new ArmoredHealthComponent(new HealthComponent(150, 25)), new DamageComponent(20, new FirstStrikeBonusDamageState(3)));
    }
}
