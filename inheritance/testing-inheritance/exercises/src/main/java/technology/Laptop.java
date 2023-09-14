package technology;

public class Laptop extends Computer {

    private boolean hasTouchScreen;

    public Laptop(String brand, boolean isOn, String chargeCord, boolean hasTouchScreen) {
        super(brand, isOn, chargeCord);
        setHasTouchScreen(hasTouchScreen);
    }

    public Laptop() {
        hasTouchScreen = false;
    }

    public boolean doesHaveTouchScreen() {
        return hasTouchScreen;
    }

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public String closeLaptop() {
        return "The " + getBrand() + " laptop has been closed.";
    }
}
