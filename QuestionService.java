import java.util.Scanner;

public class QuestionService {
    Ques[] questions;
    String[] selection = new String[5];

    public QuestionService() {
        questions = new Ques[5];
        questions[0] = new Ques(1, "Which city is known as the city of temples?", "Delhi", "Mumbai", "Jammu", "Lucknow", "Jammu");
        questions[1] = new Ques(2, "CSS stands for", "Cascading sheets", "Creating style sheets", "Concurrent style sheets", "Cascading style sheets", "Cascading style sheets");
        questions[2] = new Ques(3, "What is the capital of Goa?", "Delhi", "Panji", "Jammu", "Lucknow", "Panji");
        questions[3] = new Ques(4, "Which state is the orange capital of India?", "Delhi", "Mumbai", "Nagpur", "Lucknow", "Nagpur");
        questions[4] = new Ques(5, "What is the capital of Rajasthan?", "Delhi", "Mumbai", "Jammu", "Jaipur", "Jaipur");
    }

    public void playQuiz() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (Ques q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestionText());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            selection[i] = sc.nextLine();
            i++;
        }
        for (String s : selection) {
            System.out.println(s);
        }
    }
    public void printScore() {
        int score = 0;
    
        for (int i = 0; i < questions.length; i++) {
            Ques que = questions[i];
            String actualAnswer = que.getAns();
            String userAnswer = selection[i];
            if (actualAnswer.equalsIgnoreCase(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your final score is: " + score);
    }
    
}
