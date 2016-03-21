package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by bitchell on 2/5/2016.
 */
public class ImTryingBro extends OpMode{

    DcMotor rightMotor, leftMotor, rakt, wrinch;
    int COUNTS = 21;

    @Override
    public void init()
    {
        //get references to the motors from the hardware map
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        rakt = hardwareMap.dcMotor.get("rack");
        wrinch = hardwareMap.dcMotor.get("winch");


        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        rakt.setDirection(DcMotor.Direction.REVERSE);


        //Reset telemetry number.
        leftMotor.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
        rightMotor.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
        rakt.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
        wrinch.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    }

    @Override
    public void start()
    {
        //Do telemetry numbers.
        leftMotor.setTargetPosition((int) COUNTS);
        rakt.setTargetPosition((int) COUNTS);
        wrinch.setTargetPosition((int) COUNTS);
        rightMotor.setTargetPosition((int) COUNTS);

        leftMotor.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);
        rightMotor.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);
        wrinch.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);
        rakt.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);

        leftMotor.setPower(0.5);
        rakt.setPower(0.5);
        rightMotor.setPower(0.5);
        wrinch.setPower(0.5);
    }

    @Override
    public void loop()
    {
        telemetry.addData("Motor Target", COUNTS);
        telemetry.addData("Left Position", leftMotor.getCurrentPosition());
        telemetry.addData("Right Position", rightMotor.getCurrentPosition());
        telemetry.addData("Rack Position", rakt.getCurrentPosition());
        telemetry.addData("Winch Position", wrinch.getCurrentPosition());
    }
}
