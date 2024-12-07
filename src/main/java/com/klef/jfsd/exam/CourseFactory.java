package com.klef.jfsd.exam;

import org.springframework.beans.factory.FactoryBean;

public class CourseFactory implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseId(301);
        course.setCourseName("Advanced Spring Framework");
        course.setCredits(4);
        
        Instructor instructor = new Instructor();
        instructor.setInstructorId(102);
        instructor.setName("Jane Doe");
        instructor.setEmail("jane.doe@example.com");
        instructor.setPhoneNumber("9876543210");
        course.setInstructor(instructor);

        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return Course.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
