//package tmd.question.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import tmd.question.dao.QuestionDao;
//import tmd.question.model.Question;
//import tmd.question.service.QuestionService;
//
//import java.util.List;
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("/question")
//public class QuestionControllerWithTHYM {
//
//    private final QuestionService questionService;
//
//    @GetMapping("/allQuestions")
//    public String getAllQuestions(Model model) {
//        List<Question> questions = questionService.getAllQuestions();
//        model.addAttribute("questions", questions);
//        return "allQuestions";
//    }
//
//    @GetMapping("/category/{category}")
//    public String getQuestionsByCategory(@PathVariable String category, Model model) {
//        List<Question> questions = questionService.getQuestionsByCategory(category);
//        model.addAttribute("category", category);
//        model.addAttribute("questions", questions);
//        return "questionsByCategory";
//    }
//
//    @GetMapping("/add")
//    public String showAddQuestionForm(Model model) {
//        model.addAttribute("questionDao", new QuestionDao());
//        return "add_question";
//    }
//
//    @PostMapping("/add")
//    public String addQuestion(@ModelAttribute QuestionDao questionDao) {
//        questionService.addQuestion(questionDao);
//        return "redirect:/question/allQuestions";
//    }
//
//    @GetMapping("/update/{id}")
//    public String showUpdateQuestionForm(@PathVariable Integer id, Model model) {
//        Question question = questionService.findQuestionById(id);
//        if (question == null) {
//            return "error";
//        }
//        model.addAttribute("question", question);
//        return "update_question";
//    }
//
//    @PostMapping("/update/{id}")
//    public String updateQuestion(@ModelAttribute QuestionDao questionDao, @PathVariable Integer id) {
//        questionService.update(id, questionDao);
//        return "redirect:/question/allQuestions";
//    }
//
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable Integer id) {
//        questionService.delete(id);
//        return "redirect:/question/allQuestions";
//    }
//
//}
