package net.doridian.bluemapeverycompatcompat;

import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePack;
import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePackExtension;
import de.bluecolored.bluemap.core.util.Key;

import java.util.HashMap;
import java.util.Map;

public class EveryCompatResourcePack implements ResourcePackExtension {
    private final ResourcePack pack;
    private final Map<String, String> everyCompatShortModNames;

    public EveryCompatResourcePack(ResourcePack pack) {
        this.pack = pack;

        this.everyCompatShortModNames = new HashMap<>();
        this.everyCompatShortModNames.put("hc", "handcrafted");
        this.everyCompatShortModNames.put("q", "quark");
        this.everyCompatShortModNames.put("c", "create");
        this.everyCompatShortModNames.put("sdl", "storagedelight");
        this.everyCompatShortModNames.put("fd", "farmersdelight");
        this.everyCompatShortModNames.put("abnbl", "boatload");
    }

    @Override
    public Key remapBlockState(Key src) {
        if (!src.getNamespace().equals("everycomp")) {
            return src;
        }
        String[] segments = src.getValue().split("/");
        if (segments.length < 3) {
            return src;
        }
        String assetModName = this.everyCompatShortModNames.get(segments[0]);
        String assetName = segments[segments.length - 1];
        return new Key(assetModName, assetName);
    }
}
