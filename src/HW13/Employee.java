package HW13;

public abstract class Employee {
 private int BaseSalary;
 private String name;
 private int salary;

 public Employee(int baseSalary, String name, int salary) {
  BaseSalary = baseSalary;
  this.name = name;
  this.salary = salary;
 }

 public int getBaseSalary() {
  return BaseSalary;
 }

 public void setBaseSalary(int baseSalary) {
  BaseSalary = baseSalary;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getSalary() {
  return salary;
 }
}
