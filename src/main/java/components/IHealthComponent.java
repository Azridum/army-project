package components;

public interface IHealthComponent {
    void takeDamage(Integer damage);
    boolean isDowned();
    Integer getHealth();
}
