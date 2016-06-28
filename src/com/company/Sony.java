package com.company;

import java.util.Scanner;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Sony extends Remote {

    private boolean unlocked;

    public Sony() {
        super(true, true);
        unlocked = false;

    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports only Sony brand TVs");
    }

    @Override
    public void startScan(String input) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please place your finger on the Sony remote to unlock...");
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
        System.out.println("Changing Sony channel up");
    }

    @Override
    public void channelDown() {
        runFingerPrintScanner();
        System.out.println("Changing Sony channel down");
    }

    @Override
    public void volumeUp() {
        runFingerPrintScanner();
        System.out.println("Changing Sony volume up");
    }

    @Override
    public void volumeDown() {
        runFingerPrintScanner();
        System.out.println("Changing Sony volume down");
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    private void runFingerPrintScanner(){
        if(!unlocked)
            startScan("Sony");
    }
}
