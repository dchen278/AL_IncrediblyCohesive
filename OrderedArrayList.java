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

    public boolean addLinear(Integer value) {
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
    
    // use binary search to find the correct index and add newVal
    public void addBinary(Integer newVal) {
        int low = 0;
        int high = _list.size() - 1;
        int mid = (low + high) / 2;
        int index = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (newVal.compareTo(_list.get(mid)) < 0) {
                high = mid - 1;
            } else if (newVal.compareTo(_list.get(mid)) > 0) {
                low = mid + 1;
            } else {
                index = mid;
                break;
            }
        }
        _list.add(index, newVal);
    }

    public static void main(String[] args) {
        OrderedArrayList list = new OrderedArrayList();
        System.out.println("Printing empty OrderedArrayList: \n" + list);

        for (int i = 0; i < 10; i++) {
            list.addBinary((int) (Math.random() * 100));
        }

        System.out.println("Printing OrderedArrayList with 10 random values from 1 to 100: \n" + list);

        System.out.println("Removing value at index 3: \n" + list.remove(3));

        System.out.println("Printing OrderedArrayList after removing value at index 3: \n" + list);
    }
}
