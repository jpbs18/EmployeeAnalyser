package academy.mindswap;

public final class Employee {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final int salary;
    private final int yearsInDepartment;

    public Employee(String firstName,String lastName,int age, int salary,int yearsInDepartment){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.yearsInDepartment = yearsInDepartment;
    }

    public String getFirstName() {return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getAge() {return this.age;}
    public int getSalary() {return this.salary;}
    public int getYearsInDepartment() {return this.yearsInDepartment;}
}
