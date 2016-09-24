package com.thoughtworks.cn.condition.tests;

import com.thoughtworks.cn.condition.DisabledOnOs;
import com.thoughtworks.cn.condition.OS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Windows7Tests {
    @Test
    @DisabledOnOs(OS.WINDOWS_7)
    public void should_not_run_this_test_on_windows_7() throws Exception {
        assertEquals(1 + 1, 2);
    }
}
