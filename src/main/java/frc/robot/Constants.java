// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.swervedrivespecialties.swervelib.Mk4SwerveModuleHelper;
import com.swervedrivespecialties.swervelib.Mk4SwerveModuleHelper.GearRatio;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class kSwerveDrivetrain {
        public static final GearRatio GEAR_RATIO = Mk4SwerveModuleHelper.GearRatio.L1;

        public static final class FRONT_RIGHT {
            public static final int DRIVE_MOTOR_ID = -1;
            public static final int STEER_MOTOR_ID = -1;
            public static final int STEER_ENCODER_ID = -1;
            public static final double STEER_ENCODER_OFFSET = 0;
        }

        public static final class FRONT_LEFT {
            public static final int DRIVE_MOTOR_ID = -1;
            public static final int STEER_MOTOR_ID = -1;
            public static final int STEER_ENCODER_ID = -1;
            public static final double STEER_ENCODER_OFFSET = 0;
        }

        public static final class BACK_RIGHT {
            public static final int DRIVE_MOTOR_ID = -1;
            public static final int STEER_MOTOR_ID = -1;
            public static final int STEER_ENCODER_ID = -1;
            public static final double STEER_ENCODER_OFFSET = 0;
        }

        public static final class BACK_LEFT {
            public static final int DRIVE_MOTOR_ID = -1;
            public static final int STEER_MOTOR_ID = -1;
            public static final int STEER_ENCODER_ID = -1;
            public static final double STEER_ENCODER_OFFSET = 0;
        }
    }
}
