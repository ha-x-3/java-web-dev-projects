package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void throwDisc(){
        System.out.println("A DVD can be thrown up to 30 feet.");
    }

    @Override
    public void laser(){
        System.out.println("Most DVD lasers use a 405nm wavelength to read and write data.");
    }

    @Override
    public void storeData(){
        System.out.println("A DVD stores up to 17GB of data.");
    }
}
