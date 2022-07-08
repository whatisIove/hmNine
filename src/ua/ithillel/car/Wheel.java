package ua.ithillel.car;

public class Wheel {

    private String manufacturer;
    private String size;

    public Wheel(String manufacturer, String size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public void move() {
        System.out.println("The car is moving, the wheel are spinning.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }
}
