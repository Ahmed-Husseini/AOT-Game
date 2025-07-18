package game.engine.lanes;
import java.util.*;

public class Lane implements Comparable<Lane> {
	//A class representing the Lanes in which a titan walk on to the wall. the class is able to get compared based on it's danger level.

	final private  game.engine.base.Wall laneWall;
	//A wall object found in the lane. This attribute will never be changed once initialized.
	private int dangerLevel=0;
	//An integer representing the danger level of a lane based on the number and danger level of the titans on it. This attribute is READ and WRITE and is initially set to 0.
	final private PriorityQueue<game.engine.titans.Titan> titans=new PriorityQueue<game.engine.titans.Titan>();
	//A queue that stores all the titans in a given lane and is initially empty. Titans closer to the walls have a higher priority. This attribute will never be changed once initialized.
	final private ArrayList<game.engine.weapons.Weapon> weapons=new ArrayList<game.engine.weapons.Weapon>();
	//A queue that stores all the weapons in a given lane and is initially empty. This attribute will never be changed once initialized.

	public Lane(game.engine.base.Wall laneWall) {
		//Constructor that initializes a Lane object with the given laneWall and the rest of the attributes as the initial empty values.
		this.laneWall = laneWall;
	}
	
	public int compareTo(Lane o) {
		//override the Comparable interface compareTo method to order lanes based on their danger level
		return (this.dangerLevel - o.dangerLevel);
	}

	public int getDangerLevel() {
		return dangerLevel;
	}

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel  = dangerLevel;
	}

	public game.engine.base.Wall getLaneWall() {
		return laneWall;
	}

	public PriorityQueue<game.engine.titans.Titan> getTitans() {
		return titans;
	}

	public ArrayList<game.engine.weapons.Weapon> getWeapons() {
		return weapons;
	}
	
}
