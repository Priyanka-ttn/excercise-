package compare;

import java.util.*;

public class Employee {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("priyanka",100.0,22.0));
        person.add(new Person("pri",180.0,20.0));
        person.add(new Person("priyansh",1090.0,28.0));
        person.add(new Person("piku",10.0,27.0));
        person.add(new Person("prika",1000.0,23.0));

        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getSalary() > o2.getSalary()){
                    return -1;
                }
                else if(o1.getSalary() < o2.getSalary()){
                    return 1;
                }
                return 0;
            }
        });

        for (Person people : person) {
            System.out.println("name: "+people.getEmployee_name()+" salary: "+people.getSalary());
        }

    }
}

class Person{
    private String employee_name;
    private Double salary;
    private Double age;

    public Person(String employee_name, Double salary, Double age) {
        this.employee_name = employee_name;
        this.salary = salary;
        this.age = age;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
}