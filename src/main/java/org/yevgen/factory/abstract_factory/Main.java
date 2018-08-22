package org.yevgen.factory.abstract_factory;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        AbstractStorageFactory storageFactory = StorageFactory.getFactory(StorageType.HDD);
        storageFactory.getStorageInstance(StorageBrand.WD).saveInfo(UUID.randomUUID().toString());
        storageFactory.getStorageInstance(StorageBrand.TOSHIBA).saveInfo(UUID.randomUUID().toString());

        storageFactory = StorageFactory.getFactory(StorageType.USB);
        storageFactory.getStorageInstance(StorageBrand.WD).saveInfo(UUID.randomUUID().toString());
        storageFactory.getStorageInstance(StorageBrand.TOSHIBA).saveInfo(UUID.randomUUID().toString());

    }
}
