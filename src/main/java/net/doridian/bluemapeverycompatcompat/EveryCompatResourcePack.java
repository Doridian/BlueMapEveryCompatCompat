package net.doridian.bluemapeverycompatcompat;

import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePackExtension;
import de.bluecolored.bluemap.core.util.Key;

public class EveryCompatResourcePack implements ResourcePackExtension {
    @Override
    public Key getBlockStateKey(Key src) {
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
