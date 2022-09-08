package controller;

import model.Employee;
import java.util.LinkedList;
import java.util.List;

public class EmployeeController {
    public static List<Employee> EmployeeList = new LinkedList<>();
    public void addEmployeeList(Employee employee) {
        EmployeeList.add(employee);
    }

    public void editEmployee(int index, Employee employee) {
        EmployeeList.set(index, employee);
    }
}
