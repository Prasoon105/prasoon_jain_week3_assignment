package abstractClass;

public class FullTimeEmployee extends Employee {
    private double basicSalary;

    public FullTimeEmployee(String name, int id, double basicSalary) {
        super(name, id);
        this.basicSalary = basicSalary;
    }

    @Override
    double calculateSalary() {
        return basicSalary;
    }
}

