package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

/**
 * Created by Gabe on 10/31/2016.
 */

public class JoyStick{

        private float leftY;
        private float rightY;
        private Gamepad gamepad1;


public void init(Gamepad gp){
    gamepad1 = gp;
}

public double leftY(){

        double leftYAxis = gamepad1.left_stick_y;
        if(leftYAxis<0){
        leftYAxis=leftYAxis*leftYAxis*-1;
        }else{
        leftYAxis=leftYAxis*leftYAxis;
        }
        return leftYAxis;
        }

public double rightY(){
        double rightYAxis = gamepad1.right_trigger;
        rightYAxis=rightYAxis-.5;
        rightYAxis=rightYAxis*2;
        if(rightYAxis<0){
        rightYAxis=rightYAxis*rightYAxis*-1;
        }else{
        rightYAxis=rightYAxis*rightYAxis;
        }
        rightYAxis = rightYAxis * -1;
        return rightYAxis;
        }
}