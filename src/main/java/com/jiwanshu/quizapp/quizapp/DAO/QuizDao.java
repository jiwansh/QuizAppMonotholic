package com.jiwanshu.quizapp.quizapp.DAO;

import com.jiwanshu.quizapp.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
