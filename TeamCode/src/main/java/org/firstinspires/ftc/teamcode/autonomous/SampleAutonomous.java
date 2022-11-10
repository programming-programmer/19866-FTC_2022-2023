package org.firstinspires.ftc.teamcode.autonomous;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.RobotHardware;
import org.firstinspires.ftc.teamcode.MyPIDController;

@Config
@TeleOp(name = "PID Test for Auto", group = "Linear Opmode")
public class SampleAutonomous extends LinearOpMode {

    RobotHardware robot = new RobotHardware(this);
    MyPIDController PIDControl = new MyPIDController();

    @Override public void runOpMode() {
        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = dashboard.getTelemetry();

        robot.init();
        waitForStart();

        while (opModeIsActive()) {
//            double backLeftPower = PIDControl.PIDControl(5, robot.backLeft.getCurrentPosition());
//            double backRightPower = PIDControl.PIDControl(5, robot.backRight.getCurrentPosition());
//            double frontLeftPower = PIDControl.PIDControl(5, robot.frontLeft.getCurrentPosition());
//            double frontRightPower = PIDControl.PIDControl(5, robot.frontRight.getCurrentPosition());
//
//            robot.frontLeft.setPower(frontLeftPower);
//            robot.backRight.setPower(backRightPower);
//            robot.frontRight.setPower(frontRightPower);
//            robot.backLeft.setPower(backLeftPower);
//
//            sleep(2000);

            telemetry.addData("Current Position of backLeft motor", robot.backLeft.getCurrentPosition());
            telemetry.addData("Current Position of backRight motor", robot.backRight.getCurrentPosition());
            telemetry.addData("Current Position of FrontRight motor", robot.frontRight.getCurrentPosition());
            telemetry.addData("Current Position of FrontLeft motor", robot.frontLeft.getCurrentPosition());

            robot.frontLeft.setPower(0);
            robot.backRight.setPower(0);
            robot.frontRight.setPower(0);
            robot.backLeft.setPower(0);
        }
    }
}


