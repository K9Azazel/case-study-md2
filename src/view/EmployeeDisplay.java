package view;

import model.Employee;
import storage.ReadWriteEmployee;

import java.util.List;
import java.util.Scanner;

import static controller.EmployeeController.*;

public class EmployeeDisplay {
    public  void menuSystem(){

        try {
            menuEmployee();
        }
        catch (Exception e) {
            System.out.println("Nhập sai hoặc trùng ID xin vui lòng nhập lại");
            menuSystem();
        }

    }

    private void menuEmployee() {
        System.out.println("Human Resource Portal");
        System.out.println("1. Thêm thông tin nhân viên \n" +
                "2. Sửa thông tin nhân viên \n" +
                "3. Xóa thông tin nhân viên \n" +
                "4. Hiển thị thông tin nhân viên \n" +
                "5. Kiểm tra thông tin hợp đồng \n" +
                "0 .Thoát\n" +
                "----------------------");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1: addEmployee(employeeList);
//            case 2: systemId();

        }
    }

//    private void systemId() {
//        try{
//
//        }
    }

    public void addEmployee(List<Employee> employeeList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id của nhân viên: ");
        int id = scanner.nextInt();
        System.out.println(" nhập tên của nhân viên: ");
        Scanner scanner1 = new Scanner(System.in);
        String firstName = scanner1.nextLine();
        System.out.println(" nhập họ của nhân viên: ");
        Scanner scanner2 = new Scanner(System.in);
        String lastName = scanner2.nextLine();
        System.out.println(" nhập email của nhân viên: ");
        Scanner scanner5 = new Scanner(System.in);
        String email = scanner5.nextLine();
        System.out.println(" nhập số điện thoại: ");
        Scanner scanner4 = new Scanner(System.in);
        String phone = scanner4.nextLine();
        System.out.println(" nhập ngày sinh của nhân viên: ");
        Scanner scanner3 = new Scanner(System.in);
        String doB = scanner3.nextLine();
        CheckEmployee(id, firstName, lastName, email, phone, doB);
    }
//    public void editEmployee(List<Employee> employeeList){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập id của nhân viên: ");
//        int id = scanner.nextInt();
//        System.out.println(" nhập tên của nhân viên: ");
//        Scanner scanner1 = new Scanner(System.in);
//        String firstName = scanner1.nextLine();
//        System.out.println(" nhập họ của nhân viên: ");
//        Scanner scanner2 = new Scanner(System.in);
//        String lastName = scanner2.nextLine();
//        System.out.println(" nhập email của nhân viên: ");
//        Scanner scanner5 = new Scanner(System.in);
//        String email = scanner5.nextLine();
//        System.out.println(" nhập số điện thoại: ");
//        Scanner scanner4 = new Scanner(System.in);
//        String phone = scanner4.nextLine();
//        System.out.println(" nhập ngày sinh của nhân viên: ");
//        Scanner scanner3 = new Scanner(System.in);
//        String doB = scanner3.nextLine();
//        CheckEmployee(id, firstName, lastName, email, phone, doB);
//    }

    private void CheckEmployee(int id, String firstName, String lastName, String email, String phone, String doB) {
        if (checkIDEmployee(id)){
            System.out.println("ID đã tồn tại");
        }
        else {
            System.out.println("Đã đăng ký thành công ID cho nhân viên mới");
            addNewEmployee(new Employee(id, firstName, lastName, email, phone, doB));
            System.out.println("");
        }
        menuSystem();
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

