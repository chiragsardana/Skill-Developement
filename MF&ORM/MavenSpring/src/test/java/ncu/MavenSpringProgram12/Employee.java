package ncu.MavenSpringProgram12;

import org.springframework.stereotype.Component;

@Component("Employee")
public class Employee {
    String name;
    int age;
    Address address;
    int no_of_Days_Working;

    public void getName() {
        System.out.println("In getName");
    }

    public void setName() {
        System.out.println("In set Name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getNo_of_Days_Working() {
        return no_of_Days_Working;
    }

    public void setNo_of_Days_Working(int no_of_Days_Working) {
        this.no_of_Days_Working = no_of_Days_Working;
    }

    public void calculate_sal()
    {
        System.out.println("In Calculate Salary");
    }
}
