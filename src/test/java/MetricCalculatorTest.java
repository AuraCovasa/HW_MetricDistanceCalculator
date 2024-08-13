import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ro.scoalainformala.MetricDistanceCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetricCalculatorTest {
    @Test
    public void AdditionTest() {

        assertEquals(1001.0,
                MetricDistanceCalculator.calculateExpression("1 m + 1 mm"), 0.001);
        assertEquals(1005.0,
                MetricDistanceCalculator.calculateExpression("1 m + 5 mm"), 0.0001);

    }

    @Test
    public void SubtractionTest(){

        assertEquals(999.0,
                MetricDistanceCalculator.calculateExpression("1 m - 1 mm"),
                0.0001);
        assertEquals(995.0,MetricDistanceCalculator.calculateExpression("1 m - 5 mm"),
                0.00000001);
    }

    @Test
    public void CombinedTest(){

        assertEquals(1001.0,
                MetricDistanceCalculator.calculateExpression("1 m + 1 mm - 10 cm + 1 dm"),
                0.000001);

    }

@ParameterizedTest
@CsvSource({
   "1001.0,1 m + 1 mm",
    "999.0,1 m - 1 mm",
    "1050.0,1 m + 60 mm - 1 cm"

})
public void ParameterizedTest(double expected, String expression){
        assertEquals(expected, MetricDistanceCalculator.calculateExpression(expression));

}





}
