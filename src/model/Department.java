package model;

public class Department extends Employee {
    public int deptID;
    public String dept_name;
    public String location;

    public Department() {
        this.deptID = deptID;
        this.dept_name = dept_name;
        this.location = location;
    }

    public Department(int deptID, String dept_name, String location) {
        this.deptID = deptID;
        this.dept_name = dept_name;
        this.location = location;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
