package com.ttm.bootcamp;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import java.util.List;

@Component()
@Designate(ocd=ClassCongifService.class)
public class StudentService implements Service1 {

    private int num;
    private int marks;
    @Activate
    public void activate(ClassCongifService config)
    {
        num = config.Num_Student();
        marks = config.Passing_Marks();
    }

    public boolean isClassLimitReached(List list){
        return list.size()<num;
    }

    public int getPassingMarks(){
        return marks;
    }



}
