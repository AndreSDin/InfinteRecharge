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



import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;


public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */

  private WPI_TalonFX left1;
  private WPI_TalonFX right1;
  private double leftSpeed = 0;
  private double rightSpeed = 0;
 
  
  
  private DifferentialDrive intake;


  public Intake() {
  right1 = new WPI_TalonFX(Constants.INTAKE_RIGHTCANID);
    
    

    left1 = new WPI_TalonFX(Constants.INTAKE_LEFTCANID);
      

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
