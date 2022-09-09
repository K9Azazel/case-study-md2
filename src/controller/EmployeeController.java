package controller;

import model.Employee;
import storage.IReadWriteData;
import storage.ReadWriteEmployee;
import java.util.List;
import java.lang.String;
import java.util.Objects;

public class EmployeeController {
    private String name;

    public EmployeeController() {
    }

    public EmployeeController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static IReadWriteData iReadWriteData = new ReadWriteEmployee();
    public static List<Employee> employeeList = iReadWriteData.readData();

    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        iReadWriteData.writeData(employeeList);

    }

    public void setEmployeeList(int index, Employee employee) {
        employeeList.set(index, employee);
        iReadWriteData.writeData(employeeList);
    }

    public void deleteEmployee(int index) {
        employeeList.remove(index);
        iReadWriteData.writeData(employeeList);
    }

    public void displayEmployee() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
    private int findPersonByIdEmployee(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if(Objects.equals(employeeList.get(i).getEmployee_ID(), id)){
                return i;
            }
        }
        return -1;
    }
}
