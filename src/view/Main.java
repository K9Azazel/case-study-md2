package view;
import model.Contract;
import model.Employee;
import view.EmployeeDisplay;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee person = new Employee(Employee.txt);
        int choice =-1;

        do {
            System.out.println("Human Resource Portal");
            System.out.println("1. Thêm thông tin nhân viên \n" +
                    "2. Sửa thông tin nhân viên \n" +
                    "3. Hiển thị thông tin nhân viên \n"+
                    "0 .Thoát\n" +
                    "----------------------");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice){
                case 1:

            }
        }while (choice != 0);


}
