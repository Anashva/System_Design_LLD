package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Manager  implements Employee{
    private String name;
    private List<Employee> employees;
    public Manager(String name){
        this.name=name;
        employees=new ArrayList<>();
    }
    void add(Employee employee){
        employees.add(employee);
    }
    void remove(Employee employee){
        employees.remove(employee);
    }

    @Override
    public void showdetails() {
        System.out.println("Manager : "+name);

        for (Employee e:employees){
            e.showdetails();
        }
    }
}
