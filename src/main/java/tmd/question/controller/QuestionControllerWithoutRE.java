//package tmd.quizquestion.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//import tmd.quizquestion.dao.QuestionDao;
//import tmd.quizquestion.model.Question;
//import tmd.quizquestion.service.QuestionService;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/question")
//public class QuestionControllerWithoutRE {
//
//    private final QuestionService questionService;
//
//    @GetMapping("/allQuestions")
//    public List<Question> getAllQuestions() {
//        return questionService.getAllQuestions();
//    }
//
//    @GetMapping("/category/{category}")
//    public List<Question> getQuestionsByCategory(@PathVariable String category) {
//        return questionService.getQuestionsByCategory(category);
//    }
//
//    @PostMapping("/add")
//    public Question addQuestion(@RequestBody QuestionDao questionDao) {
//        return questionService.addQuestion(questionDao);
//
//    }
//
//    @PutMapping("/update/{id}")
//    public Question updateQuestion(@RequestBody QuestionDao questionDao, @PathVariable Integer id) {
//        return questionService.update(id, questionDao);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable Integer id) {
//        questionService.delete(id);
//    }
//
//}
