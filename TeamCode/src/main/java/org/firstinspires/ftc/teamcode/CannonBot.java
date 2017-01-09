package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by oxg0829 on 12/5/2016.
 */

public class CannonBot extends OpMode {
    JoyStick js = new JoyStick();
    TankDrive robot = new TankDrive();
    DcMotor loader;
    DcMotor leftTrigger;

    @Override
    public void loop() {
        double leftY = gamepad1.left_trigger;
    }

    @Override
    public void init() {
        robot.init(hardwareMap, "leftMotor", "rightMotor");
        js.init(gamepad1);
        boolean loaderPower = gamepad1.dpad_up;

        if (loaderPower == true) {
            loader.setPower(1);
        } else {
            loader.setPower(0);
        }

        if (leftTrigger < 0) {
            leftTrigger.setPower(-1);
        }
        else {
            leftTrigger.setPower(0);
        }
    }