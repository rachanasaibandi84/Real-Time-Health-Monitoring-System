public class HealthReading {
    private int heartRate;
    private int spo2;
    private String status;

    public HealthReading(int heartRate, int spo2, String status) {
        this.heartRate = heartRate;
        this.spo2 = spo2;
        this.status = status;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getSpo2() {
        return spo2;
    }

    public String getStatus() {
        return status;
    }

    public void display() {
        System.out.println("HeartRate=" + heartRate + ", SpO2=" + spo2 + ", Status = " + status);
    }

    public static void main(String[] args) {
        HealthReading reading1 = new HealthReading(75, 98, "Normal");
        reading1.display();

        HealthReading reading2 = new HealthReading(115, 92, "Potentially High Heart Rate");
        reading2.display();

        HealthReading reading3 = new HealthReading(60, 88, "Potentially Low SpO2");
        reading3.display();
    }
}
