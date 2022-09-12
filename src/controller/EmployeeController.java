package controller;

import model.Employee;
import storage.IReadWriteData;
import storage.ReadWriteEmployee;

import java.util.ArrayList;
import java.util.List;


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
    public static boolean checkIDEmployee(int id) {
        boolean check = false;
        for (Employee u : employeeList
        ) {
            if (id == u.getEmployee_ID()) {
                check = true;
            }
        }
        return check;
    }

    public static void deleteEmployee(int id) {
        employeeList = iReadWriteData.readData();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployee_ID() == id) {
                employeeList.remove(i);
                iReadWriteData.writeData(employeeList);

            }

        }
    }
    public static void displayEmployee(){
        List<Employee> employeeList;
        employeeList = iReadWriteData.readData();
        for (Employee p : employeeList
        ) {
            System.out.println(p);
        }

    }
}