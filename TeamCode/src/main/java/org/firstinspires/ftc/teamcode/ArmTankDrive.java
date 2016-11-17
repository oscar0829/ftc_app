package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;


/**
 * Created by oxg0829 on 11/14/2016.
 */

public class ArmTankDrive {
    DcMotor rightMotor ;
            DcMotor leftMotor;
    public DcMotor leftArm;
    public Object hardwareMap;

    {}
public void init() {
    leftMotor = hardwareMap.DcMotor.get("left_motor");
    rightMotor = hardwareMap.DcMotor.get("right_motor");
    rightMotor.setDirection(DcMotor.Direction.REVERSE);

    }


public void loop(Gamepad gamepad1){
    float leftY = -gamepad1.left_stick_y;
    float rightY = -gamepad1.left_stick_y;

    leftMotor.setPower(leftY);
    rightMotor.setPower(rightY);
    }


public void loop () {
    if (gamepad1.y) {
        leftArm.setPower(0.1);
    } else {
        leftArm.setPower(0.0);
    }if (gamepad1.b) {
        leftArm.setPower(-0.1);
    }
}

public void setupArm (String name){
        leftArm = hardwareMap.DcMotor.get("left_arm");
        }

    public class DcMotor {



    }
}