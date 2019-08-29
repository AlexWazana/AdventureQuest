package model;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Dungeon {
	Monster[][] monsterTypes;
	private JTextArea mainTextArea;
	private JButton startButton, choice1, choice2, choice3, choice4;
	private Player currentPlayer;
	public Dungeon(JTextArea mainTextArea,JButton startButton,JButton choice1,JButton choice2,JButton choice3,JButton choice4,Player currentPlayer)
	{
		this.mainTextArea=mainTextArea;
		this.choice1=choice1;
		this.choice2=choice2;
		this.choice3=choice3;
		this.choice4=choice4;
		this.currentPlayer=currentPlayer;
		
	}
	private void OpeningScreen()
	{
		
	}
	private void generateMonsterArray()
	{
		monsterTypes[0]=new Monster[10];
		
	}
	public void setScenerio(String playerChoice)
	{
		switch(currentPlayer.getPlayerLocation()) {
		case "Starting Screen":
			CityGate();
			break;
		case "townGate":
			switch(playerChoice) {
			case "c1":
				break;
			case "c2":
				break;
			case "c3":
				break;
			case "c4":
				break;
			}
		}
		
	}
	private void CityGate()
	{
		currentPlayer.setPlayerLocation("City Gate");
		mainTextArea.setText("You are at the gate of the town.\nA guard is standing in front of you.\n\nWhat do you do ?");
		choice1.setText("Talk to the guard");
		choice2.setText("Attack the guard");
		choice3.setText("Leave");
		choice4.setText("");
	}
	public void talkGuard()
	{
		mainTextArea.setText("You are at the gate of the town.\nA guard is standing in front of you.\n\nWhat do you do ?");
		choice1.setText("Talk to the guard");
		choice2.setText("Attack the guard");
		choice3.setText("Leave");
		choice4.setText("");
	}

}
