package com.example.demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DemoApplicationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testMain() {
        // Setup
        final String[] args = new String[]{"12", "10", "15", "15", "2"};

        // Run the test
        DemoApplication.main(args);

        // Verify the results
    }

    @Test
    public void throw_exception_if_invalid_input() {
        thrown.expect(IllegalArgumentException.class);
        // Setup
        final String[] args = null;

        // Run the test
        DemoApplication.main(args);
    }
}
