package com.ttm.bootcamp;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name ="Student Config" ,description = "This is a description")
public @interface ClassCongifService {
    @AttributeDefinition(name ="Number of students" ,type = AttributeType.INTEGER, description = "some descripton")
    int Num_Student() default 20;

    @AttributeDefinition(name ="Passing Marks" ,type = AttributeType.INTEGER, description = "some descripton")
    int Passing_Marks() default 23;
}
