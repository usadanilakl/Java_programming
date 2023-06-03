package javaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class EscapeSequences extends QuizMain {
    public EscapeSequences(String topic, String question, String answer) {
        super(topic, question, answer);
    }

    static QuizMain es1 = new EscapeSequences("Escape sequences",
            "Print the following: I love \"Harry Potter\"",
            "System.out.println(\"I love\\\"Harry Potter\\\"\");");

    static QuizMain es2 = new EscapeSequences("Escape sequences",
            "Print phrase I Love You but every word must be on a new line",
            "System.out.println(\"I\\nLove\\nYou\");");

    static QuizMain es3 = new EscapeSequences("Escape sequences",
            "Type a java symbol for a new paragraph",
            "\\t");

    static QuizMain es4 = new EscapeSequences("Escape sequences",
            "Type a java symbol for a new line",
            "\\n");

    static QuizMain es5 = new EscapeSequences("Escape sequences",
            "Type a java symbol for a quote",
            "\\\"");

    static QuizMain es6 = new EscapeSequences("Escape sequences",
            "Type a java symbol for a back slash",
            "\\\\");

    public static ArrayList<QuizMain> esList = new ArrayList<>(Arrays.asList(es1,es2,es3,es4,es5,es6));

//test
}
