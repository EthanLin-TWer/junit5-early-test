package com.thoughtworks.cn.condition.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WontRunOnWindows7Test {
    @Test
    void does_not_run_on_windows_7() {
        assertTrue(true);
    }
}
