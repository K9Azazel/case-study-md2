package model;

import model.Employee;

public abstract class Branch extends Employee {

    public Branch(String branch_name, String idBranch) {
        this.branch_name = branch_name;
        this.idBranch = idBranch;
    }

    public Branch(int employee_ID, String first_Name, String last_Name, String email, String phone, String doB, String branch_name, String idBranch) {
        super(employee_ID, first_Name, last_Name, email, phone, doB);
        this.branch_name = branch_name;
        this.idBranch = idBranch;
    }

    public String branch_name;
    public String idBranch;
    public Branch(String name, int employee_iD){};

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }
}
