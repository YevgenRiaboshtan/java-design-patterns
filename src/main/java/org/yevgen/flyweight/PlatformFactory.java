package org.yevgen.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PlatformFactory {

    private static Map<PlatformType, Platform> platforms = new HashMap<>();

    private PlatformFactory() {
        throw new UnsupportedOperationException("Cannot create class instance");
    }

    public static synchronized Platform getPlatformInstance(PlatformType platformType) {
        Platform platform = platforms.get(platformType);
        if (Objects.isNull(platform)) {
            switch (platformType) {
                case JAVA:
                    platform = new JavaPlatform();
                    break;
                case RUBY:
                    platform = new RubyPlatform();
                    break;
                case C:
                    platform = new CPlatform();
                    break;
                case CPP:
                    platform = new CppPlatform();
                    break;
            }
            if (Objects.nonNull(platform)) {
                platforms.put(platformType, platform);
            }
        }
        return platform;
    }

    public enum PlatformType {
        JAVA,
        RUBY,
        C,
        CPP;
    }
}
