import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String expression = "10 m + 1 cm - 10 mm + 20 mm + 10 mm - 5 cm + 10 m - 500 cm";
        String[] array = expression.split(" ");
        double result = MetricDistanceCalculator.calculateExpression(expression);
        System.out.println("result = " + result + "mm");

    }
}
