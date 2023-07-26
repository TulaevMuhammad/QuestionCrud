//package tmd.quizquestion.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
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
//public class QuestionController {
//
//    private final QuestionService questionService;
//
//    @GetMapping("/allQuestions")
//    public ResponseEntity<List<Question>> getAllQuestions() {
//        return new ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK);
//    }
//
//    @GetMapping("/category/{category}")
//    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
//        return new ResponseEntity<>(questionService.getQuestionsByCategory(category), HttpStatus.OK);
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<String> addQuestion(@RequestBody QuestionDao questionDao) {
//        questionService.addQuestion(questionDao);
//        return new ResponseEntity<>("Question added successfully", HttpStatus.OK);
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Question> updateQuestion(@RequestBody QuestionDao questionDao, @PathVariable Integer id) {
//        return new ResponseEntity<>(questionService.update(id, questionDao), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<String> delete(@PathVariable Integer id) {
//        questionService.delete(id);
//        return new ResponseEntity<>("question deleted successfully", HttpStatus.OK);
//    }
//
//}
