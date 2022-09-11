package controller;

import model.Employee;
import storage.IReadWriteData;
import storage.ReadWriteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.util.Objects;

public class EmployeeController {
    public static List<Employee> employeeList = new ArrayList<>();


    static IReadWriteData iReadWriteData = new ReadWriteEmployee();

    public static void addNewEmployee(Employee employee) {
        employeeList = iReadWriteData.readData();
        employeeList.add(employee);
        iReadWriteData.writeData(employeeList);

    }

    public static void setEmployeeList(int index, Employee employee) {
        employeeList = iReadWriteData.readData();
        employeeList.set(index, employee);
        iReadWriteData.writeData(employeeList);
    }

    public static void deleteEmployee(int index) {
        employeeList.remove(index);
        iReadWriteData.writeData(employeeList);
    }

    public static void displayEmployee() {
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
    public static boolean checkIDEmployee(int id) {
        boolean check = false;
        for (Employee u: employeeList
             ) {
            if (id == u.getEmployee_ID()) {
                check = true;
            }
        }
        return check;
    }
}
