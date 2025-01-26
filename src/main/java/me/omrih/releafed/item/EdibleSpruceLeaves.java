package me.omrih.releafed.item;

import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomFood;
import org.getspout.spoutapi.player.SpoutPlayer;

import static me.omrih.releafed.Main.itemPath;
import static me.omrih.releafed.Main.plugin;

public class EdibleSpruceLeaves extends GenericCustomFood {
    public EdibleSpruceLeaves() {
        // Plugin instance, Item ID, url to PNG texture, Hunger restored
        super(plugin, "edible_spruce_leaves", itemPath + "edible_spruce_leaf.png", 5);
        setName("Edible Spruce Leaves"); // Set food name
    }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
        if (player.getFoodLevel() < 20) {
            player.getInventory().removeItem(new ItemStack(player.getItemInHand().getType(), 1, player.getItemInHand().getDurability()));
            player.setFoodLevel(player.getFoodLevel() + getHungerRestored());
            return true;
        }
        return false;
    }
}
