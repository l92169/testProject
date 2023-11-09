package ru.l92169.testTask.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapUtilTest {

    @Test
    void sortByValue() {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('b', 1);
        map.put('a', 5);
        map.put('c', 4);
        map.put('y', 7);
        map.put('e', 2);
        List<Integer> actual = new ArrayList<>(MapUtil.sortByValue(map).values());
        assertEquals(List.of(7, 5, 4, 2, 1), actual);
    }
}