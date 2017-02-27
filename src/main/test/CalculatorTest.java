import org.junit.*;

public class CalculatorTest {

    @Test
    public void test() {

        Calculator calculator = new Calculator();

        Assert.assertEquals(0, calculator.suma());
    }

}
