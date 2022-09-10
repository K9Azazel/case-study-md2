package model;

import java.util.List;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean gender = true; // true: male , false: female
    private String doB;

    public Employee() {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.doB = doB;
    }

    public Employee(int employeeID, String firstName, String lastName, String email, String phone, boolean gender, String doB) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.doB = doB;
    }

    public int getEmployee_ID() {
        return employeeID;
    }

    public void setEmployee_ID(int employee_ID) {
        employeeID = employee_ID;
    }

    public String getFirst_Name() {
        return firstName;
    }

    public void setFirst_Name(String first_Name) {
        firstName = first_Name;
    }

    public String getLast_Name() {
        return lastName;
    }

    public void setLast_Name(String last_Name) {
        lastName = last_Name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", Last_Name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", doB='" + doB + '\'' +
                '}';
    }
}
