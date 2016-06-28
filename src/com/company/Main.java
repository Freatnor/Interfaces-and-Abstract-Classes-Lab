package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Remote> remotes = new ArrayList<>();
        remotes.add(new Samsung());
        remotes.add(new LG());
        remotes.add(new Panasonic());
        remotes.add(new Sony());
        remotes.add(new Toshiba());
        remotes.add(new Sharp());

        int i = 0;
        for (Remote remote : remotes) {
            remote.numberButtonPressed(i);
            remote.channelDown();
            remote.channelUp();


            i++;
        }
    }
}
