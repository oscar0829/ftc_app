package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.JoyStick;

/**
 * Created by Gabe R. on 10/24/2016.
 */


@TeleOp(name="VisionBot")
public class VisionBotTest extends OpMode{
    JoyStick js = new JoyStick();
    TankDrive robot = new TankDrive();


    @Override
    public void init() {
        robot.init(hardwareMap, "leftMotor", "rightMotor");
        js.init(gamepad1);
    }

    @Override
    public void loop() {
        telemetry.addData("Y: ", js.leftY());
       robot.tankDrive(js.rightY(), js.leftY());
    }


}
