package view;

import model.Employee;

import java.util.Scanner;

public class EmployeeDisplay {
    public static Employee EmployeeDisplay(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("nhập id của nhân viên: ");
        int employeeID = sc.nextInt();
        System.out.println(" nhập tên của nhân viên: ");
        String firstName = sc.nextLine();
        System.out.println(" nhập họ của nhân viên: ");
        String lastName = sc.nextLine();
        System.out.println(" nhập ngày sinh của nhân viên: ");
        String doB = sc.nextLine();
        System.out.println(" nhập số điện thoại: ");
        String phone = sc1.nextLine();
        System.out.println(" nhập email của nhân viên: ");
        String email = sc1.nextLine();
        return new Employee(employeeID,firstName,lastName,email,phone,doB);
    }
    public static int getIndexOfEmployee() {
        System.out.println("Nhập vị trí nhân viên cần sửa hoặc xóa");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        return index;
    }
    public static String getIdEmployee() {
        System.out.println("Nhập mã nhân viên: ");
        Scanner scanner=new Scanner(System.in);
        String EmployeeID =scanner.nextLine();
        return EmployeeID;
    }
}

