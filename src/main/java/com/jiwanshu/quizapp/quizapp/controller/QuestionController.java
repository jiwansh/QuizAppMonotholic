package com.jiwanshu.quizapp.quizapp.controller;

import com.jiwanshu.quizapp.quizapp.model.Question;
import com.jiwanshu.quizapp.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
     @Autowired
     QuestionService questionService;

      @GetMapping("allQuestions")
      public ResponseEntity<List<Question>>  getAllQuestions() {

          return questionService.getAllQuestions();
      }

      @GetMapping("category/{category}")
      public List<Question> getQuestionsByCategory(@PathVariable String category){
          return questionService.getQuestionsByCategory(category);

      }
      @PostMapping("add")
      public ResponseEntity<String> addQuestion(@RequestBody Question question){

          return questionService.addQuestion(question);

      }
}
