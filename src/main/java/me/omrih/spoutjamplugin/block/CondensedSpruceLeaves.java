package me.omrih.spoutjamplugin.block;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

import static me.omrih.spoutjamplugin.Main.blockPath;
import static me.omrih.spoutjamplugin.Main.plugin;

public class CondensedSpruceLeaves extends GenericCustomBlock {
    public CondensedSpruceLeaves() {
        // Plugin instance, Block ID, is opaque
        // GenericCubeBlockDesign takes Plugin instance, url to PNG texture, texture size
        super(plugin, "condensed_spruce_leaves", 18, new GenericCubeBlockDesign(plugin, blockPath + "condensed_spruce_leaves.png", 16));
        setName("Condensed Spruce Leaves"); // Set block name
    }
}
