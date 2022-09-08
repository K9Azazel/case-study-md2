package model;

public class Position extends Employee {
    public int posID;
    public String position_type;
    private int salary;

    public Position() {
        this.posID = posID;
        this.position_type = position_type;
        this.salary = salary;
    }
    public Position(int posID, String position_type, int salary) {
        this.posID = posID;
        this.position_type = position_type;
        this.salary = salary;
    }

    public int getPosID() {
        return posID;
    }

    public void setPosID(int posID) {
        this.posID = posID;
    }

    public String getPosition_type() {
        return position_type;
    }

    public void setPosition_type(String position_type) {
        this.position_type = position_type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
