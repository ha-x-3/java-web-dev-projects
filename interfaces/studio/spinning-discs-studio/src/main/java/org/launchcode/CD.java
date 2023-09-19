package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void throwDisc(){
        System.out.println("A CD can be thrown up to 10 feet.");
    }

    @Override
    public void laser(){
        System.out.println("Most CDs lasers use a 780nm wavelength to read and write data.");
    }

    @Override
    public void storeData(){
        System.out.println("A CD stores up to 700MB of data.");
    }
}
