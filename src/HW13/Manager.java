package HW13;

public final class  Manager extends Employee{

    private int NumberOfSubordinates;
    private final int SALARY_COEFFICIENT = 3;

    public Manager(int baseSalary, String name, int salary, int numberOfSubordinates) {
        super(baseSalary, name, salary);
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    @Override

    public int getSalary() {
        if(getNumberOfSubordinates()==0){
            return getBaseSalary();
        }
        else {
            return (int)(getBaseSalary() * getNumberOfSubordinates()*SALARY_COEFFICIENT/100.0);
        }
    }
}
