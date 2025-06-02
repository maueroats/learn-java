import java.util.*;

public class TestMain {
    public static void test1() {
        int howmany = 10;
        int ans = Main.adder(howmany);
        boolean ok = ans == 15;
        System.out.println(ok);

        boolean[] testlots = { Main.adder(30) == 35};
        System.out.println(Arrays.toString(testlots));
    }
    public static void main(String[] args) {
        test1();
    }
}
