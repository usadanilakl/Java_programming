package javaRecap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static javaRecap.Variables.*;
import static javaRecap.EscapeSequences.*;
import static javaRecap.JavaSyntax.*;
public class QuestionSelector {

    //Create an array list that would contain questions from all topics
    public static ArrayList<QuizMain> allQuestions = new ArrayList<>(); //arrayList created

    public static void combineAllQuest() { //arrayList filled
        allQuestions.addAll(varList);
        allQuestions.addAll(esList);
        allQuestions.addAll(jsList);
    }

    // get user to select desired topic

    public static int[] userInputSelection() { //takes input from user and converts it to an array

        Scanner inp = new Scanner(System.in); //scanner created

        System.out.println("Select your topic:");
        System.out.println("Type 1 for Variables");
        System.out.println("Type 2 for Escape Sequences");
        System.out.println("Type 3 for Modifiers");
        System.out.println("Type 4 for Java Syntax");
        System.out.println("Separate items with comma to select multiple topics");

        String select; // input container
        select = inp.nextLine();//user input request
        String nums[] = select.split(","); //form an array from user's response
        int selection[] = new int[nums.length]; //create an integer array
        for (int i = 0; i < nums.length; i++) { //copy user input array into integer array
            selection[i] = Integer.parseInt(nums[i]);
        }
        return selection; //gives a result that can be reused outside this method
    }

    //available topics
    public static String topicTranslator(int top) { // int here comes from users input array
        String topic =""; // container for the selected topic

        switch (top) { // filters through available topics and selects what user wants
            case 1:
                topic = "Variable";
                break;
            case 2:
                topic = "Escape sequences";
                break;
            case 3:
                topic = "Modifiers";
                break;
            case 4:
                topic = "Java Syntax";
                break;
        }
        return topic; // reusable result of selection made by user
    }

    //creates a new array list with questions from selected topics
    public static ArrayList<QuizMain> topicSelector(int one[]){ // int array here comes from user selection
        combineAllQuest(); // get all questions from all topics
        ArrayList<QuizMain> selectedQuestions = new ArrayList<>(); // container for questions from selected topics
        for (int j : one){ //for each user's selection
            String topic = topicTranslator(j); //get String topic name
            for (QuizMain i : allQuestions) { //compare every available question with selected topic
                if(i.topic.contains(topic)) { //if current question falls under selected topic
                    if(!selectedQuestions.contains(i)){ // and it is not alredy in the array
                        selectedQuestions.add(i); // add it to the array with selected questions
                    }
                }
            }
        }
        Collections.shuffle(selectedQuestions); // every time this array is called it will chage element order
        return selectedQuestions; // make the array available outside the method
    }


    public static void startTest (ArrayList < QuizMain > testList) { //insert array with selected questions
        for (QuizMain i : testList) { //for each object in the array
            i.quiz(); //run quiz method of this object
        }
    }

    public static void startTestPoints (ArrayList<QuizMain> testList) { // insert array with selected questions
        int points = 0; // create container for points
        for (QuizMain i : testList) { //for each object in the array
            points += i.quizPoints(); // run quizPoints method of the current object and update points,
        }
        System.out.println("points = " + points); // display points
    }


    public static void startTestAttempts (ArrayList<QuizMain> testList) { // insert selected questions
        int points =3; // give 3 points to user
            for (QuizMain i : testList) { //for each object in the array list
                while (points > 0) {
                points += i.quizAttempts(); //run quizAttempt method of the current object and update points
                System.out.println("Points Left: " + points); //display points

            }
        }
        System.err.println("No points left, you should try again");
    }

    public static void modeSelector() {

        Scanner inp = new Scanner(System.in); //scanner created

        System.out.println("Select the mode of the quiz: ");
        System.out.println("Type 1 if you want to have unlimited attempts for every question");
        System.out.println("Type 2 if you want to answer all questions and see how many you got right");
        System.out.println("Type 3 and you will go through the quiz, if you make 3 mistakes the quiz will restart");
        int userSel = inp.nextInt();

        switch (userSel) {
            case 1 :
                startTest(topicSelector(userInputSelection()));
                break;
            case 2 :
                startTestPoints(topicSelector(userInputSelection()));
                break;
            case 3 :
                startTestAttempts(topicSelector(userInputSelection()));
                break;
        }
    }



    public static void main(String[] args) {

        modeSelector();





    }
}
