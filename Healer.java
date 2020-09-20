
public class Healer {
	private String charName;
	private int charLevel = 1;
	
	
	public Healer(String name) {
		charName = name;
	}
	public Healer(String name, int level) {
		charName = name;
		charLevel = level;
	}
	private int maxHealth = 16*charLevel;
	private int Health = maxHealth;
	private int attack = 4*charLevel;
	private int defense = 6*charLevel;
	private int magicAttack = 5*charLevel;
	private int magicDefense = 10*charLevel;
	private int agility = 3*charLevel;
	private int wisdom = 12*charLevel;

}
