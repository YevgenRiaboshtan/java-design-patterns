package org.yevgen.factory.abstract_factory;

public interface AbstractStorageFactory {
    Storage getStorageInstance(StorageBrand storageBrand);
}
