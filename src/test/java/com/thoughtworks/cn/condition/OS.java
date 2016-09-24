package com.thoughtworks.cn.condition;

import java.util.Arrays;
import java.util.Optional;

public enum OS {
    MAC_OS("Mac OS X"),
    WINDOWS_7("Windows 7"),
    OTHERS("Others");

    private final String name;

    OS(String name) {
        this.name = name;
    }

    public static OS determine() {
        String current = System.getProperty("os.name");
        Optional<OS> found = Arrays.stream(OS.values()).filter(os -> os.name.equals(current)).findFirst();

        return found.isPresent() ? found.get() : OS.OTHERS;
    }
}
