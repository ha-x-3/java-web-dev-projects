package org.launchcode;

public abstract class BaseDisc {

    private String name;
    private int capacity;
    private String contents;
    private String discType;

    public BaseDisc(String name, int capacity, String contents, String discType) {
        setName(name);
        setCapacity(capacity);
        setContents(contents);
        setDiscType(discType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String reportInfo() {
        String newline = System.lineSeparator();
        return newline +
                "Name: " + getName() + newline +
                "Storage Capacity: " + getCapacity() + "MB" + newline +
                "Contents: " + getContents() + newline +
                "Disk Type: " + getDiscType() + newline;
    }
}