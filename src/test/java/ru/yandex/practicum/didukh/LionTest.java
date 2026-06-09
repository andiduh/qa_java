package ru.yandex.practicum.didukh;

import com.example.FelineInterface;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    FelineInterface feline;

    @Test
    void getKittensForLionWhenParameterIsEmptyReturnsOne() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline);
        int actualCount = lion.getKittens();
        int expectedCount = 1;
        assertEquals(expectedCount, actualCount, "Количество котят должно быть равно 1.");
    }

    @Test
    void getFoodForLionIsMeat() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood, "Хищники должны есть Животных, Птиц и Рыб.");
    }

    @Test
    void doesHaveManeForMaleIsTrue() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.doesHaveMane(), "У самца должна быть грива.");
    }

    @Test
    void doesHaveManeForFemaleIsFalse() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.doesHaveMane(), "У самки не должно быть гривы.");
    }

    @Test
    void doesHaveManeWithException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Неизвестно"));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
