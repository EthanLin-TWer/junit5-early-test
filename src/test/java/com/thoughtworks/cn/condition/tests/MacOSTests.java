package com.thoughtworks.cn.condition.tests;

import com.thoughtworks.cn.condition.DisabledOnOs;
import com.thoughtworks.cn.condition.OS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MacOSTests {
    @Test
    @DisabledOnOs(OS.WINDOWS_7)
    void should_be_run_on_mac_os() throws Exception {
        assertEquals(1 + 1, 2);
    }
}
