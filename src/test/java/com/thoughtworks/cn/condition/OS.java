package com.thoughtworks.cn.condition;

public enum OS {
    MAC_OS,
    WINDOWS_XP,
    WINDOWS_7,
    WINDOWS_8,
    UBUNTU;

    public static OS determine() {
        return MAC_OS;
    }
}
