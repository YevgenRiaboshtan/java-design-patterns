package org.yevgen.factory.abstract_factory;

import org.yevgen.factory.abstract_factory.storage.HddToshibaStorage;
import org.yevgen.factory.abstract_factory.storage.HddWdStorage;

public class HddStorageFactory implements AbstractStorageFactory {

    @Override
    public Storage getStorageInstance(StorageBrand storageBrand) {
        if (StorageBrand.WD.equals(storageBrand)) {
            return new HddWdStorage();
        } else if (StorageBrand.TOSHIBA.equals(storageBrand)) {
            return new HddToshibaStorage();
        }
        return null;
    }
}
