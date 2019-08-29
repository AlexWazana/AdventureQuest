package model;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class Combat {
	private Boolean onCombat;
	private Player player;
	private Monster enemy;
	private Random rand = new Random();
	private Player currentPlayer;
	private String prevLocation;
	private JTextArea mainTextArea;
	private JButton startButton, choice1, choice2, choice3, choice4;
	
	public Combat(JTextArea mainTextArea,JButton startButton,JButton choice1,JButton choice2,JButton choice3,JButton choice4,Player currentPlayer)
	{

		//this.onCombat=true;
		this.mainTextArea=mainTextArea;
		this.choice1=choice1;
		this.choice2=choice2;
		this.choice3=choice3;
		this.choice4=choice4;
		this.currentPlayer=player;
		createEnemy();
		prevLocation=currentPlayer.getPlayerLocation();
		currentPlayer.setPlayerLocation("Stand Off");
		mainTextArea.setText("A "+enemy.getName() + " stands infront of you with a thretning gaze.\n He quickly approches you !\n\n\n\nWhat do you do ?");
		duelToDeath();
	}
	private void createEnemy()
	{
		//if(player.getLevel()==1)
	//	{
			enemy=new Goblin();
	//	}

	}
	private void attackMonster()
	{
		int diceRoll = rand.nextInt(20) + 1;
		int damage;
		player.setDiceRoll(diceRoll);
		if(diceRoll>=this.enemy.getArmor())
		{
			hitRoll(player.getPrimaryWeapon().rollDamageDice());
			choice1.setText("<");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
			
		}
	}
	private void hitRoll(int diceRoll)
	{
		currentPlayer.setPlayerLocation("Combat");
		mainTextArea.setText("You swing your weapon and it hits !\n\n you damaged the enemy for "+diceRoll+"\n");
	}
	private void duelToDeath()
	{
		choice1.setText("Attack the goblin");
		choice2.setText("Run");
		choice3.setText("");
		choice4.setText("");
	}
	public void setScenario(String playerChoice)
	{
		switch(player.getPlayerLocation())
		{
		case "Stand Off":
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
		case "Starting Screen":
			
			
		}
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
