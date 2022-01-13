package militaryunits;

public interface IMilitaryUnit {
    Integer doDamage();
    void sufferDamage(Integer damage);
    boolean isDowned();
    Integer getHealth();
}
