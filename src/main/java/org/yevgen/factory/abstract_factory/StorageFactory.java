package org.yevgen.factory.abstract_factory;

public class StorageFactory {
    private StorageFactory() {
        throw new AssertionError();
    }

    public static AbstractStorageFactory getFactory(StorageType storageType) {
        if (StorageType.HDD.equals(storageType)) {
            return new HddStorageFactory();
        } else if (StorageType.USB.equals(storageType)) {
            return new FlashDriveStorageFactory();
        }
        return null;
    }
}
