package frc.robot.subsystems;

import static frc.robot.Constants.IntakeConstants.DEVICE_ID_INTAKE;
import static frc.robot.Constants.IntakeConstants.INTAKE_SPEED;
import static frc.robot.Constants.IntakeConstants.OUTPUT_SPEED;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {

    private final CANSparkMax intake = new CANSparkMax(DEVICE_ID_INTAKE, MotorType.kBrushless);
    
    public IntakeSubsystem() {
        this.intake.restoreFactoryDefaults();

        this.intake.setIdleMode(IdleMode.kBrake);
    }

    public void intake() {
        this.intake.set(INTAKE_SPEED);
    }

    public void output() {
        this.intake.set(OUTPUT_SPEED);
    }

}
