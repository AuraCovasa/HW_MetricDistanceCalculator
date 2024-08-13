package ro.scoalainformala;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String expression = "1 m + 1 mm - 10 cm + 1 dm";
        String[] array = expression.split(" ");
        System.out.println(MetricDistanceCalculator.calculateExpression(expression));

        }
    }
