package frc.robot.subsystems;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveDrivetrain extends SubsystemBase {
  // all locations relative to robot center
  Translation2d frontLeftLocation;
  Translation2d frontRightLocation;
  Translation2d backLeftLocation;
  Translation2d backRightLocation;

  SwerveDriveKinematics kinematics;


  public SwerveDrivetrain() {
    frontLeftLocation = new Translation2d();
    frontRightLocation = new Translation2d();
    backLeftLocation = new Translation2d();
    backRightLocation = new Translation2d();

    kinematics = new SwerveDriveKinematics(
      frontLeftLocation,
      frontRightLocation,
      backLeftLocation,
      backRightLocation
    );
  }


}