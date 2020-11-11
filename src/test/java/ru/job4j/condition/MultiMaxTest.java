package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void max2() {
        int result = MultiMax.max(1, 11, 10);
        assertThat(result, is(11));
    }

    @Test
    public void max1() {
        int result = MultiMax.max(30, 23, 4);
                assertThat(result, is(30));
    }

    @Test
    public void max3() {
        int result = MultiMax.max(3, 13, 16);
        assertThat(result, is(16));
    }

    @Test
    public void max123() {
        int result = MultiMax.max(7, 7, 7);
        assertThat(result, is(7));
    }

}