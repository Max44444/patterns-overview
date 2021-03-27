package com.company;

import com.company.command.*;

public class Main {

    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();

        DeviceButton onPressed = new DeviceButton(new TurnTVOn(newDevice));
        DeviceButton offPressed = new DeviceButton(new TurnTVOff(newDevice));
        DeviceButton volumeUpPressed = new DeviceButton(new TurnTVVolumeUp(newDevice));
        DeviceButton volumeDownPressed = new DeviceButton(new TurnTVVolumeDown(newDevice));

        onPressed.press();
        volumeUpPressed.press();
        volumeDownPressed.press();
        offPressed.press();
    }

}