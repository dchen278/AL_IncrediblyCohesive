import java.util.ArrayList;

public class ALTester {

    public static void main(String[] args) {
        ALTester stillDavid = new ALTester();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 23; i++) {
            list.add(i);
        }
        System.out.println(stillDavid.test(list));
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