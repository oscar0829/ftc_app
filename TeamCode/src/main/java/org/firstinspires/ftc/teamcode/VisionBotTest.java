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
    private JoyStick js = new JoyStick();
    private TankDrive robot = new TankDrive("leftMotor", "rightMotor");


    @Override
    public void init() {

    }

    @Override
    public void loop() {
        robot.tankDrive(js.leftY(), js.rightY());
    }


}
