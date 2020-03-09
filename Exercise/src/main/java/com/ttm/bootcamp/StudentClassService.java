package com.ttm.bootcamp;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;


import java.util.ArrayList;
import java.util.List;

@Component(service = Service2.class , property = {"version =1.0","service.description= this is the version 1 of New Service",
        "serice.vendors=TTN"})
public class StudentClassService implements Service2{
    private List<Student> list = new ArrayList<Student>();



    @Reference
    Service1 service1;

    @Activate
    public void activate(){
        System.out.println("acivate");
        Student std = new Student(1,"priyanka",100);
        addStudent(std);
        Student std1 = new Student(20,"pia",10);
        addStudent(std1);
        Student std2 = new Student(2,"joe",90);
        addStudent(std2);
        Student std3 = new Student(3,"roe",80);
        addStudent(std3);
        System.out.println(isStudentPassed(1));
        System.out.println(getStudent(1));
        getAllStudent();
    }
    @Deactivate
    public void deactivate(){
        deleteStudent(20);
        getAllStudent();
    }

    public void addStudent(Student student){
        if(service1.isClassLimitReached(list)) {
            list.add(student);
        }
        System.out.println("Added");
    }
    public void deleteStudent(int id){
        for(int i=0;i<list.size();i++)
        {
            Student stu = list.get(i);
            if (stu.getStudentID()==id){
                  list.remove(stu);
            }
        }

        System.out.println("removed");
    }
    public boolean isStudentPassed(int id){
        for(int i=0;i<list.size();i++)
        {
            Student stu = list.get(i);
            if
            (stu.getStudentID()==id){
                if (stu.getMarks()>= service1.getPassingMarks())
                {
                    return  true;
                }

            }
        }

        return false;
    }
   public Student getStudent(int id){
       for(int i=0;i<list.size();i++)
       {
           Student stu = list.get(i);
           if (stu.getStudentID()==id){
               return stu;
           }
       }
       return null;
    }
    public List<Student> getAllStudent(){
        System.out.println(list);
        return list ;
    }

}
