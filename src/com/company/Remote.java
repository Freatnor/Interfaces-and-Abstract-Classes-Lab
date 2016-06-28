package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.WarnCallback;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public abstract class Remote implements Universal, FingerPrintScanner, WaterProof, Rechargeable{
    private boolean mNeedsBatteries;
    private boolean mSupportsUSB;

    public Remote(boolean needsBatteries, boolean supportsUSB) {
        mNeedsBatteries = needsBatteries;
        mSupportsUSB = supportsUSB;
    }

    public Remote() {
        mNeedsBatteries = true;
        mSupportsUSB = false;
    }

    public boolean isNeedsBatteries() {
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        mNeedsBatteries = needsBatteries;
    }

    public boolean isSupportsUSB() {
        return mSupportsUSB;
    }

    public void setSupportsUSB(boolean supportsUSB) {
        mSupportsUSB = supportsUSB;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public static void powerButtonPressed(){
        System.out.println("Power button pressed.");
    }

    //How do I get the runFingerPrintScan() method to run before this is called too? Is it sensible to override just to add that functionality?
    public void numberButtonPressed(int button){
        System.out.println("Changing channel to " + button);
    }
}
