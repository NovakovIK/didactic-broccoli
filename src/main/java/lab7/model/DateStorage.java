package lab7.model;

import java.util.ArrayList;
import java.util.List;

public class DateStorage {
    private List<Date> computers = new ArrayList<>();

    public void add(Date computer) {
        computers.add(computer);
    }

    public void remove(int index) {
        computers.remove(index);
    }

    public List<Date> fetchList() {
        return computers;
    }

    public int size() {
        return computers.size();
    }
}
