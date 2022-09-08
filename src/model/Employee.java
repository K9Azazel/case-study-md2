package model;

import java.util.List;

public class Employee {
    private int Employee_ID;
    private String First_Name;
    private String Last_Name;
    private String email;
    private String phone;
    private boolean gender = true; // true: male , false: female
    private String doB;

    public Employee() {
    }

    public Employee(int employee_ID, String first_Name, String last_Name, String email, String phone, boolean gender, String doB) {
        Employee_ID = employee_ID;
        First_Name = first_Name;
        Last_Name = last_Name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.doB = doB;
    }

    public int getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        Employee_ID = employee_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public void add(List<Employee> employeeList) {
    }
}
