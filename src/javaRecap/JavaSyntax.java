package javaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaSyntax extends QuizMain {
    public JavaSyntax(String topic, String question, String answer) {
        super(topic,question,answer);
    }


    static QuizMain js1 = new JavaSyntax("Java Syntax",
            "Is Java case sensitive language? Type yes or no", "yes");
    static QuizMain js2 = new JavaSyntax("Java Syntax",
            "What symbol does every Java statement ends with", ";");
    static QuizMain js3 = new JavaSyntax("Java Syntax",
            "Block (body) of code is contained within: ", "{}");
    static QuizMain js4 = new JavaSyntax("Java Syntax",
            "How to define a one line comment in Java? ", "//");
    static QuizMain js5 = new JavaSyntax("Java Syntax",
            "How to define a multi-line comment in Java? (Type beginning and ending) ", "/**/");

    public static ArrayList<QuizMain> jsList = new ArrayList<>(Arrays.asList(js1,js2,js3,js4,js5));



}
