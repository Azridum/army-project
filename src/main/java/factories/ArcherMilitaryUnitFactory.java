package factories;

import components.DamageComponent;
import components.HealthComponent;
import militaryunits.IMilitaryUnit;
import militaryunits.MilitaryUnit;
import states.NoBonusDamageState;

public class ArcherMilitaryUnitFactory implements IMilitaryUnitFactory {
    @Override
    public IMilitaryUnit createUnit() {
        return new MilitaryUnit(new HealthComponent(50, 25), new DamageComponent(20, new NoBonusDamageState()));
    }
}
