package compare;

import java.util.*;

public class Student {
    public static void main(String[] args) {
        List<People> people = new ArrayList<People>();

        people.add(new People("Priyanka",99.0,10.0));
        people.add(new People("Abhinav",99.0,20.0));
        people.add(new People("Joe",93.0,30.0));
        people.add(new People("Madonna",90.0,40.0));

        Collections.sort(people, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if(o1.getStudent_score()>o2.getStudent_score())
                {
                    return 1;
                }
                else if(o1.getStudent_score()< o2.getStudent_score())
                {
                    return -1;
                }
               else{
                    return (o1.getStudent_name().compareTo(o2.getStudent_name()));
                }
            }
        });

        for (People student : people) {
            System.out.println("name: "+student.getStudent_name()+" score: "+student.getStudent_score());
        }
    }
}
class People{
    private String student_name;
    private Double student_score;
    private Double student_age;

    public People(String student_name, Double student_score, Double student_age) {
        this.student_name = student_name;
        this.student_score = student_score;
        this.student_age = student_age;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Double getStudent_score() {
        return student_score;
    }

    public void setStudent_score(Double student_score) {
        this.student_score = student_score;
    }

    public Double getStudent_age() {
        return student_age;
    }

    public void setStudent_age(Double student_age) {
        this.student_age = student_age;
    }
}