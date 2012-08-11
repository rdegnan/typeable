package com.netflix.frege;

import org.testng.annotations.Test;

public class TestApp {
    @Test
    public void allChecks() {
        assert TypeableProperties.allChecks(10);
    }
}
