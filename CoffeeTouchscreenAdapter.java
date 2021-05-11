package CoffeeMachineInterface;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
		
	private OldCoffeeMachine aOldVendingMachine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
	aOldVendingMachine = oldVendingMachine;
	}

	public void chooseFirstSelection() {
	aOldVendingMachine.selectFlavor1();
	}

	public void chooseSecondSelection() {
	aOldVendingMachine.selectFlavor2();
	}
}

	