package com.thoughtworks.cn.condition.tests;

import com.thoughtworks.cn.condition.DisabledOnOs;
import com.thoughtworks.cn.condition.OS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WontRunOnMacOsTest {
    @Test
    @DisabledOnOs(OS.MAC_OS)
    void does_not_run_on_mac_os() throws Exception {
        assertEquals(1 + 1, 3, "change your computer to Mac will solve this failing test");
    }
}
