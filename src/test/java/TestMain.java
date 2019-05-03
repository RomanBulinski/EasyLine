import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {


    @Test
    public void test0() {
        assertEquals( new BigInteger("70"), Main.easyLine(4));
    }

    @Test
    public void test1() {
        assertEquals( new BigInteger("3432"), Main.easyLine(7));
    }


    @Test
    public void test2() {
        assertEquals( new BigInteger("10400600"), Main.easyLine(13));
    }


    @Test
    public void test3() {
        assertEquals( new BigInteger("2333606220"), Main.easyLine(17));
    }

    @Test
    public void test4() {
        assertEquals( new BigInteger("35345263800"), Main.easyLine(19));
    }



//    @Test
//    public void test50() {
//        assertEquals( new BigInteger("100891344545564193334812497256"), Main.easyLine(50));
//    }


}
