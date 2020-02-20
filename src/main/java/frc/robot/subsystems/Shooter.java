/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import com.revrobotics.CANEncoder;
//import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

//import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import com.revrobotics.CANSparkMaxLowLevel;

public class Shooter extends SubsystemBase {
  /**
   * Creates a new Shooter.
   */
//private CANSparkMax m_turret;
private WPI_TalonSRX m_turret;
//private CANEncoder turretencoder;
private DifferentialDrive turnbase;
private SpeedController spdTurnBase;

  
  public Shooter() {

    //m_turret = new CANSparkMax(Constants.SHOOTER_BASECANID, MotorType.kBrushless);
      //m_turret.setIdleMode(CANSparkMax.IdleMode.kCoast);
        //turretencoder = m_turret.getEncoder();
      m_turret = new WPI_TalonSRX(Constants.SHOOTER_BASECANID);
      //turnbase = new DifferentialDrive(m_turret, null);
      spdTurnBase = new SpeedControllerGroup(m_turret);



    }
    

    public void TurnBase(double trigger) {
     
    spdTurnBase.set(trigger * 0.50);

    
  }






  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
