package com.thoughtworks.cn.condition.tests;

import com.thoughtworks.cn.condition.DisabledOnOs;
import com.thoughtworks.cn.condition.OS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Windows7Tests {
    @Test
    @DisabledOnOs(OS.MAC_OS)
    public void should_be_run_on_windows_7_and_fail() throws Exception {
        assertEquals(1 + 1, 3, "please fix this if you are not a Mac OS user.");
    }
}
