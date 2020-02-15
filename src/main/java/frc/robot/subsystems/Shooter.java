/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMaxLowLevel;

public class Shooter extends SubsystemBase {
  /**
   * Creates a new Shooter.
   */
private CANSparkMax m_turret;
private CANEncoder e_turret;

  
  public Shooter() {

    m_turret = new CANSparkMax(Constants.SHOOTER_BASECANID, MotorType.kBrushless);
      m_turret.setIdleMode(CANSparkMax.IdleMode.kCoast);
        e_turret = m_turret.getEncoder();
    
    }
    DifferentialDrive turnbase = new DifferentialDrive(m_turret, null);

  public void TurnBase(double trigger) {
     
    turnbase.arcadeDrive(trigger, 0);

    
  }






  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
