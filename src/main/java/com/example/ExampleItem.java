package com.example;

import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

import static com.example.Main.plugin;

// GenericCustomItem is the class to extend for a custom item
public class ExampleItem extends GenericCustomItem {


    public ExampleItem() {
        // Plugin instance, Item ID, url to PNG texture
        super(plugin, "exampleitem", "https://i.ibb.co/sCFvQBD/q6wBozz.png");
        setName("Example Item"); // Set item name
        // setStackable(false); // Makes item not stackable
    }

    // Run code when the item is interacted with!
    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {

        if (!player.isSpoutCraftEnabled()) return false; // Only interact if Spout player (Spout can allow vanilla clients to join)

        player.getInventory().addItem(new SpoutItemStack(plugin.EXAMPLE_ITEM)); // Give player a Spout item

        return true;
    }
}
