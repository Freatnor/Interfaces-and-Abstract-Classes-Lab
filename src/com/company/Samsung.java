package com.company;

import java.util.Scanner;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Samsung extends Remote {

    private boolean unlocked;

    public Samsung() {
        super(false, true);
        unlocked = false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports Samsung brand TVs");
    }

    @Override
    public void startScan(String input) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please place your finger on the Samsung remote to unlock...");
        String userInput = s.nextLine();
        while(!userInput.equals(input)){
            System.out.println("Fingerprint not recognized");
            userInput = s.nextLine();
        }
        unlocked = true;
    }

    @Override
    public void channelUp() {
        runFingerPrintScanner();
        System.out.println("Changing Samsing channel up");
    }

    @Override
    public void channelDown() {
        runFingerPrintScanner();
        System.out.println("Changing Samsung channel down");
    }

    @Override
    public void volumeUp() {
        runFingerPrintScanner();
        System.out.println("Turning Samsung volume up");
    }

    @Override
    public void volumeDown() {
        runFingerPrintScanner();
        System.out.println("Turning Samsung volume down");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    private void runFingerPrintScanner(){
        if(!unlocked)
            startScan("Samsung");
    }
}
