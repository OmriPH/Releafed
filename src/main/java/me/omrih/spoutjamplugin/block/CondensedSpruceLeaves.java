package me.omrih.spoutjamplugin.block;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

import static me.omrih.spoutjamplugin.Main.plugin;

public class CondensedSpruceLeaves extends GenericCustomBlock {
    public CondensedSpruceLeaves() {
        // Plugin instance, Block ID, is opaque
        // GenericCubeBlockDesign takes Plugin instance, url to PNG texture, texture size
        super(plugin, "condensed_spruce_leaves", true, new GenericCubeBlockDesign(plugin, "https://i.ibb.co/YWs9T00/sugar-cane-block.png", 16));
        setName("Condensed Spruce Leaves"); // Set block name
    }
}
