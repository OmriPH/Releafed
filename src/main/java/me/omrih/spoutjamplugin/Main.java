package me.omrih.spoutjamplugin;

import me.omrih.spoutjamplugin.block.CondensedBirchLeaves;
import me.omrih.spoutjamplugin.block.CondensedJungleLeaves;
import me.omrih.spoutjamplugin.block.CondensedOakLeaves;
import me.omrih.spoutjamplugin.block.CondensedSpruceLeaves;
import me.omrih.spoutjamplugin.item.ExampleFood;
import me.omrih.spoutjamplugin.item.ExampleItem;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

import java.util.logging.Logger;

public class Main extends JavaPlugin {
    public static Main plugin;
    public static Logger logger;

    public CondensedOakLeaves condensedOakLeaves;
    public CondensedBirchLeaves condensedBirchLeaves;
    public CondensedSpruceLeaves condensedSpruceLeaves;
    public CondensedJungleLeaves condensedJungleLeaves;
    public ExampleItem exampleItem;
    public ExampleFood exampleFood;

    @Override
    public void onEnable() {
        plugin = this;
        logger = this.getLogger();
        // The items & blocks need to be initialised somewhere. Add as a variable to this class so it can be referenced to add to inventories
        condensedOakLeaves = new CondensedOakLeaves();
        condensedBirchLeaves = new CondensedBirchLeaves();
        condensedSpruceLeaves = new CondensedSpruceLeaves();
        condensedJungleLeaves = new CondensedJungleLeaves();
        exampleItem = new ExampleItem();
        exampleFood = new ExampleFood();

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
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.leaves))
                        .addIngredient(condensedOakLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.birchLeaves))
                        .addIngredient(condensedBirchLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.spruceLeaves))
                        .addIngredient(condensedSpruceLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.jungleLeaves))
                        .addIngredient(condensedJungleLeaves));
    }
}
