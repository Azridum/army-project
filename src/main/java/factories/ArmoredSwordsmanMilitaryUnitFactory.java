package factories;

import components.ArmoredHealthComponent;
import components.DamageComponent;
import components.HealthComponent;
import components.ShieldedHealthComponent;
import militaryunits.IMilitaryUnit;
import militaryunits.MilitaryUnit;
import states.BlockFirstShieldState;
import states.NoBonusDamageState;

public class ArmoredSwordsmanMilitaryUnitFactory implements IMilitaryUnitFactory {
    @Override
    public IMilitaryUnit createUnit() {
        return new MilitaryUnit(new ShieldedHealthComponent(new ArmoredHealthComponent(new HealthComponent(100, 25)), new BlockFirstShieldState()), new DamageComponent(10, new NoBonusDamageState()));
    }
}
