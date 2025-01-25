package me.omrih.spoutjamplugin.item;

import org.getspout.spoutapi.material.item.GenericCustomItem;

import static me.omrih.spoutjamplugin.Main.itemPath;
import static me.omrih.spoutjamplugin.Main.plugin;

public class DeadLeafStick extends GenericCustomItem {
    public DeadLeafStick() {
        super(plugin, "dead_leaf_stick", itemPath + "dead_leaf_stick.png");
        setName("Dead Leaf Stick");
    }
}
