import java.util.Random;

public class HealthMonitor {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Simulating 10 Health Readings:");

        for (int i = 0; i < 10; i++) {
            // Simulate heart rate (50-120 range)
            int heartRate = 50 + random.nextInt(71); // nextInt(71) gives 0-70

            // Simulate SpO2 (85-100 range)
            int spo2 = 85 + random.nextInt(16);   // nextInt(16) gives 0-15

            // Filter noisy readings
            if (heartRate > 110 || spo2 < 90) {
                System.out.println("Reading " + (i + 1) + ": Noisy - HeartRate=" + heartRate + ", SpO2=" + spo2);
            } else {
                System.out.println("Reading " + (i + 1) + ": HeartRate=" + heartRate + ", SpO2=" + spo2);
            }
        }

        System.out.println("Simulation complete.");
    }
}
