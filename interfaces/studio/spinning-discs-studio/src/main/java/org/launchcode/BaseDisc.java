package org.launchcode;

public abstract class BaseDisc {

    private static int nextId = 1;
    private final int id;

    private String name;
    private String diskType;
    private int spinRate; //RPMs

    public BaseDisc(String name, String diskType, int spinRate) {
        this.id = nextId;
        this.name = name;
        this.diskType = diskType;
        this.spinRate = spinRate;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String asterisks = "*******";
        return newline + asterisks + " " + name + " " + asterisks + newline +
                "ID: " + id + newline +
                "Disk Type: " + diskType + newline +
                "Spin Rate: " + spinRate + "RPM." + newline;
    }

    void spinDisc() {
        String newline = System.lineSeparator();
        System.out.println(newline + "The " + diskType + " " + name +
                " is spinning at " + spinRate + "RPM.");
    }

}