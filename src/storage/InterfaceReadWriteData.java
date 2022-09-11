package storage;

import java.util.List;

public interface InterfaceReadWriteData<T> {
    List<T> readData();
    void writeData(List<T> list);
}
