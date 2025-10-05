package entities;

public class JuridicPerson extends Person {

    private Integer employeeNumber;

    public JuridicPerson() {
    }

    public JuridicPerson(String name, Double income, Integer employeeNumber) {
        super(name, income);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public Double tax() {
        if (employeeNumber > 10) {
            return super.getIncome() * 0.14;
        } else {
            return super.getIncome() * 0.16;
        }
    }
}