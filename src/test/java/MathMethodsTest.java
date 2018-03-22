import groovy.util.logging.Log4j;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


@Log4j
public class MathMethodsTest {

    private static final Logger log = Logger.getLogger(MathMethodsTest.class);

    private MathMethods mm = new MathMethods();

    @Test
    public void testTwoNumbersSumPositive(){
        log.debug("Start processing");
        Assert.assertEquals(16,  mm.twoNumbersSum(6, 10));
    }

    @Test(expected = AssertionError.class)
    public void testTwoNumbersSumNegative(){
        Assert.assertEquals(17,  mm.twoNumbersSum(10, 6));
    }

    @Test
    public void testTwoNumbersMultiplyPositive(){
        Assert.assertEquals(42,  mm.twoNumbersMultiply(7, 6));
    }

    @Test(expected = AssertionError.class)
    public void testTwoNumbersMultiplyNegative(){
        Assert.assertEquals(26,  mm.twoNumbersMultiply(7, 6));
    }


}
