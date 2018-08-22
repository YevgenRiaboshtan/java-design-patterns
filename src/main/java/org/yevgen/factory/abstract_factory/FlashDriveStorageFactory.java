package org.yevgen.factory.abstract_factory;

import org.yevgen.factory.abstract_factory.storage.FlashDriveToshibaStorage;
import org.yevgen.factory.abstract_factory.storage.FlashDriveWdStorage;

public class FlashDriveStorageFactory implements AbstractStorageFactory {

    @Override
    public Storage getStorageInstance(StorageBrand storageBrand) {
        if (StorageBrand.WD.equals(storageBrand)) {
            return new FlashDriveWdStorage();
        } else if (StorageBrand.TOSHIBA.equals(storageBrand)) {
            return new FlashDriveToshibaStorage();
        }
        return null;
    }
}
