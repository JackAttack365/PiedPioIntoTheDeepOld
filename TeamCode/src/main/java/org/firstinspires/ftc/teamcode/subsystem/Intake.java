package org.firstinspires.ftc.teamcode.subsystem;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Config;
import org.piedmontpioneers.intothedeep.IntakeColorSensor;

public class Intake extends SubSystem {
    DcMotor intake;

    IntakeColorSensor colorSensor;

    public Intake(Config config) {
        super(config);
    }

    public Intake(Config config, boolean isOneController) {
        super(config, isOneController);
    }

    @Override
    public void init() {
        intake = config.hardwareMap.get(DcMotor.class, "intake");
        colorSensor = new IntakeColorSensor(config.hardwareMap.get(ColorSensor.class, "colorSensor"));
    }

    @Override
    public void update() {

    }

    public class GetFromTape implements Action {
        private boolean initialized = false;

        @Override
        public boolean run(@NonNull TelemetryPacket packet) {
            if (!initialized) {
                initialized = true;
            }

            return true;
        }
    }

    public Action getFromTape() {
        return new GetFromTape();
    }
}
