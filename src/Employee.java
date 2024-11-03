public class Employee {
    private String id, name;
    private double salary=0;

    public Employee() {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getAnnualSalary() {
            double annualSalary=this.salary*12;
            return annualSalary;
        }


    public double raisedSalary(int percent){
        double raiseAmount = this.salary * (percent / 100.0);
        this.salary += raiseAmount;
        return this.salary;

    }

    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
