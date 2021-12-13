import java.util.ArrayList;

public class ALTester {

    public static void main(String[] args) {
        ALTester stillDavid = new ALTester();
        ArrayList<Integer> sortedList = new ArrayList<Integer>(); //intializes Arraylist list as a list of integers
        for (int i = 0; i < 23; i++) {
            sortedList.add(i);
        }
        System.out.println(stillDavid.isSorted(sortedList));

        ALTester bob = new ALTester();
        ArrayList<Integer> unsortedList = new ArrayList<Integer>();
        for(int i=20; i>0; i--) {
            unsortedList.add(i);
        }
        System.out.println(bob.isSorted(unsortedList));
    }

    public boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

}