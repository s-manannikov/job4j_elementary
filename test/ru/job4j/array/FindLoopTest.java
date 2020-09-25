package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8Then5() {
        int input[] = {3, 4, 6, 8, 12, 16, 20, 28};
        int value = 16;
        int result = FindLoop.indexOf(input, value);
        int expect = 5;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas10ThenNo() {
        int input[] = {10, 11, 12, 14, 15, 16};
        int value = 13;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind45() {
        int[] input = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int value = 45;
        int start = 4;
        int finish = 7;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}