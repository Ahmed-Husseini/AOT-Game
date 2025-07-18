# Attack on Titan: Utopia

A Java-based **tower defense game** inspired by *Attack on Titan*, where the player defends the Utopia District against waves of Titans using deployable anti-Titan weaponry. The gameplay is endless and turn-based, with increasing difficulty over time.

---

## 📖 Game Concept

Set in an alternate *Attack on Titan* universe, the game revolves around defending the **Utopia District**—a vital border to Wall Rose—from increasingly aggressive Titan attacks. The player strategically places different weapons on several **lanes**, aiming to defeat Titans before they reach and destroy the walls.

---

## 🎮 Game Features

- **Endless tower defense** game loop  
- **Four Titan types** with unique behaviors  
- **Four weapon types**, each with distinct attack patterns  
- Multiple **lanes**, each with individual wall health and Titan queues  
- Dynamic **danger level** system to route Titan spawns  
- Three game phases: **Early**, **Intense**, and **Grumbling**, increasing difficulty  
- Resource economy with purchase and deployment system
- **Fully functional GUI** using **JavaFX**

---

## 🗂️ Project Structure

```plaintext
├── bin
│   └── game
│       ├── engine
│       │   ├── Battle.class
│       │   ├── BattlePhase.class
│       │   ├── base
│       │   │   └── Wall.class
│       │   ├── dataloader
│       │   │   └── DataLoader.class
│       │   ├── exceptions
│       │   │   ├── GameActionException.class
│       │   │   ├── InsufficientResourcesException.class
│       │   │   ├── InvalidCSVFormat.class
│       │   │   └── InvalidLaneException.class
│       │   ├── interfaces
│       │   │   ├── Attackee.class
│       │   │   ├── Attacker.class
│       │   │   └── Mobil.class
│       │   ├── lanes
│       │   │   └── Lane.class
│       │   ├── titans
│       │   │   ├── AbnormalTitan.class
│       │   │   ├── ArmoredTitan.class
│       │   │   ├── ColossalTitan.class
│       │   │   ├── PureTitan.class
│       │   │   ├── Titan.class
│       │   │   └── TitanRegistry.class
│       │   └── weapons
│       │       ├── PiercingCannon.class
│       │       ├── SniperCannon.class
│       │       ├── VolleySpreadCannon.class
│       │       ├── WallTrap.class
│       │       ├── Weapon.class
│       │       ├── WeaponRegistry.class
│       │       └── factory
│       │           ├── FactoryResponse.class
│       │           └── WeaponFactory.class
│       ├── gui
│       └── tests
│           └── Milestone1PublicTests.class
├── src
│   └── game
│       ├── engine
│       │   ├── Battle.java
│       │   ├── BattlePhase.java
│       │   ├── base
│       │   │   └── Wall.java
│       │   ├── dataloader
│       │   │   └── DataLoader.java
│       │   ├── exceptions
│       │   │   ├── GameActionException.java
│       │   │   ├── InsufficientResourcesException.java
│       │   │   ├── InvalidCSVFormat.java
│       │   │   └── InvalidLaneException.java
│       │   ├── interfaces
│       │   │   ├── Attackee.java
│       │   │   ├── Attacker.java
│       │   │   └── Mobil.java
│       │   ├── lanes
│       │   │   └── Lane.java
│       │   ├── titans
│       │   │   ├── AbnormalTitan.java
│       │   │   ├── ArmoredTitan.java
│       │   │   ├── ColossalTitan.java
│       │   │   ├── PureTitan.java
│       │   │   ├── Titan.java
│       │   │   └── TitanRegistry.java
│       │   └── weapons
│       │       ├── PiercingCannon.java
│       │       ├── SniperCannon.java
│       │       ├── VolleySpreadCannon.java
│       │       ├── WallTrap.java
│       │       ├── Weapon.java
│       │       ├── WeaponRegistry.java
│       │       └── factory
│       │           ├── FactoryResponse.java
│       │           └── WeaponFactory.java
│       ├── gui
│       └── tests
│           └── Milestone1PublicTests.java
├── titans.csv
└── weapons.csv
```

