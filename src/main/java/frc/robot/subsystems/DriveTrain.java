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
import com.ctre.phoenix.motorcontrol.can.TalonFX;;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANEncoder;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  private TalonFX left1;
  private TalonFX left2;
  private TalonFX right1;
  private TalonFX right2;
  private CANEncoder left1Encoder;
  private CANEncoder left2Encoder;
  private CANEncoder right1Encoder;
  private CANEncoder right2Encoder;
  private SpeedController m_left;
  private SpeedController m_right;
  private DifferentialDrive drive;
  


  public DriveTrain() {
  left1 = new TalonFX(Constants.DRIVETRIAN_LEFTCANID1);
    

      

  drive = new DifferentialDrive(m_left, m_right);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double left, double right) {
    drive.arcadeDrive((left * 0.5) * -1, (right * 0.5) * -1, false);

  }

  public void IsInverted(boolean Bool){
    


  }

  

}
