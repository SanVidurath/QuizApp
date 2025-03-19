package edu.icet.controller;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {


    final ExamService examService;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
        examService.createExam(exam);
    }

    @GetMapping("/get-exam-by-course-id/{id}")
    public Exam getExamByCourseId(@PathVariable  Integer id){
        return examService.getExamByCourseId(id);
    }
}
