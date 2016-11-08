package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by lecundiff on 10/7/2016.
 */
@TeleOp(name = "TestServo")
public class TestServo extends OpMode {
    final double LEFT_OPEN_POSITION = 1.0;
    final double LEFT_CLOSED_POSITION = 0.0;
    final double RIGHT_OPEN_POSITION = 0.5;
    final double RIGHT_CLOSED_POSITION = 0.0;

    Servo leftGripper;
    Servo rightGripper;

    @Override
    public void init() {


        leftGripper = hardwareMap.servo.get("left_hand");
        rightGripper = hardwareMap.servo.get("right_hand");


    }


    @Override
    public void loop() {
        if (gamepad1.x) {
            rightGripper.setPosition(RIGHT_OPEN_POSITION);
        }
        if (gamepad1.a) {
            leftGripper.setPosition(LEFT_OPEN_POSITION);

        }

        if (gamepad1.y) {
            leftGripper.setPosition(LEFT_CLOSED_POSITION);
            rightGripper.setPosition(RIGHT_CLOSED_POSITION);
        }

    }

}