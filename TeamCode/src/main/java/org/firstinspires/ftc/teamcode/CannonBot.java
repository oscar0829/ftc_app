package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Hardware;

/**
 * Created by oxg0829 on 12/5/2016.
 */


@TeleOp(name="2017 Teleop main")
public class CannonBot extends OpMode {

    JoyStick js = new JoyStick();
    DcMotor loader;
    DcMotor launcher;
    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        launcher = hardwareMap.dcMotor.get("launcher");
        loader = hardwareMap.dcMotor.get("loader");
        js.init(gamepad1);

    }
    @Override
    public void loop() {
        if (gamepad1.left_bumper) {
            loader.setPower(1);
        } else {
            loader.setPower(0);
        }

        if (gamepad1.right_bumper) {
            launcher.setPower(-1);
        } else {
            launcher.setPower(0);
        }

        leftMotor.setPower(js.leftY(true));
        rightMotor.setPower(js.rightY(true));
    }

}