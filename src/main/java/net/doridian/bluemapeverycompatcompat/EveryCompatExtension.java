package net.doridian.bluemapeverycompatcompat;

import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePack;
import de.bluecolored.bluemap.core.util.Key;

public class EveryCompatExtension implements ResourcePack.Extension<EveryCompatResourcePack> {
    public final static EveryCompatExtension INSTANCE = new EveryCompatExtension();

    @Override
    public EveryCompatResourcePack create(ResourcePack pack) {
        return new EveryCompatResourcePack();
    }

    @Override
    public Key getKey() {
        return new Key("bluemapeverycompatcompat", "resourcepack");
    }
}
