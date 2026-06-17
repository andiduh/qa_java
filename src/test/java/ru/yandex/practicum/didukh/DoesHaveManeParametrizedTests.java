package ru.yandex.practicum.didukh;

import com.example.Feline;
import com.example.FelineInterface;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class DoesHaveManeParametrizedTests {

    @ParameterizedTest
    @ValueSource(strings = "Самец")
    void doesHaveManeForMaleIsTrue(String sex) throws Exception {
        FelineInterface feline = new Feline();
        Lion lion = new Lion(feline, sex);
        assertTrue(lion.doesHaveMane(), "У самца должна быть грива.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самка"})
    void doesHaveManeForFemaleIsFalse(String sex) throws Exception {
        FelineInterface feline = new Feline();
        Lion lion = new Lion(feline, sex);
        assertFalse(lion.doesHaveMane(), "У самки не должно быть гривы.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Неизвестно", "Male", "Female"})
    void doesHaveManeWithException(String sex) throws Exception {
        FelineInterface feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> new Lion(feline, sex));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
