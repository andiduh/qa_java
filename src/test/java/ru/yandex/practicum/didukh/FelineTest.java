package ru.yandex.practicum.didukh;

import com.example.Feline;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    @Test
    void getFamilyForFelineIsFelines() {
        Feline feline = new Feline();
        boolean isFeline = feline.getFamily().equals("Кошачьи");
        assertTrue(isFeline, "У кошек должно быть семейство 'Кошачьи'.");
    }

    @Test
    void getKittensWhenParameterIsEmptyReturnsOne() {
        Feline feline = new Feline();
        int actualCount = feline.getKittens();
        int expectedCount = 1;
        assertEquals(expectedCount, actualCount, "Количество котят должно быть равно 1.");
    }

    @Test
    void eatMeatForPredatorIsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood, "Хищники должны есть Животных, Птиц и Рыб.");
    }
}
