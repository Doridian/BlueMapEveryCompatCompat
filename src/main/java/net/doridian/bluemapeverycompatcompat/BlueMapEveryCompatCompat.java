package net.doridian.bluemapeverycompatcompat;

import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePack;

public class BlueMapEveryCompatCompat implements Runnable {
    @Override
    public void run() {
        ResourcePack.Extension.REGISTRY.register(EveryCompatExtension.INSTANCE);
        System.out.println("BlueMapEveryCompatCompat loaded OK!");
    }
}
