// Complete Quiz Application in One File
// Save as: QuizApp.java

import java.util.Scanner;

public class QuizApp {
    
    // Question class
    static class Question {
        private int id;
        private String question;
        private String opt1;
        private String opt2;
        private String opt3;
        private String opt4;
        private String answer;

        public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
            this.id = id;
            this.question = question;
            this.opt1 = opt1;
            this.opt2 = opt2;
            this.opt3 = opt3;
            this.opt4 = opt4;
            this.answer = answer;
        }
        
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        
        public String getQuestion() { return question; }
        public void setQuestion(String question) { this.question = question; }
        
        public String getOpt1() { return opt1; }
        public void setOpt1(String opt1) { this.opt1 = opt1; }
        
        public String getOpt2() { return opt2; }
        public void setOpt2(String opt2) { this.opt2 = opt2; }
        
        public String getOpt3() { return opt3; }
        public void setOpt3(String opt3) { this.opt3 = opt3; }
        
        public String getOpt4() { return opt4; }
        public void setOpt4(String opt4) { this.opt4 = opt4; }
        
        public String getAnswer() { return answer; }
        public void setAnswer(String answer) { this.answer = answer; }
        
        @Override
        public String toString() {
            return "Question [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
                    + ", opt4=" + opt4 + ", answer=" + answer + "]";
        }
    }
    
    // Quiz Service class
    static class QuizService {
        private Question[] questions;
        private int score;
        private Scanner scanner;
        
        public QuizService() {
            scanner = new Scanner(System.in);
            initializeQuestions();
            score = 0;
        }
        
        private void initializeQuestions() {
            questions = new Question[5];
            questions[0] = new Question(1, "What is the size of int in Java?", 
                "2 bytes", "4 bytes", "8 bytes", "1 byte", "4 bytes");
            questions[1] = new Question(2, "What is the size of char in Java?", 
                "1 byte", "2 bytes", "4 bytes", "8 bytes", "2 bytes");
            questions[2] = new Question(3, "What is the size of double in Java?", 
                "4 bytes", "8 bytes", "2 bytes", "16 bytes", "8 bytes");
            questions[3] = new Question(4, "What is the size of short in Java?", 
                "1 byte", "2 bytes", "4 bytes", "8 bytes", "2 bytes");
            questions[4] = new Question(5, "What is the size of byte in Java?", 
                "1 byte", "2 bytes", "4 bytes", "8 bytes", "1 byte");
        }
        
        public void startQuiz() {
            System.out.println("========== WELCOME TO JAVA QUIZ ==========\n");
            System.out.println("There are " + questions.length + " questions. Let's begin!\n");
            
            for (Question q : questions) {
                displayQuestion(q);
                String userAnswer = getUserAnswer();
                checkAnswer(q, userAnswer);
                System.out.println();
            }
            
            displayResult();
        }
        
        private void displayQuestion(Question q) {
            System.out.println("Question " + q.getId() + ": " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
        }
        
        private String getUserAnswer() {
            System.out.print("Your answer (enter option number 1-4): ");
            String answer = scanner.nextLine().trim();
            
            // Map number to answer text
            return switch (answer) {
                case "1" -> "1. " + questions[0].getOpt1().substring(0, questions[0].getOpt1().indexOf(" ")) + " bytes";
                case "2" -> "2. " + questions[0].getOpt2().substring(0, questions[0].getOpt2().indexOf(" ")) + " bytes";
                case "3" -> "3. " + questions[0].getOpt3().substring(0, questions[0].getOpt3().indexOf(" ")) + " bytes";
                case "4" -> "4. " + questions[0].getOpt4().substring(0, questions[0].getOpt4().indexOf(" ")) + " bytes";
                default -> answer; // Return as-is if not 1-4
            };
        }
        
        private void checkAnswer(Question q, String userAnswer) {
            if (userAnswer.equalsIgnoreCase(q.getAnswer())) {
                System.out.println("✓ Correct!");
                score++;
            } else {
                System.out.println("✗ Wrong! The correct answer is: " + q.getAnswer());
            }
        }
        
        private void displayResult() {
            System.out.println("========== QUIZ COMPLETED ==========");
            System.out.println("Your Score: " + score + "/" + questions.length);
            
            double percentage = (double) score / questions.length * 100;
            System.out.printf("Percentage: %.1f%%\n", percentage);
            
            if (percentage >= 80) {
                System.out.println("Excellent! 🎉");
            } else if (percentage >= 60) {
                System.out.println("Good job! 👍");
            } else if (percentage >= 40) {
                System.out.println("Not bad! Keep practicing. 💪");
            } else {
                System.out.println("Better luck next time! 📚");
            }
            
            scanner.close();
        }
    }
    
    // Main method - Entry point
    public static void main(String[] args) {
        System.out.println("Loading Quiz Application...\n");
        QuizService quiz = new QuizService();
        quiz.startQuiz();
    }
}