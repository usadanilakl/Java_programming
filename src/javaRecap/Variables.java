package javaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class Variables extends QuizMain {
   public Variables(String topic, String question, String answer){
       super(topic, question, answer);
   }
    static QuizMain v1 = new Variables("Variables",
           "Create a new variable that would contain number 10, name it \"n\"",
           "int n = 10;");

    static QuizMain v2 = new Variables("Variables",
            "public class MyClass{\nint n = 10;\n}\nwhat kind of variable is it (concerning its usability" +
                    " within the class)?",
            "global");

    static QuizMain v3 = new Variables("Variables, Modifiers",
            "Create a new variable that would contain number 10, name it \"n\" and make sure that this variable" +
                    " can be used without creating an object",
            "static int n = 10;");

    static QuizMain v4 = new Variables("Variables",
            "Create a new variable that would contain number 10, name it \"n\" and make sure that this variable" +
                    " wont change its value (it will always be 10)",
            "final int n = 10;");

    static QuizMain v5 = new Variables("Variables, Modifiers",
            "Create a new variable that would contain number 10, name it \"n\" and make sure that this variable" +
                    " is only accesable within its class",
            "private int n = 10;");



    public static ArrayList<QuizMain> varList = new ArrayList<>(Arrays.asList(v1,v2,v3,v4,v5));


// test
}
