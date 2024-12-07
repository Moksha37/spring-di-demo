package com.klef.jfsd.exam;

import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;
    private List<String> skills;
    private Department departmentDetails; // For autowiring

    public Employee(int employeeId, String name, double salary, String department, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public Department getDepartmentDetails() {
        return departmentDetails;
    }

    public void setDepartmentDetails(Department departmentDetails) {
        this.departmentDetails = departmentDetails;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + 
               ", department=" + department + ", skills=" + skills + ", departmentDetails=" + departmentDetails + "]";
    }
}
