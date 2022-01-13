package factories;

import components.DamageComponent;
import components.HealthComponent;
import components.ShieldedHealthComponent;
import militaryunits.IMilitaryUnit;
import militaryunits.MilitaryUnit;
import states.BlockFirstShieldState;
import states.NoBonusDamageState;

public class SwordsmanMilitaryUnitFactory implements IMilitaryUnitFactory {
    @Override
    public IMilitaryUnit createUnit() {
        return new MilitaryUnit(new ShieldedHealthComponent(new HealthComponent(100, 25), new BlockFirstShieldState()), new DamageComponent(10, new NoBonusDamageState()));
    }
}
