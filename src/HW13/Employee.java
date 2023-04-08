package HW13;


public  class Employee extends BaseEmployee {
 private String name;
 private int salaryDay;
 private int age;
 private String gender;

 Employee em= new Employee();
 int emsal = em.getSalaryDay();

 @Override

 public int getSalary(Month[] monthArray){
  int salaryMon = 0;
  for (int i = 0; i < monthArray.length; i++) {
   salaryMon = emsal * monthArray[i].getDayWork();

  }
  return salaryMon;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getSalaryDay() {
  return salaryDay;
 }

 public void setSalary(int salary) {
  this.salaryDay = salary;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }



}

