package tmd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tmd.question.model.Question;
import tmd.question.repository.QuestionRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
    CommandLineRunner commandLineRunner(QuestionRepository repository) {
        return args -> {
            Question question1 = Question.builder()
                    .category("History")
                    .difficultyLevel("Easy")
                    .questionTitle("What year did World War II end?")
                    .option1("1945")
                    .option2("1918")
                    .option3("1939")
                    .option4("1941")
                    .rightAnswer("1945")
                    .build();
            repository.save(question1);

            Question question2 = Question.builder()
                    .category("Science")
                    .difficultyLevel("Medium")
                    .questionTitle("What is the chemical symbol for water?")
                    .option1("O2")
                    .option2("H2O")
                    .option3("CO2")
                    .option4("NaCl")
                    .rightAnswer("H2O")
                    .build();
            repository.save(question2);

            Question question3 = Question.builder()
                    .category("Sports")
                    .difficultyLevel("Hard")
                    .questionTitle("Which country won the FIFA World Cup in 2018?")
                    .option1("Brazil")
                    .option2("Germany")
                    .option3("Argentina")
                    .option4("France")
                    .rightAnswer("France")
                    .build();
            repository.save(question3);

            Question question4 = Question.builder()
                    .category("Geography")
                    .difficultyLevel("Easy")
                    .questionTitle("What is the capital city of Japan?")
                    .option1("Beijing")
                    .option2("Tokyo")
                    .option3("Seoul")
                    .option4("Bangkok")
                    .rightAnswer("Tokyo")
                    .build();
            repository.save(question4);

            Question question5 = Question.builder()
                    .category("General Knowledge")
                    .difficultyLevel("Medium")
                    .questionTitle("Who wrote the play 'Romeo and Juliet'?")
                    .option1("William Shakespeare")
                    .option2("Charles Dickens")
                    .option3("Jane Austen")
                    .option4("Leo Tolstoy")
                    .rightAnswer("William Shakespeare")
                    .build();
            repository.save(question5);

            Question question6 = Question.builder()
                    .category("Java")
                    .difficultyLevel("Easy")
                    .questionTitle("What is the keyword used to create an object in Java?")
                    .option1("new")
                    .option2("this")
                    .option3("class")
                    .option4("void")
                    .rightAnswer("new")
                    .build();
                repository.save(question6);

            Question question7 = Question.builder()
                    .category("Java")
                    .difficultyLevel("Medium")
                    .questionTitle("What is the purpose of the 'finally' block in Java?")
                    .option1("To handle exceptions")
                    .option2("To define a method")
                    .option3("To specify a loop condition")
                    .option4("To guarantee cleanup")
                    .rightAnswer("To guarantee cleanup")
                    .build();
            repository.save(question7);

            Question question8 = Question.builder()
                    .category("Java")
                    .difficultyLevel("Hard")
                    .questionTitle("Which data structure uses a 'Last-In-First-Out' (LIFO) order?")
                    .option1("Queue")
                    .option2("List")
                    .option3("Stack")
                    .option4("Set")
                    .rightAnswer("Stack")
                    .build();
            repository.save(question8);

            Question question9 = Question.builder()
                    .category("Java")
                    .difficultyLevel("Medium")
                    .questionTitle("What is the access modifier used for a method that can be accessed from any class?")
                    .option1("private")
                    .option2("protected")
                    .option3("public")
                    .option4("default")
                    .rightAnswer("public")
                    .build();
            repository.save(question9);

            Question question10 = Question.builder()
                    .category("Java")
                    .difficultyLevel("Easy")
                    .questionTitle("What is the output of the following Java code?\n"
                            + "int x = 5;\n"
                            + "int y = 2;\n"
                            + "System.out.println(x / y);")
                    .option1("2.5")
                    .option2("2")
                    .option3("2.0")
                    .option4("3")
                    .rightAnswer("2")
                    .build();
            repository.save(question10);


        };
    }


}
