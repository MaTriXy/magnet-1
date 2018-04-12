package app.extension;

import app.Page;
import magnet.InstanceFactory;
import magnet.InstanceRetention;
import magnet.Scope;

public final class MagnetHomePageNoParamsFactory implements InstanceFactory<Page> {

    @Override
    public Page create(Scope scope) {
        return new HomePageNoParams();
    }

    @Override
    public InstanceRetention getInstanceRetention() {
        return InstanceRetention.SCOPE;
    }

    public static Class getType() {
        return Page.class;
    }
}