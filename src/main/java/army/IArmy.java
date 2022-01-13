package army;

import militaryunits.IMilitaryUnit;

public interface IArmy {
    void addUnit(IMilitaryUnit militaryUnit);
    void damageAll(Integer damage);
    Integer getArmySize();
    Integer getArmyDamage();
}
