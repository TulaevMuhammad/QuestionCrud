package tmd.question.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tmd.question.dao.QuestionDao;
import tmd.question.model.Question;
import tmd.question.repository.QuestionRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.getQuestionsByCategory(category);
    }

    public Question addQuestion(QuestionDao questionDao) {
        return questionRepository.save(Question.builder().category(questionDao.getCategory()).difficultyLevel(questionDao.getDifficultyLevel()).questionTitle(questionDao.getQuestionTitle()).option1(questionDao.getOption1()).option2(questionDao.getOption2()).option3(questionDao.getOption3()).option4(questionDao.getOption4()).rightAnswer(questionDao.getRightAnswer()).build());
    }

    public Question update(Integer id, QuestionDao questionDao) {
        Optional<Question> optionalQuestion = questionRepository.findById(id);
        Question question = optionalQuestion.orElseThrow(() -> new NoSuchElementException("Question not found"));
        question.setCategory(questionDao.getCategory());
        question.setDifficultyLevel(questionDao.getDifficultyLevel());
        question.setQuestionTitle(questionDao.getQuestionTitle());
        question.setOption1(questionDao.getOption1());
        question.setOption2(questionDao.getOption2());
        question.setOption3(questionDao.getOption3());
        question.setOption4(questionDao.getOption4());
        question.setRightAnswer(questionDao.getRightAnswer());
        questionRepository.save(question);
        return question;
    }

    public void delete(Integer id) {
        questionRepository.deleteById(id);
    }

    public Question findQuestionById(Integer id) {
        return questionRepository.findById(id).get();
    }
}
























