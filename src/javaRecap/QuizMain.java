package javaRecap;

import java.util.Scanner;

public class QuizMain {
    String topic, question, answer;

    public QuizMain(String topic, String question, String answer) {
        this.topic = topic;
        this.question = question;
        this.answer = answer;
    }

    public void displayQuestion() {
        System.out.println("Question:");
        System.out.println(question); //display question
    }


    Scanner userInp = new Scanner(System.in); // create user input


    public void quiz(){
        displayQuestion();
        String userAnsw = ""; // create container for user answer
        String answ = answer.replaceAll(" ",""); // remove spases from correct answer
        // get users input, repeat if answer is wrong:
        while (!userAnsw.equals(answ) && !userAnsw.equalsIgnoreCase("skip")) {
            System.out.println("Type your answer or type skip:");
            userAnsw = userInp.nextLine(); // request user input
            userAnsw = userAnsw.replaceAll(" ", ""); // remove spaces from users input
            //check user's answer, display message:
            if(!userAnsw.equals(answ) && !userAnsw.equalsIgnoreCase("skip")) {
                System.err.println("Try again");
            } else if(userAnsw.equalsIgnoreCase("skip")) {
                System.out.println("You skipped question. \n______________________________________________");
            } else System.out.println("Good Job!\n____________________________________________");

            }
        }

    public int quizPoints() {
        int points = 0;
        displayQuestion();
        System.out.println("Type your answer below:");
        String userAnsw = userInp.nextLine().replaceAll(" ","");
        String answ = answer.replaceAll(" ","");
        if(userAnsw.equals(answ)) {
            points++;
        } else points--;
        return points;
    }

    public int quizAttempts() {
        int points = 0;
            displayQuestion();
            System.out.println("Type your answer below:");
            String userAnsw = userInp.nextLine().replaceAll(" ", "");
            String answ = answer.replaceAll(" ", "");

            if (!userAnsw.equals(answ)) {
                points--;

        }
            return points;
    }

    }


