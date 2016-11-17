package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
/**
 * Created by Gabe on 10/31/2016.
 */

public class JoyStick extends LinearOpMode{

        private float leftY;
        private float rightY;

        @Override
        public void runOpMode() throws InterruptedException {
          //      leftY = gamepad1.left_stick_y;
          //      rightY = gamepad1.right_trigger;
        }



public float leftY(){

        float leftYAxis = gamepad1.left_stick_y;
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
        return rightYAxis;
        }
}