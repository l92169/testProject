package ru.l92169.testTask.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.l92169.testTask.model.Line;
import ru.l92169.testTask.service.LineService;

@AllArgsConstructor
@RestController()
@RequestMapping("/line")
@Tag(name = "Frequency of symbols", description = "Work with lines")
public class LineController {
    private LineService lineService;

    @PostMapping
    @Operation(description = "get frequency of symbols", summary = "get frequency of symbols")
    public ResponseEntity<?> getFrequencyCharacter(@RequestBody @Valid Line line) {
        return ResponseEntity.ok().body(lineService.getFrequencyCharacter(line));
    }
}
