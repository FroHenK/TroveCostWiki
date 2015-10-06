package ru.frohenk.trovewiki;

import java.io.Serializable;

/**
 * Created by frohenk on 22.08.15.
 */

public enum TroveItem implements Serializable {

    AZULIAN_DRAGON_ESSENCE("Azulian Dragon Essence","1:1,250 - 1:1,500",NavigationItem.DRAGONS),
    AZULIAN_DRAGON_SOUL("Azulian Dragon Soul","1:6,000 - :7,000",NavigationItem.DRAGONS),
    NEON_DRAGON_SOUL("Neon Dragon Soul","1:2,000 - 1:2,500",NavigationItem.DRAGONS),
    ANCIENT_DRAGON_SOUL("Ancient Dragon Soul","1:1,000 - 1:1,500",NavigationItem.DRAGONS),
    MOONWING_DRAGON_SOUL("Moonwing Dragon Soul","1:1,000 - 1:2,500",NavigationItem.DRAGONS),
    DRAGON_COIN("Dragon Coin","1:2,000 - 1:3,000",NavigationItem.DRAGONS),
    BLEACHED_BONE("Bleached Bone","1:8 - 1:10",NavigationItem.BIOME_SPECIFIC),
    BOTTLE("Bottle","1:8 - 1:10",NavigationItem.BIOME_SPECIFIC),
    ENCHANTED_WOOD("Enchanted Wood","1:7 - 1:10",NavigationItem.BIOME_SPECIFIC),
    FAERIE_DUST("Faerie Dust","1:8 - 1:10",NavigationItem.BIOME_SPECIFIC),
    GLACIAL_SHARD("Glacial Shard","1:3 - 1:5",NavigationItem.BIOME_SPECIFIC),
    GOLDEN_SOUL("Golden Soul","1:10 - 1:11",NavigationItem.BIOME_SPECIFIC),
    MUSHROOM_CHUNK("Mushroom Chunk","2:1 - 1:2",NavigationItem.BIOME_SPECIFIC),
    PRIMORDIAL_FLAME("Primordial Flame","1:4 - 1:5",NavigationItem.BIOME_SPECIFIC),
    ROBOTIC_SALVAGE("Robotic Salvage","1:10 - 1:15",NavigationItem.BIOME_SPECIFIC),
    SOMBER_SOUL("Somber Soul","1:5 - 1:8",NavigationItem.BIOME_SPECIFIC),
    STICKY_ICHOR("Sticky Ichor","1:4 - 1:5",NavigationItem.BIOME_SPECIFIC),
    WILD_CUPCAKE("Wild Cupcake","1:4 - 1:5",NavigationItem.BIOME_SPECIFIC),
    SHAPESTONE_ORE("Shapestone Ore","2:1 - 1:1",NavigationItem.COMMON_ORES),
    FORMICITE_ORE("Formicite Ore","1:1",NavigationItem.COMMON_ORES),
    INFINIUM_ORE("Infinium Ore","1:2 - 1:3",NavigationItem.COMMON_ORES),
    FLUX("Flux","1:3 Glim",NavigationItem.FORGING_MATERIALS),
    EYE_OF_QBTHULHU("Eye of Q'bthulhu","1:4 - 1:6",NavigationItem.FORGING_MATERIALS),
    TENTACLE_OF_QBTHULHU("Tentacle of Q'bthulhu","1:90 - 1:100",NavigationItem.FORGING_MATERIALS),
    PEARL_OF_WISDOM("Pearl of Wisdom","1:900 - 1:1,000",NavigationItem.FORGING_MATERIALS),
    TWINKLING_TOME("Twinkling Tome","1:1,000",NavigationItem.FORGING_MATERIALS),
    TWICE_FORGED_SHADOW_SOUL("Twice-Forged Shadow Soul","1:800 - 1:1,000",NavigationItem.FORGING_MATERIALS),
    THRICE_FORGED_SHADOW_SOUL("Thrice-Forged Shadow Soul","1:4,000 - 1:5,000",NavigationItem.FORGING_MATERIALS),
    QUAD_FORGED_SHADOW_SOUL("Quad-Forged Shadow Soul","1:14k - 1:16k",NavigationItem.FORGING_MATERIALS),
    PENTA_FORGED_SHADOW_SOUL("Penta-Forged Shadow Soul","1:50k - 1:60k",NavigationItem.FORGING_MATERIALS),
    PURIFYING_DRAGON_FLAME("Purifying Dragon Flame","1:5,000 - 1:6,000",NavigationItem.FORGING_MATERIALS),
    SUNLIGHT_BULB("Sunlight Bulb","2:1 - 1:1",NavigationItem.GARDENING),
    RICH_FERTILIZER("Rich Fertilizer","1:2",NavigationItem.GARDENING),
    FERTILE_ASH("Fertile Ash","1:2",NavigationItem.GARDENING),
    PLASMIC_SOLUTION("Plasmic Solution","1:2",NavigationItem.GARDENING),
    STEED_FEED("Steed Feed","1:8 - 1:10",NavigationItem.GARDENING),
    DIAMOND("Diamond","1:5",NavigationItem.RINGCRAFTING),
    SHADOW_DIAMOND("Shadow Diamond","1:10",NavigationItem.RINGCRAFTING),
    CRYSTALLIZED_CLOUD("Crystallized Cloud","2:1",NavigationItem.RUNECRAFTING),
    RADIANT_SHARD("Radiant Shard","1:3 - 1:4",NavigationItem.RUNECRAFTING),
    BLANK_SCROLL("Blank Scroll","1:65 - 1:100",NavigationItem.RUNECRAFTING),
    SHADOW_SHARD("Shadow Shard","1:10",NavigationItem.SHADOW_ARENA),
    HEART_OF_DARKNESS("Heart of Darkness","1:4,500 - 1:6,000",NavigationItem.SHADOW_ARENA),
    SPRING_BLOOM("Spring Bloom","1:2",NavigationItem.SEASONAL_EVENT),
    CANDY_CORN("Candy Corn","1:100 - 1:200",NavigationItem.SEASONAL_EVENT),
    CHESTNUT("Chestnut","1:10",NavigationItem.SEASONAL_EVENT),
    PUMPKIN("Pumpkin","1:100",NavigationItem.SEASONAL_EVENT),
    ULTRALIGHT_FLIGHT_CHASSIS("Ultralight Flight Chassis","1:4,000 - 1:5,000",NavigationItem.QUEST_ITEMS),
    INFINITY_DIAMOND("Infinity Diamond","1:2,500",NavigationItem.QUEST_ITEMS),
    AI_ENHANCED_GYROSCOPE("A.I.-Enhanced Gyroscope","1:10k - 1:15k",NavigationItem.QUEST_ITEMS),
    V6_FLUX_CAPACITOR("V6 Flux Capacitor","1:5,000",NavigationItem.QUEST_ITEMS),
    MINERS_TROVE("Miner's Trove","1:50 - 1:100",NavigationItem.LOOTBOXES),
    NIGHTMARE_MYSTERY_BOX("Nightmare Mystery Box","1:500 - 1:1,000",NavigationItem.LOOTBOXES),
    TURKEYTOPIA_MYSTERY_BOX("Turkeytopia Mystery Box","1:1,000",NavigationItem.LOOTBOXES),
    SNOWFEST_MYSTERY_BOX("Snowfest Mystery Box","1:1,000",NavigationItem.LOOTBOXES),
    SOULTRAPS("Soultraps","1:100",NavigationItem.LOOTBOXES),
    CURRENT_ADVENTURE_BOX("Current Adventure Box","1:75 - 1:250",NavigationItem.LOOTBOXES),
    CHAOS_CHEST("Chaos Chest","1:2,000",NavigationItem.LOOTBOXES),
    RADIANT_CACHE("Radiant Cache","1:400 - 1:650",NavigationItem.LOOTBOXES),
    SHADOW_CACHE("Shadow Cache","1:450 - 1:650",NavigationItem.LOOTBOXES),
    AZULIAN_DRAGON_CACHE("Azulian Dragon Cache","1:800",NavigationItem.LOOTBOXES),
    NEON_DRAGON_CACHE("Neon Dragon Cache","1:800",NavigationItem.LOOTBOXES),
    ANCIENT_DRAGON_CACHE("Ancient Dragon Cache","1:800",NavigationItem.LOOTBOXES),
    COSTUME_MYSTERY_BOX("Costume Mystery Box","1:18k - 1:20k",NavigationItem.LOOTBOXES),
    THE_ORANGE_BLOCK("The Orange Block","1:30k - 1:36k",NavigationItem.LOOTBOXES),
    SHAPERS_DREAM("Shaper's Dream","1:3k",NavigationItem.LOOTBOXES),
    SHAPERS_VISION("Shaper's Vision","1:6k",NavigationItem.LOOTBOXES),
    GOLDEN_CHAOS_CHEST("Golden Chaos Chest","1:200k",NavigationItem.LOOTBOXES),
    CLASS_COIN("Class Coin","1:28k - 1:30k",NavigationItem.COINS),
    INVENTORY_EXPANDER("Inventory Expander","1:20k - 1:25k",NavigationItem.COINS),
    PATRON_COIN("Patron Coin","1:90k - 1:110k",NavigationItem.COINS),
    CHAOS_COIN("Chaos Coin","1:750k++",NavigationItem.COINS),
    SHADOW_KEY("Shadow Key","1:250 - 1:400",NavigationItem.KEYS),
    MOON_KEY("Moon Key","1:500 - 1:800",NavigationItem.KEYS),
    GOLDEN_KEY("Golden Key","1:40k - 1:60k",NavigationItem.KEYS),
    TOUGH_LOVE("Tough Love","1:20k - 1:30k",NavigationItem.AURAS),
    SHADOW_STAIN("Shadow Stain","1:20k - 1:25k",NavigationItem.AURAS),
    PRIMAL_BLOCKS("Primal Blocks","100:1",NavigationItem.MISCELLANEOUS),
    BOMB("Bomb","1:1-2",NavigationItem.MISCELLANEOUS),
    SHADOW_KEY_FRAGMENT("Shadow Key Fragment","1:1",NavigationItem.MISCELLANEOUS),
    SHADOW_KEY_GEM("Shadow Key Gem","1:10",NavigationItem.MISCELLANEOUS),
    MOON_KEY_FRAGMENT("Moon Key Fragment","1:5",NavigationItem.MISCELLANEOUS),
    MOON_KEY_GEM("Moon Key Gem","1:100",NavigationItem.MISCELLANEOUS),
    HEART_A_PHONE("Heart-a-Phone","1:6,000 - 1:10k",NavigationItem.MISCELLANEOUS),
    RENAME_TAG("Rename Tag","1:25k - 1:35k",NavigationItem.MISCELLANEOUS),
    DRAGON_CRUCIBLE("Dragon Crucible","1:300k - 1:450k++",NavigationItem.MISCELLANEOUS),
    REALM_PORTAL_SKY("Realm Portal Sky","1:4,000 - 1:7,000",NavigationItem.MISCELLANEOUS),
    BASIC_FISHING_POLE("Basic Fishing Pole",":100-1:300",NavigationItem.FISHING_POLE),
    CHAOS_ROD("Chaos Rod",":5,500 - 1:7,000",NavigationItem.FISHING_POLE),
    WISH_FISHER("Wish Fisher",":10k - 1:15k",NavigationItem.FISHING_POLE),
    MOLTEN_MAGMA_SIFTER("Molten Magma Sifter",":2k-1:3k",NavigationItem.FISHING_POLE),
    CANDIED_FISHING_CANE("Candied Fishing Cane",":3k-1:5k",NavigationItem.FISHING_POLE),
    LADY_OF_THE_LAKE("Lady of the Lake",":5k-1:7k",NavigationItem.FISHING_POLE),
    RARE_FISH("Rare Fish","1:1k - 1:3k",NavigationItem.FISHES_AND_RESOURCES),
    ENCHANTED_FISH("Enchanted Fish","1:2.5k - 1:3.5k",NavigationItem.FISHES_AND_RESOURCES),
    GLIM("Glim","3:1",NavigationItem.FISHES_AND_RESOURCES),
    GOLDEN_SEASHELL("Golden Seashell","3:1 - 2:1",NavigationItem.FISHES_AND_RESOURCES),
    ANCIENT_SCALE("Ancient Scale","1:350 - 1:500",NavigationItem.FISHES_AND_RESOURCES),
    ENCHANTED_SCALE("Enchanted Scale","1:500 - 1:600",NavigationItem.FISHES_AND_RESOURCES),
    SHADOW_LV_1("Shadow Lv. 1","1:100 - 1:150",NavigationItem.EQUIPMENT),
    RADIANT("Radiant","1:120k - 1:150k",NavigationItem.EQUIPMENT),
    SHADOW_LEVEL_2_RING("Shadow Level 2 Ring","1:200 - 1:300",NavigationItem.RINGS),
    SHADOW_LEVEL_3_RING("Shadow Level 3 Ring","1:1,000 - 1:2,000",NavigationItem.RINGS),
    SHADOW_LEVEL_4_RING("Shadow Level 4 Ring","1:25k - 1:50k",NavigationItem.RINGS),
    SHADOW_LEVEL_4_RING_W_KNOCKBACK("Shadow Level 4 Ring w/ Knockback","1:7.5k - 1:12k",NavigationItem.RINGS),
    PINK_COOKIEPHANT("Pink Cookiephant","1:50k - 1:70k",NavigationItem.MOUNTS),
    BLUE_COOKIEPHANT("Blue Cookiephant","1:50k - 1:70k",NavigationItem.MOUNTS),
    EGGSTER_BOUNCER("Eggster Bouncer","1:40k - 1:55k",NavigationItem.MOUNTS),
    CHOCOLATE_CHICANERY("Chocolate Chicanery","1:40k - 1:55k",NavigationItem.MOUNTS),
    TRUEFIRE_PHOENIX("Truefire Phoenix","1:60k - 1:85k",NavigationItem.MOUNTS),
    BALEFIRE_PHOENIX("Balefire Phoenix","1:60k - 1:85k",NavigationItem.MOUNTS),
    BLUE_BUDGIE_BUDDY("Blue Budgie Buddy","1:45k - 1:60k",NavigationItem.MOUNTS),
    PINK_BUDGIE_BUDDY("Pink Budgie Buddy","1:45k - 1:60k",NavigationItem.MOUNTS),
    SHUFFLING_SHRIMP_NIGIRI("Shuffling Shrimp Nigiri","1:35k - 1:45k",NavigationItem.MOUNTS),
    DELICIOUS_DRAGON_ROLL("Delicious Dragon Roll","1:50k - 1:80k",NavigationItem.MOUNTS),
    KAMI_OF_SCORCHED_SKIES("Kami of Scorched Skies","1:50k - 1:75k",NavigationItem.MOUNTS),
    KAMI_OF_SHELTERED_SHORES("Kami of Sheltered Shores","1:65k - 1:75k",NavigationItem.MOUNTS),
    PRODIGAL_PERIDOTER("Prodigal Peridoter","1:10k+ - 1:20k+",NavigationItem.MOUNTS),
    PAUNCHY_DRAGON_PUP("Paunchy Dragon Pup","1:55k - 1:65k",NavigationItem.MOUNTS),
    GIANT_RED_PANDA("Giant Red Panda","1:13k - 1:15k",NavigationItem.MOUNTS),
    GIANT_FAE_PANDA("Giant Fae Panda","1:13k - 1:15k",NavigationItem.MOUNTS),
    BLUE_MANTA_RAY("Blue Manta Ray","1:1,000 - 1:1,500",NavigationItem.MOUNTS),
    GREEN_MANTA_RAY("Green Manta Ray","1:1,000 - 1:1,500",NavigationItem.MOUNTS),
    FAE_BOUGHSKIMMER("Fae Boughskimmer","1:35k - 1:40k",NavigationItem.MOUNTS),
    PRANCING_PINATA("Prancing Pinata","1:15k - 1:20k",NavigationItem.MOUNTS),
    NIMBLE_NIMBUS("Nimble Nimbus","1:20k - 1:25k",NavigationItem.MOUNTS),
    CHAOS_HOUND("Chaos Hound","1:40k - 1:100k",NavigationItem.MOUNTS),
    RADIANT_STEED("Radiant Steed","1:20k - 1:25k",NavigationItem.MOUNTS),
    RESTLESS_EYE("Restless Eye","1:10k - 1:15k",NavigationItem.MOUNTS),
    BOUNCY_LADYBUG("Bouncy Ladybug","1:30k - 1:35k",NavigationItem.MOUNTS),
    RUNEMASTERS_RECORD("Runemaster's Record","1:80k - 1:100k",NavigationItem.MOUNTS),
    CYGNUS_01_NEON_CYCLE("Cygnus-01 Neon Cycle","1:25k - 1:35k",NavigationItem.MOUNTS),
    TORCHED_TAURUS("Torched Taurus","1:100k",NavigationItem.MOUNTS),
    TUNDRA_THUNDERER("Tundra Thunderer","1:100k",NavigationItem.MOUNTS),
    SQUEAKERS("Squeakers","1:80k - 1:120k",NavigationItem.MOUNTS),
    BOOSTER_SEAT("Booster Seat","1:8k - 1:20k",NavigationItem.MOUNTS),
    DAIMEOWNT("Daimeownt","1:40k - 1:50k",NavigationItem.MOUNTS),
    ARI_GATO("Ari Gato","1:40k - 1:50k",NavigationItem.MOUNTS),
    DOMO_GATO("Domo Gato","1:40k - 1:50k",NavigationItem.MOUNTS),
    OVERLORD_OMNISEAT("Overlord Omniseat","1:40k - 1:50k",NavigationItem.MOUNTS),
    LOVE_SEAT("Love Seat","1:40k - 1:50k",NavigationItem.MOUNTS),
    SPRINKLES("Sprinkles","1:40k - 1:50k",NavigationItem.MOUNTS),
    WAR_HORSE("War Horse","1:40k - 1:50k",NavigationItem.MOUNTS),
    NEON_NIGHTCYCLE("Neon Nightcycle","1:40k - 1:50k",NavigationItem.MOUNTS),
    TROVIAN_SUPERCYCLE("Trovian Supercycle","1:50k - 1:80k",NavigationItem.MOUNTS),
    UNI_CYCLE("Uni-Cycle","1:40k - 1:50k",NavigationItem.MOUNTS),
    RACING_RAPTOR("Racing Raptor","1:10k - 1:20k",NavigationItem.MOUNTS),
    AWESOME_BALL("Awesome Ball","1:10k - 1:20k",NavigationItem.MOUNTS),
    STORMY("Stormy","1:10k - 1:20k",NavigationItem.MOUNTS),
    SEBASTIAN("Sebastian","1:10k - 1:20k",NavigationItem.MOUNTS),
    SHADOW_PINATA("Shadow Pinata","1:60k - 1:100k",NavigationItem.MOUNTS),
    ARCANIUM_CRAWLER("Arcanium Crawler","1:40k - 1:50k",NavigationItem.MOUNTS),
    SPITE_BITER("Spite Biter","1:40k - 1:50k",NavigationItem.MOUNTS),
    BONEWEAVER("Boneweaver","1:40k - 1:50k",NavigationItem.MOUNTS),
    PWN_E("PWN-E","1:2k - 1:5k",NavigationItem.MOUNTS),
    INFINITY_PWN_E("Infinity PWN-E","1:5k - 1:10k",NavigationItem.MOUNTS),
    SKULLY("Skully","1:2k - 1:5k",NavigationItem.MOUNTS),
    MOULDER("Moulder","1:2k - 1:5k",NavigationItem.MOUNTS),
    SPRINGY_SPORELING("Springy Sporeling","1:2k - 1:5k",NavigationItem.MOUNTS),
    TUNDRA_THRESHER("Tundra Thresher","1:2k - 1:5k",NavigationItem.MOUNTS),
    FLOATING_FORMULA("Floating Formula","1:8k - 1:15k",NavigationItem.MOUNTS),
    SCOOPS("Scoops","1:6k - 1:10k",NavigationItem.MOUNTS),
    JOUNCING_JELLYFISH("Jouncing Jellyfish","1:6k - 1:10k",NavigationItem.MOUNTS),
    ENCHANTED_JELLYFISH("Enchanted Jellyfish","1:6k - 1:10k",NavigationItem.MOUNTS),
    DREAM_BRONY("Dream Brony","1:10k - 1:12k",NavigationItem.MOUNTS),
    SHADOW_RAY("Shadow Ray","1:10k - 1:12k",NavigationItem.MOUNTS),
    MAGIC_CARPET("Magic Carpet","1:15k - 1:18k",NavigationItem.MOUNTS),
    INSANISTEED("Insanisteed","1:20k - 1:25k",NavigationItem.MOUNTS),
    FAST_FRANK("Fast Frank","1:3k",NavigationItem.MOUNTS),
    GADGET_CAT("Gadget Cat","1:3k",NavigationItem.MOUNTS),
    JELLY_KNIGHT("Jelly Knight","1:7k",NavigationItem.MOUNTS),
    JADE_LARVORGHINI("Jade Larvorghini","1:3k",NavigationItem.MOUNTS),
    BATTLE_CATTERPILLAR("Battle Catterpillar","1:3k",NavigationItem.MOUNTS),
    CANDORIAN_CATERPILLAR("Candorian Caterpillar","1:3k",NavigationItem.MOUNTS),
    RODEO_COWTERPILLAR("Rodeo Cowterpillar","1:3k",NavigationItem.MOUNTS),
    PEMBLOCK("Pemblock","1:450 - 1:600",NavigationItem.MOUNTS),
    PEMBER("Pember","1:2k - 1:5k",NavigationItem.MOUNTS),
    ZOMBIE_PEMBLOCK("Zombie Pemblock","1:2k - 1:5k",NavigationItem.MOUNTS),
    PEMBURR_THE_CAROLING_CORGI("Pemburr the Caroling Corgi","1:2k - 1:5k",NavigationItem.MOUNTS),
    PEMBORG("Pemborg","1:2k - 1:5k",NavigationItem.MOUNTS),
    INFINIUM_PEMBORG("Infinium Pemborg","1:2k - 1:5k",NavigationItem.MOUNTS),
    PEMBARR("Pembarr","1:2k - 1:5k",NavigationItem.MOUNTS),
    MEOWNT("Meownt","1:450 - 1:600",NavigationItem.MOUNTS),
    MARTIAL_MEOWNT("Martial Meownt","1:2k - 1:5k",NavigationItem.MOUNTS),
    IMMORTAL_MEOWNT("Immortal Meownt","1:2k - 1:5k",NavigationItem.MOUNTS),
    STEAM_MEOWNT("Steam Meownt","1:2k - 1:5k",NavigationItem.MOUNTS),
    PERMAFROST_MEOWNT("Permafrost Meownt","1:2k - 1:5k",NavigationItem.MOUNTS),
    MAGIC_MEOWNT("Magic Meownt","1:2k - 1:5k",NavigationItem.MOUNTS),
    MECHA_MEOWNT("Mecha-Meownt","1:2k - 1:5k",NavigationItem.MOUNTS),
    SPRING_PINATA("Spring Pinata","1:20k",NavigationItem.MOUNTS),
    SUMMER_PINATA("Summer Pinata","1:20k",NavigationItem.MOUNTS),
    AUTUMN_PINATA("Autumn Pinata","1:20k",NavigationItem.MOUNTS),
    WINTER_PINATA("Winter Pinata","1:20k",NavigationItem.MOUNTS),
    SMASHING_PUMPKIN("Smashing Pumpkin","1:20k - 1:25k",NavigationItem.MOUNTS),
    SPRINGING_TURKEY("Springing Turkey","1:20k - 1:25k",NavigationItem.MOUNTS),
    RUDOLPH_RAPTOR("Rudolph Raptor","1:20k - 1:25k",NavigationItem.MOUNTS),
    SNUG_SNOWMAN("Snug Snowman","1:20k - 1:25k",NavigationItem.MOUNTS),
    REVELING_REINDEER("Reveling Reindeer","1:20k - 1:25k",NavigationItem.MOUNTS),
    SS_DINGHY("SS Dinghy","1:330 - 1:350",NavigationItem.BOATS),
    SS_CORGI("SS Corgi","1:3k - 1:5k",NavigationItem.BOATS),
    OLD_BLOCKSIDES("Old Blocksides","1:7k - 1:10k",NavigationItem.BOATS),
    CHAOTIC_CLIPPER("Chaotic Clipper","1:25k - 1:30k",NavigationItem.BOATS),
    CHAOTIC_CRUISER("Chaotic Cruiser","1:30k - 1:40k",NavigationItem.BOATS),
    ARCANIUM_STEAMBOAT("Arcanium Steamboat","1:40k",NavigationItem.BOATS),
    SS_DRACONIC("SS Draconic","1:40k",NavigationItem.BOATS),
    SS_DUTCHMAN("SS Dutchman","1:40k",NavigationItem.BOATS),
    MAG_RACER("Mag Racer","1:100",NavigationItem.MAG_RIDERS),
    FUN_POLICE("Fun Police","1:25k - 1:30k",NavigationItem.MAG_RIDERS),
    DANCE_PAD("Dance Pad","1:20k - 1:25k",NavigationItem.MAG_RIDERS),
    BULL_SHADOZER("Bull Shadozer","1:10k - 1:12k",NavigationItem.MAG_RIDERS),
    CASKART("Caskart","1:20k",NavigationItem.MAG_RIDERS),
    PUMPKIN_BOX("Pumpkin Box","1:40k",NavigationItem.MAG_RIDERS),
    TURBO_TURKEY("Turbo Turkey","1:40k",NavigationItem.MAG_RIDERS),
    MAHOGAN_TOBOGGAN("Mahogan Toboggan","1:10k",NavigationItem.MAG_RIDERS),
    LADEN_SLEIGH("Laden Sleigh","1:20k",NavigationItem.MAG_RIDERS),
    NEON_NIGHTSKY("Neon Nightsky","1:40k - 1:50k",NavigationItem.WINGS),
    STORMCALLERS_WINGS("Stormcaller's Wings","1:40k",NavigationItem.WINGS),
    XERO_LINE_WINGS("Xero Line Wings","1:30k",NavigationItem.WINGS),
    BLOODSEEKER_WINGS("Bloodseeker Wings","1:30k",NavigationItem.WINGS),
    ARCANIUM_DISCORD("Arcanium Discord","1:40k",NavigationItem.WINGS),
    CHAOS_BUTTERFLY("Chaos Butterfly","1:55k - 1:60k",NavigationItem.WINGS),
    WINGS_OF_DARKEST_NIGHT("Wings of Darkest Night","1:40k - 1:50k",NavigationItem.WINGS),
    DIGGSLY("Diggsly","1:833-1:1kВ ",NavigationItem.ALLIES),
    COTTON_CANDY("Cotton Candy","1:80k-1:120k",NavigationItem.ALLIES),
    _TREASURE_COMMONS(" Treasure Commons","1:100 - 1:200",NavigationItem.ALLIES),
    _TREASURE_UNCOMMONS(" Treasure Uncommons","1:600 - 1:800",NavigationItem.ALLIES),
    CHRONOMANCER_QUBESLY("Chronomancer Qubesly","1:6k - 1:8k",NavigationItem.ALLIES),
    PROWLING_SHADOW("Prowling Shadow","1:6k - 1:8k",NavigationItem.ALLIES),
    SHIELD_SERVITOR("Shield Servitor","1:6k - 1:8k",NavigationItem.ALLIES),
    RAPT_BERSERKER("Rapt Berserker","1:5k - 1:5.5k",NavigationItem.ALLIES),
    FEISTY_FLAMEDANCER("Feisty Flamedancer","1:6k - 1:8k",NavigationItem.ALLIES),
    BOUNDING_BOOT("Bounding Boot","1:75 - 1:100",NavigationItem.ALLIES),
    STEELY_SABATON("Steely Sabaton","1:100 - 1:200",NavigationItem.ALLIES),
    SORCEROUS_SHOE("Sorcerous Shoe","1:100 - 1:200",NavigationItem.ALLIES),
    CARDIO_COMPANION("Cardio Companion","1:100 - 1:200",NavigationItem.ALLIES),
    FOREMAN_FOOTWEAR("Foreman Footwear","1:2k - 1:3k",NavigationItem.ALLIES),
    SHADOW_ARENA_ALLIES("Shadow Arena Allies","1:10k - 1:12k",NavigationItem.ALLIES),
    SAMANTHA("Samantha","1:60k - 1:80k",NavigationItem.ALLIES),
    GLIM_GRIMOIRE("Glim Grimoire","1:4,350 - 1:6,250",NavigationItem.TOMES),
    FLUX_FOLIO("Flux Folio","1:4,350 - 1:6,250",NavigationItem.TOMES),
    SHAPESTONE_SURVEY("Shapestone Survey","1:6,000 - 1:8,750",NavigationItem.TOMES),
    FORMICITE_FORMULA("Formicite Formula","1:6,000 - 1:8,750",NavigationItem.TOMES),
    INFINIUM_MINERS_ALMANAC("Infinium Miner's Almanac","1:6,000 - 1:8,750",NavigationItem.TOMES),
    MYCOLOGICAL_MANUAL("Mycological Manual","1:6,000 - 1:8,750",NavigationItem.TOMES),
    CYBERNETICS_CATALOGUE("Cybernetics Catalogue","1:6,000 - 1:8,750",NavigationItem.TOMES),
    EYE_ENCYCLOPEDIA("Eye Encyclopedia","1:7k",NavigationItem.TOMES),
    TENTACLE_TRACT("Tentacle Tract","1:7k",NavigationItem.TOMES),
    TROVIAN_GUARD("Trovian Guard","1:30k - 1:35k",NavigationItem.KNIGHT),
    DRAGON_KNIGHT("Dragon Knight","1:35k - 1:40k",NavigationItem.KNIGHT),
    BLOOD_KNIGHT("Blood Knight","1:35k - 1:40k",NavigationItem.KNIGHT),
    BONE_KNIGHT("Bone Knight","1:45k - 1:50k",NavigationItem.KNIGHT),
    ELYSIAN_GUARDIAN("Elysian Guardian","1:45k - 1:50k",NavigationItem.KNIGHT),
    REGAL_REBEL("Regal Rebel","1:30k - 1:35k",NavigationItem.GUNSLINGER),
    REVOLVER_RANGER("Revolver Ranger","1:30k - 1:35k",NavigationItem.GUNSLINGER),
    HOTDOG_HERO("Hotdog Hero","1:35k - 1:40k",NavigationItem.GUNSLINGER),
    UBERMAN("Uberman","1:35k - 1:40k",NavigationItem.GUNSLINGER),
    HEARTBREAKER("Heartbreaker","1:45k - 1:50k",NavigationItem.GUNSLINGER),
    DARK_FAE("Dark Fae","1:35k - 1:40k",NavigationItem.FAE_TRICKSTER),
    ICE_COLD("Ice Cold","1:35k - 1:40k",NavigationItem.FAE_TRICKSTER),
    F43_TRICKSTER("F43 Trickster","1:45k - 1:50k",NavigationItem.FAE_TRICKSTER),
    BEE_TRICKSTER("Bee Trickster","1:45k - 1:50k",NavigationItem.FAE_TRICKSTER),
    GUARDIAN_ANGEL("Guardian Angel","1:45k - 1:50k",NavigationItem.FAE_TRICKSTER),
    ASHEN_BEAST("Ashen Beast","1:35k - 1:40k",NavigationItem.DRACOLYTE),
    SHADOW_MAW("Shadow Maw","1:35k - 1:40k",NavigationItem.DRACOLYTE),
    BALEFIRE_BEAST("Balefire Beast","1:35k - 1:40k",NavigationItem.DRACOLYTE),
    DREAMOLYTE("Dreamolyte","1:35k - 1:40k",NavigationItem.DRACOLYTE),
    NIGHTSHADE("Nightshade","1:30k - 1:35k",NavigationItem.NEON_NINJA),
    MAGENTA_MASTER("Magenta Master","1:35k - 1:40k",NavigationItem.NEON_NINJA),
    LUNAR_RONIN("Lunar Ronin","1:45k - 1:50k",NavigationItem.NEON_NINJA),
    HEARTBLEED("Heartbleed","1:35k - 1:40k",NavigationItem.NEON_NINJA),
    NEON_STROKE("Neon Stroke","1:35k - 1:40k",NavigationItem.NEON_NINJA),
    REBOOT("Reboot","1:35k - 1:40k",NavigationItem.NEON_NINJA),
    ICE_CREAM_CRUSHER("Ice Cream Crusher","1:35k - 1:40k",NavigationItem.CANDY_BARBARIAN),
    LICORICE_LORD("Licorice Lord","1:35k - 1:40k",NavigationItem.CANDY_BARBARIAN),
    DARK_INFINEON("Dark Infineon","1:45k - 1:50k",NavigationItem.CANDY_BARBARIAN),
    SUGAR_SKULL("Sugar Skull","1:45k - 1:50k",NavigationItem.CANDY_BARBARIAN),
    BLUE_JELLY_BEAR("Blue Jelly Bear","1:45k - 1:50k",NavigationItem.CANDY_BARBARIAN),
    PINK_JELLY_BEAR("Pink Jelly Bear","1:45k - 1:50k",NavigationItem.CANDY_BARBARIAN),
    SANTA_BARBARIAN("Santa Barbarian","1:60k - 1:100k",NavigationItem.CANDY_BARBARIAN),
    BLACK_ICE("Black Ice","1:35k - 1:40k",NavigationItem.ICE_SAGE),
    NICE_SAGE("Nice Sage","1:35k - 1:40k",NavigationItem.ICE_SAGE),
    SHADOWS_DISCIPLE("Shadow's Disciple","1:45k - 1:50k",NavigationItem.ICE_SAGE),
    MOLTEN_FURY("Molten Fury","1:45k - 1:50k",NavigationItem.ICE_SAGE),
    RELIC_OF_THE_PAST("Relic of the Past","1:35k - 1:40k",NavigationItem.SHADOW_HUNTER),
    DEAD_SHOT("Dead Shot","1:35k - 1:40k",NavigationItem.SHADOW_HUNTER),
    SHARP_SHOOTER("Sharp Shooter","1:45k - 1:50k",NavigationItem.SHADOW_HUNTER),
    SHADOW_SHROUD("Shadow Shroud","1:45k - 1:50k",NavigationItem.SHADOW_HUNTER),
    MASTER_OF_COMMANDING("Master of Commanding","1:30k - 1:35k",NavigationItem.PIRATE_CAPTAIN),
    GHOST_PIRATE("Ghost Pirate","1:45k - 1:50k",NavigationItem.PIRATE_CAPTAIN),
    MAD_SCIENTIST("Mad Scientist","1:45k - 1:50k",NavigationItem.PIRATE_CAPTAIN),
    DARK_BOOMERANGER("Dark Boomeranger","1:35k - 1:40k",NavigationItem.BOOMERANGER),
    WINTER_BOOMERANGER("Winter Boomeranger","1:35k - 1:40k",NavigationItem.BOOMERANGER),
    SOULKEEPER("Soulkeeper","1:35k - 1:40k",NavigationItem.TOMB_RAISER),
    ACIDIC("Acidic","1:35k - 1:40k",NavigationItem.TOMB_RAISER),
    BURNISHED_BRONZE("Burnished Bronze","1:45k - 1:60k",NavigationItem.LUNAR_LANCER),
    TWILIGHT_TEMPERANCE("Twilight Temperance","1:45k - 1:60k",NavigationItem.LUNAR_LANCER);
    public final String cost;
    public final String name;
    public final NavigationItem navigationCategory;

    TroveItem(String name, String cost, NavigationItem navigationCategory) {
        this.cost = cost;
        this.name = name;
        this.navigationCategory = navigationCategory;
    }

    @Override
    public String toString() {
        return name;
    }
}
