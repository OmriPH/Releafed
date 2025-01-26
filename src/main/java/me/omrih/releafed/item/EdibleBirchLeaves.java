package me.omrih.releafed.item;

import org.getspout.spoutapi.material.item.GenericCustomFood;

import static me.omrih.releafed.Main.itemPath;
import static me.omrih.releafed.Main.plugin;

public class EdibleBirchLeaves extends GenericCustomFood {
    public EdibleBirchLeaves() {
        // Plugin instance, Item ID, url to PNG texture, Hunger restored
        super(plugin, "edible_birch_leaves", itemPath + "edible_birch_leaf.png", 5);
        setName("Edible Birch Leaves"); // Set food name
    }
}
