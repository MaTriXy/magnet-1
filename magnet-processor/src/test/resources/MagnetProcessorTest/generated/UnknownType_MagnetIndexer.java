package magnet;

import app.extension.MagnetUnknownTypeTabFactory;
import java.util.HashMap;
import java.util.Map;

import magnet.internal.Range;

public final class MagnetIndexer {
    public static void register(MagnetInstanceManager instanceManager) {
        InstanceFactory[] factories = new InstanceFactory[] {
                new MagnetUnknownTypeTabFactory(),
        };
        Map<Class, Object> index = new HashMap<>();
        index.put(MagnetUnknownTypeTabFactory.getType(), new Range(0, 1, ""));
        instanceManager.register(factories, index);
    }
}
