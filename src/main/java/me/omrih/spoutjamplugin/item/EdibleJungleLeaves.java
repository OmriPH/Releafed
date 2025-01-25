package me.omrih.spoutjamplugin.item;

import org.getspout.spoutapi.material.item.GenericCustomFood;

import static me.omrih.spoutjamplugin.Main.itemPath;
import static me.omrih.spoutjamplugin.Main.plugin;

public class EdibleJungleLeaves extends GenericCustomFood {
    public EdibleJungleLeaves() {
        // Plugin instance, Item ID, url to PNG texture, Hunger restored
        super(plugin, "edible_jungle_leaves", itemPath + "edible_jungle_leaf.png", 5);
        setName("Edible Jungle Leaves"); // Set food name
    }
}
