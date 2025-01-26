package me.omrih.releafed.item;

import org.getspout.spoutapi.material.item.GenericCustomItem;

import static me.omrih.releafed.Main.itemPath;
import static me.omrih.releafed.Main.plugin;

public class LeafStick extends GenericCustomItem {
    public LeafStick() {
        super(plugin, "leaf_stick", itemPath + "leaf_stick.png");
        setName("Leaf Stick");
    }
}
