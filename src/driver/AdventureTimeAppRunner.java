package driver;

import javax.swing.JOptionPane;

import controller.ATController;

public class AdventureTimeAppRunner {
	public static void main(String[] args)
	{
		ATController controller = new ATController();
		controller.startGame();
		//JOptionPane.showMessageDialog(null, "working.");
	}
}
