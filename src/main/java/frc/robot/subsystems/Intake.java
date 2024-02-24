

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.ArmMotor;

public class Intake extends SubsystemBase {

  /** Creates a new Intake. */
    Spark M1;
    boolean bottomSwitch;
    ArmMotor arm;

  public Intake() {
    M1 = new Spark(2);
    arm = new ArmMotor();

  }
  public void setspeed(double speed) {
    bottomSwitch = arm.getBottomLimitSwitch();
    if(bottomSwitch == false){
      M1.set(speed);
    }
    M1.set(speed/2);
  }
  public void stop() {
    M1.set(0);
    
  }

 
}
