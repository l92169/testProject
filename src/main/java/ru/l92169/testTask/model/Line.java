package ru.l92169.testTask.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Line {
    @NotNull
    @Size(max = 1000)
    @Schema(name = "line", example = "aaaaabcccc")
    private String line;
}
