package game.engine.dataloader;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DataLoader {
    // Attributes
    private static final String TITANS_FILE_NAME = "titans.csv";
    private static final String WEAPONS_FILE_NAME = "weapons.csv";

    // Methods
    public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException {
        HashMap<Integer, TitanRegistry> titanRegistryHashMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(TITANS_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] titanData = line.split(",");
                int code = Integer.parseInt(titanData[0]);
                int baseHealth = Integer.parseInt(titanData[1]);
                int baseDamage = Integer.parseInt(titanData[2]);
                int heightInMeters = Integer.parseInt(titanData[3]);
                int speed = Integer.parseInt(titanData[4]);
                int resourcesValue = Integer.parseInt(titanData[5]);
                int dangerLevel = Integer.parseInt(titanData[6]);

                TitanRegistry titanRegistry = new TitanRegistry(code, baseHealth, baseDamage, heightInMeters, speed, resourcesValue, dangerLevel);
                titanRegistryHashMap.put(code, titanRegistry);
            }
        }

        return titanRegistryHashMap;
    }

    public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException {
        HashMap<Integer, WeaponRegistry> weaponRegistryHashMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(WEAPONS_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] weaponData = line.split(",");
                int code = Integer.parseInt(weaponData[0]);
                int price = Integer.parseInt(weaponData[1]);
                int damage = Integer.parseInt(weaponData[2]);
                String name = weaponData[3];

                int minRange = 0;
                int maxRange = 0;

                // Check if the weapon type is VolleySpreadCannon
                if (weaponData.length == 6) {
                    minRange = Integer.parseInt(weaponData[4]);
                    maxRange = Integer.parseInt(weaponData[5]);
                }

                WeaponRegistry weaponRegistry = new WeaponRegistry(code, price, damage, name, minRange, maxRange);
                weaponRegistryHashMap.put(code, weaponRegistry);
            }
        }

        return weaponRegistryHashMap;
    }
}
