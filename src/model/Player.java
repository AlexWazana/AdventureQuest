package model;

import java.util.Random;

import javax.swing.JLabel;

public class Player {
	private int health;
	private Weapon[] weapons= new Weapon[10];
	private Weapon primaryWeapon;
	private int experience;
	private int experienceToLevelUp;
	private int level;
	private String playerLocation;
	private Random rand = new Random();
	private JLabel hpLabelValue,weaponLabelType,playerLocationString,diceRollJlabel;
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getExperienceToLevelUp() {
		return experienceToLevelUp;
	}
	public void setExperienceToLevelUp(int experienceToLevelUp) {
		this.experienceToLevelUp = experienceToLevelUp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPlayerLocation() {
		return playerLocation;
	}
	public void setPlayerLocation(String playerLocation) {
		this.playerLocation = playerLocation;
		this.playerLocationString.setText(playerLocation);
		
	}
	public Player(JLabel hpLabelValue,JLabel weaponLabelType,JLabel playerLocationString, JLabel diceRoll)
	{
		this.health=15;
		this.weapons[0] = new Weapon(1);
		this.primaryWeapon=weapons[0];
		this.experience=0;
		this.level=1;
		this.experienceToLevelUp=10;
		this.playerLocation="Starting Screen";
		this.hpLabelValue=hpLabelValue;
		this.weaponLabelType=weaponLabelType;
		this.playerLocationString=playerLocationString;
		this.diceRollJlabel=diceRoll;
	}
//	private 
	public int getHealth() {
		return health;
	}
	public void rollHitDice()
	{
		int twentyDice = rand.nextInt(20)+1;
	}
	public void levelUp()
	{
		this.experience=0;
		this.level++;
		this.experienceToLevelUp=this.experienceToLevelUp+5;
	}
	public void setHealth(int health) {
		this.health = health;
		hpLabelValue.setText(this.health+"");
	}
	public JLabel getHpLabelValue() {
		return hpLabelValue;
	}
	public void setHpLabelValue(JLabel hpLabelValue) {
		this.hpLabelValue = hpLabelValue;
	}
	public JLabel getWeaponLabelType() {
		return weaponLabelType;
	}
	public void setWeaponLabelType(JLabel weaponLabelType) {
		this.weaponLabelType = weaponLabelType;
	}
	public JLabel getPlayerLocationString() {
		return playerLocationString;
	}
	public void setPlayerLocationString(JLabel playerLocationString) {
		this.playerLocationString = playerLocationString;
	}
	public JLabel getDiceRollJlabel() {
		return diceRollJlabel;
	}
	public void setDiceRoll(int diceRoll) {
		//this.diceRollJlabel = diceRoll;
		diceRollJlabel.setText(diceRoll+"");
	}
	public Weapon[] getWeapons() {
		return weapons;
	}
	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}
	public Weapon getPrimaryWeapon() {
		return primaryWeapon;
	}
	public void setPrimaryWeapon(Weapon primaryWeapon) {
		this.primaryWeapon = primaryWeapon;
		weaponLabelType.setText(primaryWeapon.getWeaponName());
	}

}
