package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Constructor Dependency Injection
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Info:");
        System.out.println(employee);
        System.out.println("Bonus (10%): " + employee.calculateBonus(10));

        // Autowiring with Instructor and Course
        Course course = (Course) context.getBean("course");
        System.out.println("\nCourse Info:");
        System.out.println(course);

        // Department Info (Autowiring)
        System.out.println("\nDepartment Info:");
        System.out.println(employee.getDepartmentDetails());
    }
}
