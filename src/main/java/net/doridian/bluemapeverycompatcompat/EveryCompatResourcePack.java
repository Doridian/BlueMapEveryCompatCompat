package net.doridian.bluemapeverycompatcompat;

import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePack;
import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePackExtension;
import de.bluecolored.bluemap.core.util.Key;

import java.util.HashMap;
import java.util.Map;

public class EveryCompatResourcePack implements ResourcePackExtension {
    private final ResourcePack pack;

    public EveryCompatResourcePack(ResourcePack pack) {
        this.pack = pack;
    }

    @Override
    public Key remapResource(Key src) {
        if (!src.getNamespace().equals("everycomp")) {
            return src;
        }
        String[] segments = src.getValue().split("/", 3);
        if (segments.length < 3) {
            return src;
        }
        return new Key(segments[1], segments[2]);
    }
}
