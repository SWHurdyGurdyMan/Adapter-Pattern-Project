package main.java;
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
	private OldCoffeeMachine oldMachine;

	public void TouchscreenAdapter(OldCoffeeMachine oldMachine) {
		this.oldMachine = new OldCoffeeMachine();
	}
	
	public void chooseFirstSelection() {
		this.oldMachine.selectA();
	}
	public void chooseSecondSelection() {
		this.oldMachine.selectB();
	}
}