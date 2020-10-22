package main.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main o = new Main();
		o.coffeeSelection();
	}
	void coffeeSelection() {
		adapter = new CoffeeTouchscreenAdapter();
		adapter.TouchscreenAdapter(oldMachine);
		System.out.println("Do you want Coffee A or Coffee B? ");
		selection = input.nextLine();
		if(selection.equalsIgnoreCase("A")) {
			adapter.chooseFirstSelection();
		}
		else if(selection.equalsIgnoreCase("B")) {
			adapter.chooseSecondSelection();
		}else {
			System.out.println("Please enter a valid selection: A or B");
			coffeeSelection();
		}
	}
	private static CoffeeTouchscreenAdapter adapter;
	private static OldCoffeeMachine oldMachine = new OldCoffeeMachine();
	private static Scanner input = new Scanner(System.in);
	private static String selection;	
}