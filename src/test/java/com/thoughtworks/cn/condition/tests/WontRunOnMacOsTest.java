package com.thoughtworks.cn.condition.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WontRunOnMacOsTest {
    @Test
    void does_not_run_on_mac_os() throws Exception {
        assertEquals(1 + 1, 2, "change your computer to Mac will solve this failing test");
    }
}
