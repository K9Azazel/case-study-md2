package model;

public class Contract extends Employee {
    public int contract_id;
    public String contract_type;
    private int salary;
    private boolean status_termination = false;

    public Contract() {
        this.contract_id = contract_id;
        this.contract_type = contract_type;
        this.salary = salary;
        this.status_termination = status_termination;
    }

    public Contract(int contract_id, String contract_type, int salary, boolean status_termination) {
        this.contract_id = contract_id;
        this.contract_type = contract_type;
        this.salary = salary;
        this.status_termination = status_termination;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isStatus_termination() {
        return status_termination;
    }

    public void setStatus_termination(boolean status_termination) {
        this.status_termination = status_termination;
    }
}