---

## ⚙️ Core OOP Design

### 🧱 Base Classes & Interfaces

- **Interfaces**
  - `Attackee` — anything that can be attacked (Titan, Wall)
  - `Attacker` — anything that attacks (Titan, Weapon)
  - `Mobil` — anything that moves (Titan)

- **Abstract Classes**
  - `Titan` — base class for all titans
  - `Weapon` — base class for all weapons

- **Battle Management**
  - `Battle` — main controller class for game flow
  - `Lane` — manages titans, weapons, and wall in a single lane
  - `Wall` — defensive structure with health points

### 👹 Titans

| Type            | Special Trait                                |
|-----------------|-----------------------------------------------|
| Pure Titan      | None                                          |
| Abnormal Titan  | Attacks twice per turn                        |
| Armored Titan   | Takes only 25% of damage                      |
| Colossal Titan  | Gains +1 speed after every movement           |

Each titan has:
- HP, damage, height, speed, distance, danger level, and resource value.

### 🛡️ Weapons

| Type                | Special Trait                                                |
|---------------------|--------------------------------------------------------------|
| Piercing Cannon     | Attacks the 5 closest titans                                 |
| Sniper Cannon       | Attacks the closest titan                                    |
| Volley Spread Cannon| Attacks titans in a specific distance range (min-max)        |
| Wall Trap           | Attacks titan only if it reaches the wall                    |

---

## 🧠 Game Logic Overview

### 🔁 Turn Flow
1. Player chooses to deploy a weapon or pass
2. Titans move forward
3. Weapons attack
4. Titans attack walls (if in range)
5. New titans are added to least dangerous lanes
6. Game phase and titan spawn rate may update

### 🛑 Game Over
- The game ends when **all lanes are lost** (wall HP reaches 0)
- No winning condition (endless scoring-based gameplay)

---

## 💻 JavaFX GUI

The game includes a **fully implemented JavaFX GUI** for visual interaction.

### GUI Features:
- Visual representation of lanes, titans, and weapons
- Wall health bars and danger indicators
- Score and resources display
- Weapon shop with click-to-deploy functionality
- Approaching titan queue display
- Game over screen with final score

The GUI can be launched via the `game.gui` package and interacts directly with the `Battle` engine.

---

## 🧪 Testing

Testing code is housed under the `game.tests` package.

Tests ensure:
- Correct Titan and Weapon instantiation
- Accurate turn logic
- Interface behavior (attack, move, defeat)
- Exception handling (e.g., insufficient resources, invalid lane)

---

## 🧱 Key Classes Snapshot

- `Titan` → `PureTitan`, `AbnormalTitan`, `ArmoredTitan`, `ColossalTitan`
- `Weapon` → `PiercingCannon`, `SniperCannon`, `VolleySpreadCannon`, `WallTrap`
- `Battle` → Main game controller
- `Lane` → Holds `Wall`, `PriorityQueue<Titan>`, `List<Weapon>`
- `DataLoader` → CSV reader for weapons/titans
- `WeaponFactory` → Purchases weapons based on available resources
- `FactoryResponse` → Return object of a weapon purchase attempt

---

## 🚨 Exception Handling

| Exception Class                  | Triggered When                                        |
|----------------------------------|--------------------------------------------------------|
| `InvalidLaneException`          | Trying to add a weapon to a destroyed lane             |
| `InsufficientResourcesException`| Not enough resources to purchase a weapon              |
| `InvalidCSVFormat`              | CSV files are incorrectly formatted                    |

---

## 🛠️ Technologies Used

- **Java 8+**
- **JavaFX** (for GUI)
- **Object-Oriented Programming**
- **Priority Queues & Collections**
- **BufferedReader for file handling**

---

## 📌 Future Enhancements

- Sound effects and background music
- Save/load game progress
- Additional titan/weapon types
- Leaderboard for player scores
- Difficulty levels

---

## 👥 Contributors

- **Ahmed Husseini**
- **Mohamed Yaser**
