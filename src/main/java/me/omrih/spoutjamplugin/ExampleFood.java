package me.omrih.spoutjamplugin;

import org.getspout.spoutapi.material.item.GenericCustomFood;

import static me.omrih.spoutjamplugin.Main.plugin;

public class ExampleFood extends GenericCustomFood {
    public ExampleFood() {
        // Plugin instance, Item ID, url to PNG texture, Hunger restored
        super(plugin, "examplefood", "https://i.ibb.co/sCFvQBD/q6wBozz.png", 5);
        setName("Example Food"); // Set food name
    }
}
