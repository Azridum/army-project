import army.Army;
import army.IArmy;
import factories.*;
import militaryunits.IMilitaryUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArmyTest {

    IArmy army;
    IMilitaryUnitFactory archerFactory;
    IMilitaryUnitFactory heavyCavalryFactory;
    IMilitaryUnitFactory swordsmanFactory;
    IMilitaryUnitFactory armoredSwordsmanFactory;

    @BeforeEach
    void init() {
        this.army = new Army();
        this.archerFactory = new ArcherMilitaryUnitFactory();
        this.heavyCavalryFactory = new HeavyCavalryMilitaryUnitFactory();
        this.swordsmanFactory = new SwordsmanMilitaryUnitFactory();
        this.armoredSwordsmanFactory = new ArmoredSwordsmanMilitaryUnitFactory();
    }

    @Test
    void testGetArmySizeEmpty() {
        assertEquals(0, army.getArmySize());
    }

    @Test
    void testAddUnit() {
        army.addUnit(this.heavyCavalryFactory.createUnit());
        assertEquals(1, army.getArmySize());
    }

    @Test
    void testGetArmyDamageEmptyArmy() {
        assertEquals(0, army.getArmyDamage());
    }

    @Test
    void testGetArmyDamageOneOfEachKind() {
        army.addUnit(this.heavyCavalryFactory.createUnit());
        army.addUnit(this.armoredSwordsmanFactory.createUnit());
        army.addUnit(this.archerFactory.createUnit());
        assertEquals(90, army.getArmyDamage());
    }

    @Test
    void testDamageAllSomeRemain() {
        army.addUnit(this.heavyCavalryFactory.createUnit());
        army.addUnit(this.armoredSwordsmanFactory.createUnit());
        army.addUnit(this.swordsmanFactory.createUnit());
        army.addUnit(this.archerFactory.createUnit());
        army.damageAll(80);
        army.damageAll(80);
        assertEquals(2, army.getArmySize());
    }

    @Test
    void testDamageAllNoneRemain() {
        army.addUnit(this.heavyCavalryFactory.createUnit());
        army.addUnit(this.armoredSwordsmanFactory.createUnit());
        army.addUnit(this.swordsmanFactory.createUnit());
        army.addUnit(this.archerFactory.createUnit());
        army.damageAll(200);
        army.damageAll(200);
        assertEquals(0, army.getArmySize());
    }

    @Test
    void testArcher() {
        IMilitaryUnit archer = this.archerFactory.createUnit();
        assertEquals(20, archer.doDamage());
        archer.sufferDamage(20);
        assertEquals(30, archer.getHealth());
    }

    @Test
    void testHeavyCavalry() {
        IMilitaryUnit heavyCavalry = this.heavyCavalryFactory.createUnit();
        assertEquals(60, heavyCavalry.doDamage());
        assertEquals(20, heavyCavalry.doDamage());
        heavyCavalry.sufferDamage(20);
        assertEquals(140, heavyCavalry.getHealth());
    }

    @Test
    void testSwordsmanArmored() {
        IMilitaryUnit swordsman = this.armoredSwordsmanFactory.createUnit();
        swordsman.sufferDamage(20);
        assertEquals(100, swordsman.getHealth());
        swordsman.sufferDamage(20);
        assertEquals(90, swordsman.getHealth());
        assertEquals(10, swordsman.doDamage());
    }

    @Test
    void testSwordsmanUnarmored() {
        IMilitaryUnit swordsman = this.swordsmanFactory.createUnit();
        swordsman.sufferDamage(20);
        assertEquals(100, swordsman.getHealth());
        swordsman.sufferDamage(20);
        assertEquals(80, swordsman.getHealth());
        assertEquals(10, swordsman.doDamage());
    }
}
