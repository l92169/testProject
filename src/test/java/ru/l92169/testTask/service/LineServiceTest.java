package ru.l92169.testTask.service;

import org.junit.jupiter.api.Test;
import ru.l92169.testTask.model.Line;
import ru.l92169.testTask.utils.MapUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineServiceTest {
    LineService lineService = new LineService();

    @Test
    void getFrequencyCharacterValues() {
        Line input = new Line("aaaaabcccc");
        List<Integer> actual = new ArrayList<>(MapUtil.sortByValue(lineService.getFrequencyCharacter(input)).values());
        assertEquals(List.of(5, 4, 1), actual);
    }

    @Test
    void getFrequencyCharacterKeys() {
        Line input = new Line("aaaaabcccc");
        List<Character> actual = new ArrayList<>(MapUtil.sortByValue(lineService.getFrequencyCharacter(input)).keySet());
        assertEquals(List.of('a', 'c', 'b'), actual);
    }

    @Test
    void getFrequencyCharacterBlank() {
        Line input = new Line("   ");
        Map<Character, Integer> expected = new HashMap<>();
        expected.put(' ', 3);
        assertEquals(expected, lineService.getFrequencyCharacter(input));
    }

    @Test
    void getFrequencyCharacterEmpty() {
        Line input = new Line("");
        Map<Character, Integer> expected = new HashMap<>();
        assertEquals(expected, lineService.getFrequencyCharacter(input));
    }
}