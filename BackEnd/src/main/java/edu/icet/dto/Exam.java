package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    private Integer id;
    private String name;
    private String description;
    private Integer courseId;
    private String timeLimit;
    private Integer passScore;
    private Integer questionCount;
}
