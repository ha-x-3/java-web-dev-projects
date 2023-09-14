package technology;

public class Program {
    public static void main(String[] args) {
        Computer mac = new Computer();
        Computer dell = new Computer("Dell", true, "USB cord");
        System.out.println(mac.isOn());
        System.out.println(dell.getChargeCord());
        mac.isCharging();
        mac.turnOff();
        System.out.println(mac);

        Laptop macbook = new Laptop();
        macbook.closeLaptop();
        Laptop lenovo = new Laptop("Lenovo", true, "USB cord", true);
        System.out.println(lenovo);

        SmartPhone iphone = new SmartPhone();
        System.out.println(iphone);
        iphone.isRinging();
        SmartPhone android = new SmartPhone("Google", true, "Micro USB cord", "Android");
        System.out.println(android);
    }
}
