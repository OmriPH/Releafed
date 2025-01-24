package me.omrih.spoutjamplugin.block;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;

import static me.omrih.spoutjamplugin.Main.plugin;

public class CondensedJungleLeaves extends GenericCustomBlock {
    public CondensedJungleLeaves() {
        // Plugin instance, Block ID, is opaque
        // GenericCubeBlockDesign takes Plugin instance, url to PNG texture, texture size
        super(plugin, "condensed_jungle_leaves", true, new GenericCubeBlockDesign(plugin, "https://i.ibb.co/YWs9T00/sugar-cane-block.png", 16));
        setName("Condensed Jungle Leaves"); // Set block name
    }
}
