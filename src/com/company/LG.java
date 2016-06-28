package com.company;

import java.util.Scanner;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class LG extends Remote {

    private boolean unlocked;

    public LG() {
        super(false, false);
        unlocked = false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports LG and Zenith brand TVs");
    }

    @Override
    public void startScan(String input) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please place your finger on the LG remote to unlock...");
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
        System.out.println("Changing LG channel up");
    }

    @Override
    public void channelDown() {
        runFingerPrintScanner();
        System.out.println("Changing LG channel down");
    }

    @Override
    public void volumeUp() {
        runFingerPrintScanner();
        System.out.println("Changing LG volume up");
    }

    @Override
    public void volumeDown() {
        runFingerPrintScanner();
        System.out.println("Changing LG volume down");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    private void runFingerPrintScanner(){
        if(!unlocked)
            startScan("Zenith");
    }
}
