package HW13;
public class Worker extends Employee {


    public Worker(int baseSalary, String name, int salary) {
        super(baseSalary, name, salary);
    }

    @Override
    public final int getSalary() {
        return getBaseSalary();
    }
}
