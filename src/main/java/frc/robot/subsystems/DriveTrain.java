/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.sensors.CANCoder;


public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  private WPI_TalonFX m_leftMaster;
  private WPI_TalonFX m_leftFollower;
  private WPI_TalonFX m_rightMaster;
  private WPI_TalonFX m_rightFollower;
  private CANCoder test;
  private SpeedController m_left;
  private SpeedController m_right;
  private DifferentialDrive drive;
  


  public DriveTrain() {
  m_leftMaster = new WPI_TalonFX(Constants.DRIVETRIAN_LEFTCANID1);
  
  //left2 = new TalonFX(Constants.DRIVETRIAN_LEFTCANID2);

  //m_left = new SpeedControllerGroup(left1, left2);

  m_rightMaster = new WPI_TalonFX(Constants.DRIVETRIAN_RIGHTCANID1);

  //right2 = new TalonFX(Constants.DRIVETRIAN_RIGHTCANID2);

  //m_right = new SpeedControllerGroup(right1, right2);
    

      

  drive = new DifferentialDrive(m_leftMaster, m_rightMaster);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double left, double right) {
    //drive.arcadeDrive((left * 0.5) * -1, (right * 0.5) * -1, false);
    


  }

  public void IsInverted(boolean Bool){
    


  }

  

}
