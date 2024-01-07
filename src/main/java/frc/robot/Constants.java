package frc.robot;

public class Constants {
    
    public static final class DrivetrainConstants {

        public static final int DEVICE_ID_LEFT_LEADER = 0;
        public static final int DEVICE_ID_LEFT_FOLLOWER = 1;
        public static final int DEVICE_ID_RIGHT_LEADER = 2;
        public static final int DEVICE_ID_RIGHT_FOLLOWER = 3;

    }

    public static final class IntakeConstants {

        public static final int DEVICE_ID_INTAKE = 4;

        public static final double INTAKE_SPEED = 1.0;
        public static final double OUTPUT_SPEED = -1.0;

    }

    public static final class FlywheelConstants {

        public static final int DEVICE_ID_LEFT_FLYWHEEL = 5;
        public static final int DEVICE_ID_RIGHT_FLYWHEEL = 6;

        public static final double LEFT_SPEED = 1.0;
        public static final double RIGHT_SPEED = 1.0;

    }

}
