package frc.robot.subsystems;

import static frc.robot.Constants.DrivetrainConstants.DEVICE_ID_LEFT_LEADER;
import static frc.robot.Constants.DrivetrainConstants.DEVICE_ID_LEFT_FOLLOWER;
import static frc.robot.Constants.DrivetrainConstants.DEVICE_ID_RIGHT_LEADER;
import static frc.robot.Constants.DrivetrainConstants.DEVICE_ID_RIGHT_FOLLOWER;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {

    private final DifferentialDrive differentialDrive;

    public DrivetrainSubsystem() {
        CANSparkMax leftLeader = new CANSparkMax(DEVICE_ID_LEFT_LEADER, MotorType.kBrushless);
        CANSparkMax leftFollower = new CANSparkMax(DEVICE_ID_LEFT_FOLLOWER, MotorType.kBrushless);
        CANSparkMax rightLeader = new CANSparkMax(DEVICE_ID_RIGHT_LEADER, MotorType.kBrushless);
        CANSparkMax rightFollower = new CANSparkMax(DEVICE_ID_RIGHT_FOLLOWER, MotorType.kBrushless);

        leftLeader.restoreFactoryDefaults();
        leftFollower.restoreFactoryDefaults();
        rightLeader.restoreFactoryDefaults();
        rightFollower.restoreFactoryDefaults();

        leftLeader.setIdleMode(IdleMode.kBrake);
        leftFollower.setIdleMode(IdleMode.kBrake);
        rightLeader.setIdleMode(IdleMode.kBrake);
        rightFollower.setIdleMode(IdleMode.kBrake);

        leftFollower.follow(leftLeader);
        rightFollower.follow(rightLeader);

        this.differentialDrive = new DifferentialDrive(leftLeader, rightLeader);
    }

    public void arcadeDrive(double speed, double rotation) {
        this.arcadeDrive(speed, rotation, false);
    }

    public void arcadeDrive(double speed, double rotation, boolean squareInputs) {
        this.differentialDrive.arcadeDrive(speed, rotation, squareInputs);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        this.tankDrive(leftSpeed, rightSpeed, false);
    }

    public void tankDrive(double leftSpeed, double rightSpeed, boolean squareInputs) {
        this.differentialDrive.tankDrive(leftSpeed, rightSpeed, squareInputs);
    }

}
