package me.omrih.releafed;

import me.omrih.releafed.block.CondensedBirchLeaves;
import me.omrih.releafed.block.CondensedJungleLeaves;
import me.omrih.releafed.block.CondensedOakLeaves;
import me.omrih.releafed.block.CondensedSpruceLeaves;
import me.omrih.releafed.item.*;
import me.omrih.releafed.tool.CondensedLeavesPickaxe;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spout.sound.SimpleSoundManager;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.sound.SoundManager;

import java.util.Random;
import java.util.logging.Logger;

public class Main extends JavaPlugin {
    public static final String blockPath = "https://raw.githubusercontent.com/Trioplane/SpoutJam-2025/refs/heads/main/textures/block/";
    public static final String itemPath = "https://raw.githubusercontent.com/Trioplane/SpoutJam-2025/refs/heads/main/textures/item/";
    public static Main plugin;
    public static Logger logger;
    public CondensedOakLeaves condensedOakLeaves;
    public CondensedBirchLeaves condensedBirchLeaves;
    public CondensedSpruceLeaves condensedSpruceLeaves;
    public CondensedJungleLeaves condensedJungleLeaves;
    public EdibleOakLeaves edibleOakLeaves;
    public EdibleBirchLeaves edibleBirchLeaves;
    public EdibleSpruceLeaves edibleSpruceLeaves;
    public EdibleJungleLeaves edibleJungleLeaves;
    public LeafStick leafStick;
    public DeadLeafStick deadLeafStick;
    public CondensedLeavesPickaxe condensedLeavesPickaxe;

    SoundManager soundManager;

    @Override
    public void onEnable() {
        plugin = this;
        logger = this.getLogger();
        soundManager = new SimpleSoundManager();
        // The items & blocks need to be initialised somewhere. Add as a variable to this class so it can be referenced to add to inventories
        condensedOakLeaves = new CondensedOakLeaves();
        condensedBirchLeaves = new CondensedBirchLeaves();
        condensedSpruceLeaves = new CondensedSpruceLeaves();
        condensedJungleLeaves = new CondensedJungleLeaves();
        edibleOakLeaves = new EdibleOakLeaves();
        edibleBirchLeaves = new EdibleBirchLeaves();
        edibleSpruceLeaves = new EdibleSpruceLeaves();
        edibleJungleLeaves = new EdibleJungleLeaves();
        leafStick = new LeafStick();
        deadLeafStick = new DeadLeafStick();
        condensedLeavesPickaxe = new CondensedLeavesPickaxe();

        Bukkit.getScheduler().runTaskTimer(this, () -> {
            if (new Random().nextInt(2) == 0) return;
            soundManager.playGlobalCustomMusic(plugin, "https://raw.githubusercontent.com/Trioplane/SpoutJam-2025/refs/heads/main/music/cobweb.ogg", true);
        }, 7200, 0);

        // Condensed Leaves recipe(s)
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedOakLeaves, 1))
                        .addIngredient(4, MaterialData.leaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedBirchLeaves, 1))
                        .addIngredient(4, MaterialData.birchLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedSpruceLeaves, 1))
                        .addIngredient(4, MaterialData.spruceLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedJungleLeaves, 1))
                        .addIngredient(4, MaterialData.jungleLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.leaves, 4))
                        .addIngredient(condensedOakLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.birchLeaves, 4))
                        .addIngredient(condensedBirchLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.spruceLeaves, 4))
                        .addIngredient(condensedSpruceLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.jungleLeaves, 4))
                        .addIngredient(condensedJungleLeaves));

        // edible leaves... yum
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(edibleOakLeaves))
                        .addIngredient(2, condensedOakLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(edibleBirchLeaves))
                        .addIngredient(2, condensedBirchLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(edibleSpruceLeaves))
                        .addIngredient(2, condensedSpruceLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(edibleJungleLeaves))
                        .addIngredient(2, condensedJungleLeaves));

        // Tools
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(leafStick, 1))
                        .shape(" s ", " s ", " s ")
                        .setIngredient('s', condensedOakLeaves)
        );
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(leafStick, 1))
                        .shape(" s ", " s ", " s ")
                        .setIngredient('s', condensedBirchLeaves)
        );
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(leafStick, 1))
                        .shape(" s ", " s ", " s ")
                        .setIngredient('s', condensedSpruceLeaves)
        );
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(leafStick, 1))
                        .shape(" s ", " s ", " s ")
                        .setIngredient('s', condensedJungleLeaves)
        );
        // Tools
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(condensedLeavesPickaxe))
                        .shape("xxx", " s ", " s ")
                        .setIngredient('s', leafStick)
                        .setIngredient('x', condensedOakLeaves)
        );
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(condensedLeavesPickaxe))
                        .shape("xxx", " s ", " s ")
                        .setIngredient('s', leafStick)
                        .setIngredient('x', condensedBirchLeaves)
        );
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(condensedLeavesPickaxe))
                        .shape("xxx", " s ", " s ")
                        .setIngredient('s', leafStick)
                        .setIngredient('x', condensedSpruceLeaves)
        );
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(condensedLeavesPickaxe))
                        .shape("xxx", " s ", " s ")
                        .setIngredient('s', leafStick)
                        .setIngredient('x', condensedJungleLeaves)
        );
    }
}
