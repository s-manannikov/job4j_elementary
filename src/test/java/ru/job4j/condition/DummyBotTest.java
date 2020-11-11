package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import ru.job4j.condition.DummyBot;

import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, Умник.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2+2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}