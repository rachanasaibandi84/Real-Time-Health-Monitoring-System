
import java.util.Random;

public class AnamolyDetection {

    public static void main(String[] args) {
        Random random = new Random();

        // Simulating 10 health readings
        System.out.println("Simulating 10 Health Readings:");

        // Loop to generate multiple readings
        for (int i = 0; i < 10; i++) {
            // Simulate heart rate (50-120 range)
            int heartRate = 50 + random.nextInt(71); // 0 to 70 added to 50

            // Simulate SpO2 (85-100 range)
            int spo2 = 85 + random.nextInt(16);   // 0 to 15 added to 85

            // Create HealthReading object
            HealthReading reading = new HealthReading(heartRate, spo2, "");

            // Filter noisy readings and add specific alerts
            if (heartRate > 110 && spo2 >= 90) {
                reading = new HealthReading(heartRate, spo2, "High Heart Rate");
                System.out.println("Reading " + (i + 1) + ": High Heart Rate Alert - HeartRate=" + heartRate + ", SpO2=" + spo2);
            } else if (spo2 < 90) {
                reading = new HealthReading(heartRate, spo2, "Low SpO2 Alert");
                System.out.println("Reading " + (i + 1) + ": Low SpO2 Alert - HeartRate=" + heartRate + ", SpO2=" + spo2);
            } else {
                reading = new HealthReading(heartRate, spo2, "Normal");
                System.out.println("Reading " + (i + 1) + ": HeartRate=" + heartRate + ", SpO2=" + spo2);
            }

            // Optionally, display the status (you can call display method if needed)
            reading.display();
        }

        System.out.println("Simulation complete.");
    }
}
