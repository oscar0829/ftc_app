package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Gabe R. on 10/24/2016.
 */


@TeleOp(name="VisionBot")
public class VisionBotTest extends OpMode{
    DcMotor leftMotor;
    DcMotor rightMotor;
    float leftEnc;
    float rightEnc;
    double leftY;
    double rightY;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
            leftY = gamepad1.left_stick_y;
            rightY = gamepad1.right_trigger;
            rightY = rightY - .5;
            rightY = rightY * 2;
            double rightY2 = rightY * rightY;
            double leftY2 = leftY * leftY;
            if(leftY > 0){
                leftMotor.setPower(leftY2);
            }else{
                leftMotor.setPower(-leftY2);
            }
            if(rightY > 0){
                rightMotor.setPower(rightY2);
            }else {
                rightMotor.setPower(-rightY2);
            }
            telemetry.addData("leftY", leftY);
            telemetry.addData("rightY", rightY);
            leftEnc = leftMotor.getCurrentPosition() / 1440;
            rightEnc = rightMotor.getCurrentPosition() / 1440;
            telemetry.addData("LeftEnc: ", leftEnc);
            telemetry.addData("RightEnc: ", rightEnc);

    }


}
