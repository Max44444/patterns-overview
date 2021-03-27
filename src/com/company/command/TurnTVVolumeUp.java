package com.company.command;

public class TurnTVVolumeUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVVolumeUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

}
