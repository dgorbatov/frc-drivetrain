package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.kSwerveDrivetrain;

import com.swervedrivespecialties.swervelib.Mk4SwerveModuleHelper;
import com.swervedrivespecialties.swervelib.SwerveModule;

public class SwerveDrivetrain extends SubsystemBase {
  private final SwerveModule frontLeft;
  private final SwerveModule frontRight;
  private final SwerveModule backLeft;
  private final SwerveModule backRight;

  public SwerveDrivetrain() {
    frontLeft = Mk4SwerveModuleHelper.createFalcon500(
      kSwerveDrivetrain.GEAR_RATIO, 
      kSwerveDrivetrain.FRONT_LEFT.DRIVE_MOTOR_ID, 
      kSwerveDrivetrain.FRONT_LEFT.STEER_MOTOR_ID, 
      kSwerveDrivetrain.FRONT_LEFT.STEER_ENCODER_ID, 
      kSwerveDrivetrain.FRONT_LEFT.STEER_ENCODER_OFFSET
    );

    frontRight = Mk4SwerveModuleHelper.createFalcon500(
      kSwerveDrivetrain.GEAR_RATIO, 
      kSwerveDrivetrain.FRONT_RIGHT.DRIVE_MOTOR_ID, 
      kSwerveDrivetrain.FRONT_RIGHT.STEER_MOTOR_ID, 
      kSwerveDrivetrain.FRONT_RIGHT.STEER_ENCODER_ID, 
      kSwerveDrivetrain.FRONT_RIGHT.STEER_ENCODER_OFFSET
    );

    backLeft = Mk4SwerveModuleHelper.createFalcon500(
      kSwerveDrivetrain.GEAR_RATIO, 
      kSwerveDrivetrain.BACK_LEFT.DRIVE_MOTOR_ID, 
      kSwerveDrivetrain.BACK_LEFT.STEER_MOTOR_ID, 
      kSwerveDrivetrain.BACK_LEFT.STEER_ENCODER_ID, 
      kSwerveDrivetrain.BACK_LEFT.STEER_ENCODER_OFFSET
    );

    backRight = Mk4SwerveModuleHelper.createFalcon500(
      kSwerveDrivetrain.GEAR_RATIO, 
      kSwerveDrivetrain.BACK_RIGHT.DRIVE_MOTOR_ID, 
      kSwerveDrivetrain.BACK_RIGHT.STEER_MOTOR_ID, 
      kSwerveDrivetrain.BACK_RIGHT.STEER_ENCODER_ID, 
      kSwerveDrivetrain.BACK_RIGHT.STEER_ENCODER_OFFSET
    );
  }


}