package model;

import java.util.LinkedList;
import java.util.List;

public class EmployeeManagement {
    private String name;
    public static List<Employee> EmployeeList = new LinkedList<>();


    public EmployeeManagement(String name, List<Employee> EmployeeList) {
        this.name = name;
        this.EmployeeList = EmployeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        EmployeeList = employeeList;
    }
}