package me.omrih.spoutjamplugin;

import me.omrih.spoutjamplugin.block.CondensedLeaves;
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

    public ExampleItem exampleItem;
    public CondensedLeaves condensedLeaves;
    public ExampleFood exampleFood;

    @Override
    public void onEnable() {
        plugin = this;
        logger = this.getLogger();
        // The items & blocks need to be initialised somewhere. Add as a variable to this class so it can be referenced to add to inventories
        condensedLeaves = new CondensedLeaves();
        exampleItem = new ExampleItem();
        exampleFood = new ExampleFood();

        // Condensed Leaves recipe(s) (no way this is the best way to do this)
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedLeaves, 1))
                        .addIngredient(4, MaterialData.leaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedLeaves, 1))
                        .addIngredient(4, MaterialData.birchLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedLeaves, 1))
                        .addIngredient(4, MaterialData.jungleLeaves));
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapelessRecipe(new SpoutItemStack(condensedLeaves, 1))
                        .addIngredient(4, MaterialData.spruceLeaves));
    }
}
