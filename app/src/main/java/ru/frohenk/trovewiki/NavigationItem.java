package ru.frohenk.trovewiki;

/**
 * Created by frohenk on 22.08.15.
 */
public enum NavigationItem {
    DRAGONS("Dragons"),
    BIOME_SPECIFIC("Biome Specific"),
    COMMON_ORES("Common Ores"),
    FORGING_MATERIALS("Forging Materials"),
    GARDENING("Gardening"),
    RINGCRAFTING("Ringcrafting"),
    RUNECRAFTING("Runecrafting"),
    SHADOW_ARENA("Shadow Arena"),
    SEASONAL_EVENT("Seasonal & Event"),
    QUEST_ITEMS("Quest Items"),
    LOOTBOXES("Lootboxes"),
    COINS("Coins"),
    KEYS("Keys"),
    AURAS("Auras"),
    MISCELLANEOUS("Miscellaneous"),
    FISHING_POLE("Fishing Pole"),
    FISHES_AND_RESOURCES("Fishes and Resources"),
    EQUIPMENT("Equipment"),
    RINGS("Rings"),
    MOUNTS("Mounts"),
    BOATS("Boats"),
    MAG_RIDERS("Mag Riders"),
    WINGS("Wings"),
    ALLIES("Allies"),
    TOMES("Tomes"),
    KNIGHT("Knight"),
    GUNSLINGER("Gunslinger"),
    FAE_TRICKSTER("Fae Trickster"),
    DRACOLYTE("Dracolyte"),
    NEON_NINJA("Neon Ninja"),
    CANDY_BARBARIAN("Candy Barbarian"),
    ICE_SAGE("Ice Sage"),
    SHADOW_HUNTER("Shadow Hunter"),
    PIRATE_CAPTAIN("Pirate Captain"),
    BOOMERANGER("Boomeranger"),
    TOMB_RAISER("Tomb Raiser"),
    LUNAR_LANCER("Lunar Lancer");

    public final String name;

    NavigationItem(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
