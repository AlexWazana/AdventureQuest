package model;

abstract class Monster {
	protected int level;
	protected int healthPoints;
	protected int armor;
	protected int minDamage;
	protected int maxDamage;
	protected int experience;
	protected String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	

}
