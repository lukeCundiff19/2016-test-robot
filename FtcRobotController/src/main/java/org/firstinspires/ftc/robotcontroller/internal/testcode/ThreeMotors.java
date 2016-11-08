package org.firstinspires.ftc.robotcontroller.internal.testcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by lecundiff on 11/8/2016.
 */

public class ThreeMotors extends OpMode {
    final double LEFT_OPEN_POSITION = 0.0;
    final double LEFT_CLOSED_POSITION = 0.5;
    final double RIGHT_OPEN_POSITION = 0.0;
    final double RIGHT_CLOSED_POSITION = 0.5;


    Servo leftGripper;
    Servo rightGripper;
    DcMotor dc_drive_left;
    DcMotor dc_drive_right;
    DcMotor dc_drive_middle;

    @Override
    public void init() {


        leftGripper = hardwareMap.servo.get("left_hand");
        rightGripper = hardwareMap.servo.get("right_hand");


        dc_drive_middle = hardwareMap.dcMotor.get("middle_hand");
        dc_drive_left = hardwareMap.dcMotor.get("drive_left");
        dc_drive_right = hardwareMap.dcMotor.get("drive_right");
        dc_drive_right.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;


        dc_drive_left.setPower(leftY);
        dc_drive_right.setPower(rightY);


        if (gamepad1.dpad_up) {
            dc_drive_middle.setPower(0.5);


        }
        if (gamepad1.dpad_down) {
            dc_drive_middle.setPower(-0.5);
        }
        if (gamepad1.dpad_left) {
            dc_drive_middle.setPower(0);
        }
        if (gamepad1.dpad_right) {
            dc_drive_middle.setPower(0);
        }
        if (gamepad1.x) {
            leftGripper.setPosition(LEFT_OPEN_POSITION);
            rightGripper.setPosition(RIGHT_OPEN_POSITION);
        }
        if (gamepad1.x) {
            leftGripper.setPosition(LEFT_CLOSED_POSITION);
            rightGripper.setPosition(RIGHT_CLOSED_POSITION);
        }
    }
}
}