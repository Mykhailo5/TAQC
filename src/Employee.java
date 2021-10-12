import com.company.Main;

public class Employee{
    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public Employee(){}
    public Employee(String name, int rate){
        this.name=name;
        this.rate=rate;
    }
    public Employee(String name, int rate, int hours){
        this.name=name;
        this.rate=rate;
        this.hours=hours;
    }
    public int getSalary(){
        return rate*hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
    public double getBonuses(){
        return getSalary()*0.10;
    }

}
