package technology;

public class Computer extends AbstractEntity{

    private String chargeCord;
    private boolean isOn;
    private String brand;

    public Computer(String brand, boolean isOn, String chargeCord) {
        setBrand(brand);
        setOn(isOn);
        setChargeCord(chargeCord);
    }

    public Computer() {
        chargeCord = "lightning cord";
        isOn = true;
        brand = "Apple";
    }

    public String getChargeCord() {
        return chargeCord;
    }

    public void setChargeCord(String chargeCord) {
        this.chargeCord = chargeCord;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void isCharging() {
        System.out.println("The " + brand + " device is charging.");
    }

    public String turnOff() {
        isOn = false;
        return "The " + brand + " device has been turned off.";

    }

    @Override
    public String toString() {
        return "ID: " + getId() + " The " + brand + " device comes with a " + chargeCord + " for charging.";
    }
}
