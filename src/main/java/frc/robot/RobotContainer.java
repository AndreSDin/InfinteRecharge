/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import frc.robot.commands.CommandDriveTrain;
import frc.robot.commands.IntakeOn;
import frc.robot.commands.ShooterTurret;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.commands.CommandDriveTrain;;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here..
  private final DriveTrain m_drivetrain = new DriveTrain();
  private final Intake m_intake = new Intake();
  private final Shooter m_shooter = new Shooter();  
  //Controller Definitions
  private final XboxController m_driver = new XboxController(0);
  private final XboxController m_operator = new XboxController(1);
 
  


  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    m_drivetrain.setDefaultCommand(new CommandDriveTrain(() -> m_driver.getRawAxis(1), 
    () -> m_driver.getRawAxis(4), m_drivetrain));

<<<<<<< HEAD
    m_intake.setDefaultCommand(new IntakeOn(() -> m_driver.getTriggerAxis(Hand.kLeft), m_intake));
=======
    m_intake.setDefaultCommand(new IntakeOn(() -> m_operator.getTriggerAxis(Hand.kLeft), m_intake));
>>>>>>> parent of 7e142e1... Removed some suff

    m_shooter.setDefaultCommand(new ShooterTurret(() -> m_operator.getTriggerAxis(Hand.kRight), m_shooter));
    

    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    final POVButton dpadUp = new POVButton(m_driver, 0);
    final POVButton dpadDown = new POVButton(m_driver, 180);


    //dpadUp.whenPressed(command)
    
    
     


  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return null;
    // An ExampleCommand will run in autonomous
    
  }
}
