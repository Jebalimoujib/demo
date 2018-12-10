package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;

@Slf4j
public class DivisionServiceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private DivisionService divisionServiceUnderTest;

    @Before
    public void setUp() {
        divisionServiceUnderTest = new DivisionService();
    }

    @Test
    public void testDiviser() {
        // Setup
        final List input = Arrays.asList(11, "12", "13", "10", "15", "50");
        final int size = 3;
        final double nbSubList = Math.ceil(Double.valueOf(input.size()) / Double.valueOf(size));

        log.info("input: {}, size: {}", input, size);
        // Run the test
        final List<List> result = divisionServiceUnderTest.diviser(input, size);
        log.info("result: {}", result);

        // Verify the results
        Assert.assertThat(Double.valueOf(result.size()), is(nbSubList));
    }

    @Test
    public void diviser_throw_exception_if_input_invalid() {
        thrown.expect(IllegalArgumentException.class);
        // Run the test
        final List<List> result = divisionServiceUnderTest.diviser(null, 5);
    }
}
