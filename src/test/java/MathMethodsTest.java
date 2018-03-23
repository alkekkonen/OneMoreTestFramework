import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class MathMethodsTest {

    private static final Logger log = Logger.getLogger(MathMethodsTest.class);

    private MathMethods mm = new MathMethods();

    @Test
    public void testTwoNumbersSumPositive(){
        log.debug("Start processing testTwoNumbersSumPositive with DEBUG");
        Assert.assertEquals(16,  mm.twoNumbersSum(6, 10));
    }

    @Test(expected = AssertionError.class)
    public void testTwoNumbersSumNegative(){
        log.warn("Start processing testTwoNumbersSumNegative with WARN");
        Assert.assertEquals(17,  mm.twoNumbersSum(10, 6));
    }

    @Test
    public void testTwoNumbersMultiplyPositive(){
        log.info("Start processing testTwoNumbersMultiplyPositive with INFO");
        Assert.assertEquals(42,  mm.twoNumbersMultiply(7, 6));
    }

    @Test (expected = AssertionError.class)
    public void testTwoNumbersMultiplyNegative(){
        log.error("Start processing testTwoNumbersMultiplyNegative with ERROR");
        Assert.assertEquals(26,  mm.twoNumbersMultiply(7, 6));
    }

}
