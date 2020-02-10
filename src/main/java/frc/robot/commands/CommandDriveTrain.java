/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;



public class CommandDriveTrain extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField","PMD.SingularField"})
  private final DriveTrain m_subsystem;
  private final DoubleSupplier m_left;
  private final DoubleSupplier m_right;
  
  /**
   * Creates a new CommandDriveTrain.
   */
  

  public CommandDriveTrain(DoubleSupplier left, DoubleSupplier right, DriveTrain subdrivetrain) {
    m_subsystem = subdrivetrain;
    m_left = left;
    m_right = right;
    
    addRequirements(subdrivetrain);
  }


  



  
  






// Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.drive(m_left.getAsDouble(), m_right.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.drive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
