public class Encapsulation {
    private String name;
    private int salary;
    String test = "Hello";
    public void setDetails(String Sname, int sSalary){
        this.name = Sname;
        this.salary = sSalary;
    }

    public void getDetails(){
        System.out.println("The name of employee is " + name + " and the salary of employee is " + salary);
    }
}
