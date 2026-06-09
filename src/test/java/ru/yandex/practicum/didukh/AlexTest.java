package ru.yandex.practicum.didukh;

import com.example.Alex;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AlexTest {

    @Test
    void alexHasManeIsTrue() throws Exception {
        Alex alex = new Alex();
        assertTrue(alex.doesHaveMane(), "Алекс должен иметь гриву, т.к. он - самецю");
    }

    @Test
    void getFriendsOfAlex() throws Exception {
        Alex alex = new Alex();
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals(expectedFriends, actualFriends, "Друзя Алекса: Марти, Глория и Мелман.");
    }

    @Test
    void getPlaceOfLivingOfAlex() throws Exception {
        Alex alex = new Alex();
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = alex.getPlaceOfLiving();
        assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving, "Алекс должен жить в Нью-Йоркском зоопарке.");
    }

    @Test
    void getKittensOfAlexReturnsZero() throws Exception {
        Alex alex = new Alex();
        int expectedCount = 0;
        int actualCount = alex.getKittens();
        assertEquals(expectedCount, actualCount, "У Алекса нет котят.");
    }
}
