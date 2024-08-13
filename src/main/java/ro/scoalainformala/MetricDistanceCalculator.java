package ro.scoalainformala;

import java.util.HashMap;
import java.util.Map;

public class MetricDistanceCalculator {


    private static final Map<String, Integer> unitsConvertedToMm = new HashMap<>();

    static {
        unitsConvertedToMm.put("mm", 1);
        unitsConvertedToMm.put("cm", 10);
        unitsConvertedToMm.put("dm", 100);
        unitsConvertedToMm.put("m", 1_000);
        unitsConvertedToMm.put("km", 1_000_000);
    }

    public static double MmConverter(double value, String measureUnit) {
        return value * unitsConvertedToMm.get(measureUnit);
    }

    public static double calculateExpression(String expression) {
        String[] tokens = expression.split(" ");
        double total = Integer.parseInt(tokens[0]) * unitsConvertedToMm.get(tokens[1]);

        for (int i = 2; i <= tokens.length - 2; i += 3) {
            if (tokens[i].equals("+")) {
                total += Integer.parseInt(tokens[i + 1]) * unitsConvertedToMm.get(tokens[i + 2]);
            } else if (tokens[i].equals("-")) {
                total -= Integer.parseInt(tokens[i + 1]) * unitsConvertedToMm.get(tokens[i + 2]);
            }
        }

        return total;

    }

}
