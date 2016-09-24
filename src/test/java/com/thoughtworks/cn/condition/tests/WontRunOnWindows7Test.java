package com.thoughtworks.cn.condition.tests;

import com.thoughtworks.cn.condition.DisabledOnOs;
import com.thoughtworks.cn.condition.OS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WontRunOnWindows7Test {
    @Test
    @DisabledOnOs(OS.WINDOWS_7)
    public void does_not_run_on_windows_7() throws Exception {
        assertTrue(true);
    }
}
