package technology;

public class SmartPhone extends Computer {

    private String operatingSystem;

    public SmartPhone(String brand, boolean isOn, String chargeCord, String operatingSystem) {
        super(brand, isOn, chargeCord);
        setOperatingSystem(operatingSystem);
    }

    public SmartPhone() {
        operatingSystem = "iOS";
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String isRinging() {
        return "The " + getBrand() + " smartphone is ringing!";
    }
}
