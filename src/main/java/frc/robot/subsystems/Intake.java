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



public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */

  private CANSparkMax left1;
  private CANSparkMax right1;
  private CANEncoder left1Encoder;
  private CANEncoder left2Encoder;
  private CANEncoder right1Encoder;
  private CANEncoder right2Encoder;
  private DifferentialDrive intake;


  public Intake() {
  right1 = new CANSparkMax(Constants.INTAKE_RIGHTCANID, MotorType.kBrushless);
    right1.setIdleMode(CANSparkMax.IdleMode.kBrake);
      right1Encoder = right1.getEncoder();

    left1 = new CANSparkMax(Constants.INTAKE_LEFTCANID, MotorType.kBrushless);
      left1.setIdleMode(CANSparkMax.IdleMode.kBrake);
        left1Encoder = left1.getEncoder();

        intake = new DifferentialDrive(left1, right1);
      

  }


  public void IntakeOn(double intaketrigger){
    intake.arcadeDrive(intaketrigger * 0.75, 0);


  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }



}
