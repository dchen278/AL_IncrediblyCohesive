import java.util.ArrayList;

public class OrderedArrayList {
    private ArrayList<Integer> _list;

    public OrderedArrayList() {
        _list = new ArrayList<Integer>();
    }

    // return the string representation of the list
    public String toString() {
        return _list.toString();
    }

    // gets the value at the specified index
    public Integer get(int index) {
        return _list.get(index);
    }

    // remove the value at the specified index
    public Integer remove(int index) {
        return _list.remove(index);
    }

    // returns the size of the list
    public int size() {
        return _list.size();
    }


    public boolean add(Integer value) {
        int i = 0;
        while (i < _list.size()) {
            if (value.compareTo(_list.get(i)) < 0) {
                _list.add(i, value);
                return true;
            }
            i++;
        }
        _list.add(value);
        return true;
    }
    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList();
        System.out.println("Printing empty OrderedArrayList: \n" + list);

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        System.out.println("Printing OrderedArrayList with 10 random values from 1 to 100: \n" + list);

        System.out.println("Removing value at index 3: \n" + list.remove(3));

        System.out.println("Printing OrderedArrayList after removing value at index 3: \n" + list);
    }
}
