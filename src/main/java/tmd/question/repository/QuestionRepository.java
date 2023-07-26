package tmd.question.repository;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmd.question.model.Question;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> getQuestionsByCategory(String category);

    @NonNull Optional<Question> findById(@NonNull Integer id);

    void deleteById( Integer id);

   }
