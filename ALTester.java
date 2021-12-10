import java.util.ArrayList;

public class ALTester {
    static ArrayList<Integer> stillDavid = new ArrayList<Integer>();
    public static void main(String[] args) {
        ALTester demo = new ALTester();
        for (int i = 0; i < 24; i++) {
            // populate stillDavid with 
            stillDavid.add(i);
        }
        stillDavid.add(1);
        System.out.println(demo.sorted());
    }

    public boolean sorted() {
        for (int i = 0; i < stillDavid.size() - 1; i++) {
            if (stillDavid.get(i) > stillDavid.get(i + 1)) {
                return false;
            }
        }
        return true;
    }


}