package com.company;

import java.util.Scanner;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Sharp extends Remote {

    private boolean unlocked = true;

    public Sharp(){
        super();
    }

    @Override
    public void supportsBrands() {
        System.out.println("Supports only Sharp brand TVs");
    }

    @Override
    public void startScan(String input) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please place your finger on the Sharp remote to unlock...");
        String userInput = s.nextLine();
        while(!userInput.equals(input)){
            System.out.println("Fingerprint not recognized");
            userInput = s.nextLine();
        }
    }

    @Override
    public void channelUp() {
        System.out.println("Changing Sharp channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Changing Sharp channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Changing Sharp volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Changing Sharp volume down");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public boolean isRechargeable() {
        return false;
    }
}
