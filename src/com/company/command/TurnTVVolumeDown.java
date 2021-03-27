package com.company.command;

public class TurnTVVolumeDown implements Command {

    ElectronicDevice theDevice;

    public TurnTVVolumeDown(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeDown();
    }

}
