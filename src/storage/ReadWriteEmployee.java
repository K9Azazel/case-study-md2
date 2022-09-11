package storage;


import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployee implements IReadWriteData {
    private static final String fileName="G:\\c0622i1\\case-study-md2\\Employee.txt";
    private static ReadWriteEmployee instance = null;

    public ReadWriteEmployee() {
    }
    public static ReadWriteEmployee getInstance() {
        if (instance == null) instance = new ReadWriteEmployee();
        return instance;
    }

    @Override
    public List<Employee> readData() {
        List<Employee> employeeList = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            System.err.println("Can't open file or can't find file");
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException exception) {
            exception.printStackTrace();
            System.err.println("Can't open file or can't find file");
        }
        Object obj = null;
        try {
            obj = ois.readObject();
            System.out.println("Load finish!!!");
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        employeeList = (List<Employee>) obj;
        return employeeList;

    }



    @Override
    public void writeData(List<Employee> employeeList) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employeeList);
            oos.close();
            fos.close();
            System.out.println("Save finish!");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}