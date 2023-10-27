// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.*;

// 2 motors
// neo and 775 falcon
// uses limit switches, 3 encoders
// motor moves both clockwise and counterclockwise
// has limit switches
// has hard stops
// need to hold the motor in a certain position
// no sensors
// no pneumatics

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// This is where we import outside libraries.
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Lift extends SubsystemBase {

    // Declare motors and sensors

  /** Creates a new ExampleSubsystem. */
  public Lift() {

    // Instantiate motors and sensors

    // Set up configurations for motors and sensors if needed
    // Note down important info: reversed motors, grouped motors
    // Neutral mode: brake
  }

  public double getLiftEncoder() {
    // return ();
  }

  public void moveLift(double speed) {
    // set motor
  }

    

  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
