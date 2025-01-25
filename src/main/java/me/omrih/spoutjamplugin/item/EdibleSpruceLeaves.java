package me.omrih.spoutjamplugin.item;

import org.getspout.spoutapi.material.item.GenericCustomFood;

import static me.omrih.spoutjamplugin.Main.itemPath;
import static me.omrih.spoutjamplugin.Main.plugin;

public class EdibleSpruceLeaves extends GenericCustomFood {
    public EdibleSpruceLeaves() {
        // Plugin instance, Item ID, url to PNG texture, Hunger restored
        super(plugin, "edible_spruce_leaves", itemPath + "edible_spruce_leaf.png", 5);
        setName("Edible Spruce Leaves"); // Set food name
    }
}
