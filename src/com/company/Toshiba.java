package com.company;

import java.util.Scanner;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Toshiba extends Remote {

    private boolean unlocked;

    public Toshiba() {
        super(true, true);
        unlocked = false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports only Toshiba brand TVs");
    }

    @Override
    public void startScan(String input) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please place your finger on the Toshiba remote to unlock...");
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
        System.out.println("Changing Toshiba channel up");
    }

    @Override
    public void channelDown() {
        runFingerPrintScanner();
        System.out.println("Changing Toshiba channel down");
    }

    @Override
    public void volumeUp() {
        runFingerPrintScanner();
        System.out.println("Changing Toshiba volume up");
    }

    @Override
    public void volumeDown() {
        runFingerPrintScanner();
        System.out.println("Changing Toshiba volume down");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    private void runFingerPrintScanner(){
        if(!unlocked)
            startScan("Toshiba");
    }
}
