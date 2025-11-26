package net.doridian.bluemapeverycompatcompat;

import de.bluecolored.bluemap.core.resources.pack.resourcepack.ResourcePack;

public class BlueMapEveryCompatCompat implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from BlueMapEveryCompatCompat!");
        ResourcePack.Extension.REGISTRY.register(EveryCompatExtension.INSTANCE);
    }
}
