package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Gabe on 11/14/2016.
 */

public class TankDrive {
    private DcMotor left /*= hardwareMap.dcMotor.get("leftMotor")*/;
    private DcMotor right /*= hardwareMap.dcMotor.get("rightMotor")*/;

    public TankDrive(){


    }

    public  void init(HardwareMap hwMap, String leftMotor, String rightMotor){
        HardwareMap hardwareMap = hwMap;

        left = hardwareMap.dcMotor.get(leftMotor);
        right = hardwareMap.dcMotor.get(rightMotor);
        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public double tankDrive(double rPower, double lPower){
        right.setPower(rPower);
        left.setPower(lPower);
        return lPower;
    }

}

