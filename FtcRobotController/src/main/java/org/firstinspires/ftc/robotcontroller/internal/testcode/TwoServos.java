package org.firstinspires.ftc.robotcontroller.internal.testcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by lecundiff on 11/1/2016.
 */

public class TwoServos extends OpMode {
    final double LEFT_SECOND_POSITION = -0.5;
    final double LEFT_POSITION = -0.5;
    final double RIGHT_SECOND_POSITION = 0.5;
    final double RIGHT_POSITION = 0.5;


    Servo leftGripper;
    Servo rightGripper;

    @Override
    public void init() {
        leftGripper = hardwareMap.servo.get("left_hand");
        rightGripper = hardwareMap.servo.get("right_hand");


    }

    @Override
    public void loop() {
        if (gamepad1.dpad_left) {
            leftGripper.setPosition(LEFT_POSITION);
            rightGripper.setPosition(LEFT_SECOND_POSITION);
        }
        if (gamepad1.dpad_right) {
            leftGripper.setPosition(RIGHT_POSITION);
            rightGripper.setPosition(RIGHT_SECOND_POSITION);
        }


    }
}
