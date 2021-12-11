import java.util.ArrayList;

public class OrderedArrayList {
    private ArrayList<Integer> _list;

    public OrderedArrayList() {
        _list = new ArrayList<Integer>();
    }

    public String toString() {
        return _list.toString();
    }

    public Integer get(int index) {
        return _list.get(index);
    }

    public boolean add(Integer value) {
        int i = 0;
        while (i < _list.size()) {
            if (value.compareTo(_list.get(i)) < 0) {
                _list.add(i, value);
                return true;
            }
        }
        _list.add(value);
        return true;
    }

    public Integer remove(int index) {
        return _list.remove(index);
    }

    public int size() {
        return _list.size();
    }

    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList();
        
    }
}