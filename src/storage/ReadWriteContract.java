//package storage;
//
//import model.Contract;
//import model.Employee;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadWriteContract implements IReadWriteData<Contract> {
//    @Override
//    public List<Contract> readData() {
//        List<Contract> employeeList = new ArrayList<>();
//        try {
//            FileInputStream fis = new FileInputStream("Employee.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            employeeList = (List<Contract>) ois.readObject();
//            ois.close();
//            fis.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return employeeList;
//    }
//
//    @Override
//    public void writeData(List<Contract> employeeList) {
//        try {
//            FileOutputStream fos = new FileOutputStream("Employee.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(employeeList);
//            oos.close();
//            fos.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
