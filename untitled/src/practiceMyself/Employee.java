package practiceMyself;

public class Employee {
    int id;
    String firstname;
    String lastname;
    int salary;

    public Employee(int id, String firstname, String lastname, int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getID(){
        return id;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getName(){
        return getFirstname() + " " + getLastname();
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int Salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return getSalary() * 12;
    }

    public int raiseSalary(double percent){
        double raise =  getSalary() * (percent/100);
        this.salary += raise;
        return salary;
    }

    public String toString(){
        return "Employee[id = " + getID() + " name = " + getName() + " salary = " + getSalary()  + "]";
    }

}
