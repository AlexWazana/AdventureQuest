package controller;

import model.Dungeon;
import view.GameWindow;

public class ATController {
	
	private GameWindow gameWindow;
	private Dungeon currentDungeon;
	public ATController()
	{
		
	}
	public void startGame()
	{
		gameWindow=new GameWindow(this);
	}
	public void setDungeon(Dungeon selectedDungeon)
	{
		this.currentDungeon=selectedDungeon;
		startDungeon();
	}
	private void startDungeon()
	{
		currentDungeon.setScenerio("");
	}
	private void startCombat()
	{
		
	}

}
