import java.util.ArrayList;

public class ALTester {
    static ArrayList<Integer> stillDavid = new ArrayList<Integer>();

    public static void main(String[] args) {
        ALTester tester = new ALTester();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 23; i++) {
            list.add(i);
        }
        System.out.println(tester.test(list));
    }

    public boolean test(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

}