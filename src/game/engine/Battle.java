package game.engine;
import game.engine.titans.Titan;

import game.engine.weapons.factory.WeaponFactory;
import game.engine.titans.TitanRegistry;
import game.engine.lanes.Lane;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import game.engine.base.Wall;


public class Battle {
	
	static final int[][] PHASES_APPROACHING_TITANS = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	final private  int WALL_BASE_HEALTH=10000;
	
	private int numberOfTurns;
	
	private int resourcesGathered;
	
	private BattlePhase battlePhase=BattlePhase.EARLY;
	
	private int numberOfTitansPerTurn=1;
	
	private int score;
	
	private int titanSpawnDistance;
	
	static String file="titan.csv";
	
	private final WeaponFactory weaponFactory = new WeaponFactory();
	
	final HashMap<Integer, TitanRegistry> titansArchives = new HashMap<Integer, TitanRegistry>();
	
	private final ArrayList<Titan> approachingTitans = new ArrayList<Titan>();
	
	final private  PriorityQueue<Lane> lanes =new PriorityQueue<Lane>() ;
	
	private ArrayList<Lane> originalLanes = new ArrayList<Lane>();
	
	public Battle(int numberOfTurns, int score, int titanSpawnDistance, int initialNumOfLanes, int initialResourcesPerLane) throws IOException{
		this.numberOfTurns= numberOfTurns;
		this.score= score;
		this.titanSpawnDistance= titanSpawnDistance;
		this.resourcesGathered=(initialResourcesPerLane*initialNumOfLanes);			
	}
	
	// Method to initialize lanes
    private void initializeLanes(int numOfLanes) {
        for (int i = 1; i <= numOfLanes; i++) {
            Lane lane = new Lane(new Wall(WALL_BASE_HEALTH));
            lanes.add(lane);
            originalLanes.add(lane);
        }
    }
	//this method is to set the 2d array
	public  int [][] ReadFile(String Filepath, int amount_of_Fields){
		List<String> recordsList= new ArrayList<String>();
		String currentline;
		
		try {
			FileReader fr=new FileReader(Filepath);
			BufferedReader br=new BufferedReader(fr);
			
			while((currentline=(br.readLine()))!=null) {
				
				recordsList.add(currentline);
				
			}
			int recordcount=recordsList.size();
			
			String arraytoreturn[][]=new String[recordcount][amount_of_Fields];
			int arraytoreturn1[][]=new int[recordcount][amount_of_Fields];
			String []  data;
			
			for(int i=0;i<recordcount; i++) {
				data=recordsList.get(i).split(",");
				
				for (int j=0; j<data.length; j++) {
					arraytoreturn1 [i][j]=Integer. parseInt(data[j]);
				}
		
			}
			
			return arraytoreturn1;
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

	public int getResourcesGathered() {
		return resourcesGathered;
	}

	public void setResourcesGathered(int resourcesGathered) {
		this.resourcesGathered = resourcesGathered;
	}

	public BattlePhase getBattlePhase() {
		return battlePhase;
	}

	public void setBattlePhase(BattlePhase battlePhase) {
		this.battlePhase = battlePhase;
	}

	public int getNumberOfTitansPerTurn() {
		return numberOfTitansPerTurn;
	}

	public void setNumberOfTitansPerTurn(int numberOfTitansPerTurn) {
		this.numberOfTitansPerTurn = numberOfTitansPerTurn;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTitanSpawnDistance() {
		return titanSpawnDistance;
	}

	public void setTitanSpawnDistance(int titanSpawnDistance) {
		this.titanSpawnDistance = titanSpawnDistance;
	}

	public int[][] getPHASES_APPROACHING_TITANS() {
		return PHASES_APPROACHING_TITANS;
	}

	public int getWALL_BASE_HEALTH() {
		return WALL_BASE_HEALTH;
	}

	public int getNumberOfTurns() {
		return numberOfTurns;
	}
	
	public void setNumberOfTurns(int x) {
		this.numberOfTurns = x;
	}

	public WeaponFactory getWeaponFactory() {
		return weaponFactory;
	}

	public HashMap<Integer, TitanRegistry> getTitansArchives() {
		return titansArchives;
	}

	public ArrayList<Titan> getApproachingTitans() {
		return approachingTitans;
	}

	public PriorityQueue<Lane> getLanes() {
		return lanes;
	}

	public ArrayList<Lane> getOriginalLanes() {
		return originalLanes;
	}
}
