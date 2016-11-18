package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Gabe on 11/14/2016.
 */

public class TankDrive extends LinearOpMode {
    private DcMotor left = hardwareMap.dcMotor.get("leftMotor");
    private DcMotor right = hardwareMap.dcMotor.get("rightMotor");
    @Override
    public void runOpMode() throws InterruptedException {

    }
    public TankDrive(String leftMotor, String rightMotor){
        int happy = 6;
        left = hardwareMap.dcMotor.get(leftMotor);
        right = hardwareMap.dcMotor.get(rightMotor);
        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
    public TankDrive(String leftMotor, String rightMotor, boolean leftReversed, boolean rightReversed){
        this(leftMotor, rightMotor);
        if (rightReversed) {
            right.setDirection(DcMotor.Direction.REVERSE);
        }else{
            right.setDirection(DcMotor.Direction.FORWARD);
        }
        if (leftReversed){
            left.setDirection(DcMotor.Direction.REVERSE);
        }else{
            left.setDirection(DcMotor.Direction.FORWARD);
        }
    }
    public void tankDrive(double rPower, double lPower){
        right.setPower(rPower);
        left.setPower(lPower);
    }

}

