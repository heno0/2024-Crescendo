// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.JamalShooter;


public class ShooterCommand extends Command {
  private JamalShooter m_shooter;

   
  /** Creates a new ShooterCommand. */
  public ShooterCommand(JamalShooter shooter) {

    m_shooter = shooter;
    // Use addRequirements() here to declare subsystem dependencies.

    addRequirements(shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
    m_shooter.shooterSpeed(0.9);


  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
   // m_shooter.stop();

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
