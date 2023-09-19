package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("LaunchCode's Best Hits", 200, ".mp3", "CD-R");
        DVD myDVD = new DVD("LaunchCode's Blooper Reel", 1500, ".wav", "DVD-RW");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myDVD.spinDisc();
        myCD.spinDisc();

        myDVD.throwDisc();
        myCD.throwDisc();

        myDVD.laser();
        myCD.laser();

        myDVD.storeData();
        myCD.storeData();

        System.out.println(myDVD.reportInfo());
        System.out.println(myCD.reportInfo());

    }
}