package me.omrih.spoutjamplugin.item;

import org.getspout.spoutapi.material.item.GenericCustomFood;

import static me.omrih.spoutjamplugin.Main.plugin;

public class EdibleOakLeaves extends GenericCustomFood {
    public EdibleOakLeaves() {
        // Plugin instance, Item ID, url to PNG texture, Hunger restored
        super(plugin, "edible_oak_leaves", "https://i.ibb.co/sCFvQBD/q6wBozz.png", 5);
        setName("Edible Oak Leaves"); // Set food name
    }
}
