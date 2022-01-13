package army;

import militaryunits.IMilitaryUnit;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Army implements IArmy {
    private Collection<IMilitaryUnit> militaryUnits = new LinkedList<>();

    @Override
    public void addUnit(IMilitaryUnit militaryUnit) {
        this.militaryUnits.add(militaryUnit);
    }

    @Override
    public void damageAll(Integer damage) {
        this.militaryUnits.forEach(militaryUnits -> militaryUnits.sufferDamage(damage));

        this.militaryUnits = this.militaryUnits.stream()
                .filter(militaryUnit -> !militaryUnit.isDowned())
                .collect(Collectors.toList());
    }

    @Override
    public Integer getArmySize() {
        return this.militaryUnits.size();
    }

    @Override
    public Integer getArmyDamage() {
        return this.militaryUnits.stream()
                .mapToInt(IMilitaryUnit::doDamage)
                .sum();
    }
}
