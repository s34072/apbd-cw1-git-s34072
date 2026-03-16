public class DistanceCalculator {
    public static double calculateDistance(double[] point1, double[] point2) {

        if (point1 == null || point2 == null) {
            throw new IllegalArgumentException("Punkty nie mogą być nullem.");
        }

        if (point1.length != point2.length) {
            throw new IllegalArgumentException("Punkty muszą mieć tyle samo wymiarów.");
        }
        double sum = 0.0;

        for (int i = 0; i < point1.length; i++) {
            double difference = point1[i] - point2[i];
            sum += Math.pow(difference, 2);
        }

        return Math.sqrt(sum);
    }

    public static double CalculateAverage(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return (double) sum / values.length;
    }
}
