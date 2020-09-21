package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
    int result = Max.max(12, 13);
        assertThat(result, is(13));
    }

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(21, 20);
        assertThat(result, is(21));
    }

    @Test
    public void whenMax1To2Then12() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }
}