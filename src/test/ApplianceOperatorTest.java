package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.BlenderOffCommand;
import commands.BlenderOnCommand;
import commands.BlenderSetSpeedCommand;
import commands.BreadSlicerOffCommand;
import commands.BreadSlicerOnCommand;
import commands.BreadSlicerSliceCommand;
import commands.MixerOffCommand;
import commands.MixerOnCommand;
import commands.MixerSetSpeedCommand;
import commands.OvenOffCommand;
import commands.OvenOnCommand;
import commands.OvenSetTemperatureCommand;
import commands.OvenSetTimerCommand;
import commands.OvenUndoCommand;
import commands.RefridgeratorOffCommand;
import commands.RefridgeratorOnCommand;
import commands.RefridgeratorSetTemperatureCommand;
import invoker.ApplianceOperator;
import request.Blender;
import request.BreadSlicer;
import request.Mixer;
import request.Oven;
import request.Refridgerator;

// Test program using JUnit

public class ApplianceOperatorTest {
	
	private static ApplianceOperator operator;
	
	// runs before the first @Test begins
	@BeforeAll
	public static void setUp() {
		operator = new ApplianceOperator();
	}

	// Runs after the last test finishes
	@AfterAll
	public static void tearDown() {
		operator = null;
	}
	
	// testing the blender
	@Test
	public void testBlender() {
		System.out.println("\nTesting blender....");
		Blender blender = new Blender();
		BlenderOnCommand command = new BlenderOnCommand(blender);
		operator.setCommand(command);
		operator.performAction();
		BlenderSetSpeedCommand command2 = new BlenderSetSpeedCommand(blender, 2);
		operator.setCommand(command2);
		operator.performAction();
		BlenderOffCommand command3 = new BlenderOffCommand(blender);
		operator.setCommand(command3);
		operator.performAction();
		System.out.println("Finished testing blender....\n");
	}
	
	// testing the bread slicer
	@Test
	public void testBreadSlicer() {
		System.out.println("\nTesting Bread Slicer....");
		BreadSlicer slicer = new BreadSlicer();
		BreadSlicerOnCommand command = new BreadSlicerOnCommand(slicer);
		operator.setCommand(command);
		operator.performAction();
		BreadSlicerSliceCommand command2 = new BreadSlicerSliceCommand(slicer);
		operator.setCommand(command2);
		operator.performAction();
		BreadSlicerOffCommand command3 = new BreadSlicerOffCommand(slicer);
		operator.setCommand(command3);
		operator.performAction();
		System.out.println("Finished testing bread slicer....\n");
	}
	
	// testing the mixer
	@Test
	public void testMixer() {
		System.out.println("\nTesting mixer....");
		Mixer mixer = new Mixer();
		MixerOnCommand command = new MixerOnCommand(mixer);
		operator.setCommand(command);
		operator.performAction();
		MixerSetSpeedCommand command2 = new MixerSetSpeedCommand(mixer, 3);
		operator.setCommand(command2);
		operator.performAction();
		MixerOffCommand command3 = new MixerOffCommand(mixer);
		operator.setCommand(command3);
		operator.performAction();
		System.out.println("Finished testing mixer....\n");
	}
	
	// testing the oven
	// the oven uses undo so that it can revert to its previous temperature
	@Test 
	public void testOven() {
		System.out.println("\nTesting Oven....");
		Oven oven = new Oven();
		OvenOnCommand command = new OvenOnCommand(oven);
		operator.setCommand(command);
		operator.performAction();
		OvenSetTemperatureCommand command2 = new OvenSetTemperatureCommand(oven, 350);
		operator.setCommand(command2);
		operator.performAction();
		System.out.println("Testing undo function of oven...");
		OvenUndoCommand undoCommand = new OvenUndoCommand(oven);
		operator.setCommand(undoCommand);
		operator.performAction();
		System.out.println("Resetting temperature to 350 again...");
		operator.setCommand(command2);
		operator.performAction();
		OvenSetTimerCommand command3 = new OvenSetTimerCommand(oven, 30);
		operator.setCommand(command3);
		operator.performAction();
		OvenOffCommand command4 = new OvenOffCommand(oven);
		operator.setCommand(command4);
		operator.performAction();
		System.out.println("Finished testing oven....\n");
	}
	
	// testing the refrigerator 
	@Test
	public void testRefridgerator() {
		System.out.println("\nTesting Refridgeraor....");
		Refridgerator fridge = new Refridgerator();
		RefridgeratorOnCommand command = new RefridgeratorOnCommand(fridge);
		operator.setCommand(command);
		operator.performAction();
		RefridgeratorSetTemperatureCommand command2 = new RefridgeratorSetTemperatureCommand(fridge, -10);
		operator.setCommand(command2);
		operator.performAction();
		RefridgeratorOffCommand command3 = new RefridgeratorOffCommand(fridge);
		operator.setCommand(command3);
		operator.performAction();
		System.out.println("Finished testing refridgerator....\n");
	}
	
}