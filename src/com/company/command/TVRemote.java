package com.company.command;

public class TVRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }

}
