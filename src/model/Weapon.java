package model;

import java.util.Random;

public class Weapon {
	private String weaponName;
	private int minDamage;
	private int maxDamage;
	private Random rand = new Random();
	
	public Weapon(int weaponNumber)
	{
		switch(weaponNumber) {
			case 1:
				this.weaponName="Knife";
				this.minDamage=1;
				this.maxDamage=4;
				break;
			case 2:
				this.weaponName="Short Sword";
				this.minDamage=2;
				this.maxDamage=6;
				break;
			case 3:
				this.weaponName="Long Sword";
				this.minDamage=3;
				this.maxDamage=8;
				break;
			default:
				break;
		}

	}
	public int rollDamageDice()
	{
		int damage= rand.nextInt(this.maxDamage)+this.minDamage;
		damage = rand.nextInt(this.maxDamage-this.minDamage+1)+this.minDamage;
		return damage;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getMinDamage() {
		return minDamage;
	}

	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
}
