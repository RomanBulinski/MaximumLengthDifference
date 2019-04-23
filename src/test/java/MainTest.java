import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void test() {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, Main.mxdiflg(s1, s2)); // 13
    }


    @Test
    public void testEmptyinput() {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{};
        assertEquals(-1, Main.mxdiflg(s1, s2));
    }


    @Test
    public void testEmptyArrays() {
        String[] s1 = new String[]{};
        String[] s2 = new String[]{};
        assertEquals(-1, Main.mxdiflg(s1, s2));
    }


}
