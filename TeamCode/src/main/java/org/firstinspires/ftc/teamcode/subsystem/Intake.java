package org.firstinspires.ftc.teamcode.subsystem;

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
}
