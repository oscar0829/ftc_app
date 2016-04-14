package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.DigitalChannelController;

/**
 * Created by Gabe on 4/4/2016.
 */
public class ioModule extends OpMode {
   DeviceInterfaceModule cdim;


    @Override
    public void init(){
        cdim = hardwareMap.deviceInterfaceModule.get("dim");
        cdim.setDigitalChannelMode(5, DigitalChannelController.Mode.OUTPUT);
        cdim.setDigitalChannelMode(4, DigitalChannelController.Mode.INPUT);
        cdim.setDigitalChannelState(5, true);
        cdim.setDigitalChannelState(5, false);

    }
    @Override
    public void loop(){
        cdim.getDigitalChannelState(5);
        cdim.getAnalogInputValue(4);

    }


}
