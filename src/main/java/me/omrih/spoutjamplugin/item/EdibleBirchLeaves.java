package me.omrih.spoutjamplugin.item;

import org.getspout.spoutapi.material.item.GenericCustomFood;

import static me.omrih.spoutjamplugin.Main.plugin;

public class EdibleBirchLeaves extends GenericCustomFood {
    public EdibleBirchLeaves() {
        // Plugin instance, Item ID, url to PNG texture, Hunger restored
        super(plugin, "edible_birch_leaves", "https://i.ibb.co/sCFvQBD/q6wBozz.png", 5);
        setName("Edible Birch Leaves"); // Set food name
    }
}
