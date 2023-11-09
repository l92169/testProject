package ru.l92169.testTask.service;

import org.springframework.stereotype.Service;
import ru.l92169.testTask.model.Line;
import ru.l92169.testTask.utils.MapUtil;

import java.util.HashMap;
import java.util.Map;

@Service
public class LineService {
    public Map<Character, Integer> getFrequencyCharacter(Line line) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (Character character : line.getLine().toCharArray()) {
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }
        return MapUtil.sortByValue(frequency);
    }
}
