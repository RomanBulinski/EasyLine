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




//        testing(Easyline.easyLine(17), new BigInteger("2333606220"));
//        testing(Easyline.easyLine(19), new BigInteger("35345263800"));

}
