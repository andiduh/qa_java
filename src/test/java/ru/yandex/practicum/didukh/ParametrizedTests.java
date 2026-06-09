package ru.yandex.practicum.didukh;

import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTests {

    @ParameterizedTest
    @ValueSource(ints = {2, 5, 12})
    void getKittensForValidCount(int kittensCount) {
        Feline feline = new Feline();
        int actualCount = feline.getKittens(kittensCount);
        assertEquals(kittensCount, actualCount, "Количество котят должно быть целым, положительным числом.");
    }
}
