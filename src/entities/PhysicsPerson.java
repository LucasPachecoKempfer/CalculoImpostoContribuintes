package entities;

public class PhysicsPerson extends Person {

    private Double healthSpending;

    public PhysicsPerson(String name, Double income, Double healthSpending) {
        super(name, income);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double tax() {
        if (super.getIncome() < 20000.00 && super.getIncome() > 0){
            return (getIncome() * 0.15) - (healthSpending * 0.5);
        } else {
            return (getIncome() * 0.25) - (healthSpending * 0.5);
        }
    }

}