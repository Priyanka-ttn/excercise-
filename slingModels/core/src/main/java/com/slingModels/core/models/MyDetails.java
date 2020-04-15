package com.slingModels.core.models;


import org.apache.sling.api.resource.Resource;
//import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

@Model(adaptables = Resource.class )
public class MyDetails {
    @Inject @Optional @Default(values="defaultValue")
    private String firstname;

    @Inject @Optional @Default(values="defaultValue")
    private String lastname;

    @Inject @Optional
    private Calendar date;

    @Inject @Optional  @Default(values="Single")
    private String marital;

    @Inject @Optional  @Default(values="male")
    private String gender;

    private String fullname;
    private int age;
    private String honorific;

    public MyDetails() {
    }

 @PostConstruct
    protected void init(){
        fullname = firstname+" "+lastname;
        if(gender.equals("male")){
            honorific="Mr";
        }
        if (gender.equals("female") && marital.equals("single")){
            honorific="Ms";
        }
        if (gender.equals("female") && marital.equals("married")){
            honorific="Mrs";
        }
        age = ageGet();
    }

    private int ageGet() {
        if (date == null) {
            return 0;
        } else {
            int year = date.get(Calendar.YEAR);
            int month = date.get(Calendar.MONTH) + 1;
            int d = date.get(Calendar.DATE);
            LocalDate l1 = LocalDate.of(year, month, d);
            LocalDate now = LocalDate.now();
            Period diff = Period.between(l1, now);
            return diff.getYears();
        }
    }
    public String getFullname() {

        return fullname;
    }

    public int getAge() {
        return age;
    }
    public String getHonorific() {
        return honorific;
    }



}
