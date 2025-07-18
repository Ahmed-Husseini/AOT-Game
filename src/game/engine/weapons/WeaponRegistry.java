package game.engine.weapons;

public class WeaponRegistry {
//A class representing the WeaponRegistry, which is a place to store the weapon's information that was read from the csv file for later use.

	final private int code;
	//An integer representing the type of weapon. This attribute will never be changed once initialized.
	private int price;
	//An integer representing the price of the weapon.
	private int damage;
	//Same as in Weapon class.
	private String name;
	//A variable representing the weapon's name.
	private int minRange;
	//An integer representing the lower bound of a weapon's damage range.
	private int maxRange;
	//An integer representing the upper bound of a weapon's damage range.
	
	public WeaponRegistry(int code, int price) {
		//Constructors that initializes a Weapon object with only the code and price.
		this.code = code;
		this.price = price;
	}
	
	public WeaponRegistry(int code, int price, int damage, String name) {
		//Constructors that initializes a Weapon object with the given parameters as the attributes.
		this.code = code;
		this.price = price;
		this.damage = damage;
		this.name = name;
	}
	
	public WeaponRegistry(int code, int price, int damage, String name, int minRange, int maxRange) {
		//Constructors that initializes a Weapon object with the given parameters as the attributes.
		this.code = code;
		this.price = price;
		this.damage = damage;
		this.name = name;
		this.minRange = minRange;
		this.maxRange = maxRange;
	}

	public int getCode() {
		return code;
	}

	public int getPrice() {
		return price;
	}

	public int getDamage() {
		return damage;
	}

	public String getName() {
		return name;
	}

	public int getMinRange() {
		return minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}
	
	
}
