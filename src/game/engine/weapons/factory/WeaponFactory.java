/*package game.engine.weapons.factory;

import game.engine.weapons.WeaponRegistry;
import java.io.IOException;
import java.util.HashMap;

public class WeaponFactory {
	//A class representing the WeaponFactory, which is used to store the available weapons that can be purchased during each turn.
	
	private final HashMap<Integer, WeaponRegistry> weaponShop;
	
	WeaponFactory() throws IOException {
		
	}
}*/

package game.engine.weapons.factory;

import game.engine.dataloader.DataLoader;
import game.engine.weapons.WeaponRegistry;
//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WeaponFactory {
    // A class representing the WeaponFactory, which is used to store the available weapons that can be purchased during each turn.
    private final HashMap<Integer, WeaponRegistry> weaponShop;

    public WeaponFactory() throws IOException {
		this.weaponShop = DataLoader.readWeaponRegistry();
        // Initialize weaponShop in the constructor
    }

 
    public HashMap<Integer, WeaponRegistry> getWeaponShop() {
        return weaponShop;
    }
}

