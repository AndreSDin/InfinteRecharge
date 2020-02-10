/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  private CANSparkMax left1;
  private CANSparkMax left2;
  private CANSparkMax right1;
  private CANSparkMax right2;
  private CANEncoder left1Encoder;
  private CANEncoder left2Encoder;
  private CANEncoder right1Encoder;
  private CANEncoder right2Encoder;
  private SpeedController m_left;
  private SpeedController m_right;
  private DifferentialDrive drive;
  


  public DriveTrain() {
  right1 = new CANSparkMax(Constants.DRIVETRIAN_RIGHTCANID1, MotorType.kBrushless);
    right1.setIdleMode(CANSparkMax.IdleMode.kCoast);
      right1Encoder = right1.getEncoder();
        right1.setInverted(true);


  right2 = new CANSparkMax(Constants.DRIVETRIAN_RIGHTCANID2, MotorType.kBrushless);
    right2.follow(right1);
      right2Encoder = right2.getEncoder();

      
    

  left1 = new CANSparkMax(Constants.DRIVETRIAN_LEFTCANID1, MotorType.kBrushless);
    left1.setIdleMode(CANSparkMax.IdleMode.kCoast);
      left1Encoder = left1.getEncoder();
        left1.setInverted(true);

  left2 = new CANSparkMax(Constants.DRIVETRIAN_LEFTCANID2, MotorType.kBrushless);
    left2.follow(left1);
      left2Encoder = left2.getEncoder();

      m_right = new SpeedControllerGroup(right1, right2);
      m_left = new SpeedControllerGroup(left1, left2);

      

  drive = new DifferentialDrive(m_left, m_right);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double left, double right) {
    drive.arcadeDrive((left * 0.5) * -1, (right * 0.5) * -1, false);

  }

  public void drive(double left, double right, boolean isInverted) {
    if(isInverted == false){
    drive.arcadeDrive((left * 0.5) * -1, (right * 0.5) * -1, false);
    } else if(isInverted == true){
      drive.arcadeDrive((left * 0.5), (right * 0.5), false);

    }

  }

  

  

}
