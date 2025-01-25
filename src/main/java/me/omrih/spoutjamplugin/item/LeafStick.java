package me.omrih.spoutjamplugin.item;

import org.getspout.spoutapi.material.item.GenericCustomItem;

import static me.omrih.spoutjamplugin.Main.itemPath;
import static me.omrih.spoutjamplugin.Main.plugin;

public class LeafStick extends GenericCustomItem {
    public LeafStick() {
        super(plugin, "leaf_stick", itemPath + "leaf_stick.png");
        setName("Leaf Stick");
    }
}
