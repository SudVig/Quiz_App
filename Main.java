


// Main.java
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();


        quiz.addQuestion(new Question("What is 2+2?", new String[]{"3", "4", "5", "6"}, "4"));
        quiz.addQuestion(new Question("What is the output of 'System.out.println(5 + 3)?'", new String[]{"5", "8", "3", "Error"}, "8"));
        quiz.addQuestion(new Question("Which Java keyword is used to define a class?", new String[]{"class", "public", "static", "void"}, "class"));
        quiz.addQuestion(new Question("What is the purpose of the 'main' method in Java?", new String[]{"To declare variables", "To define a class", "To start the program", "To print output"}, "To start the program"));
        quiz.addQuestion(new Question("What is the data type of the variable 'x' in 'int x = 5'?", new String[]{"int", "double", "String", "boolean"}, "int"));
        quiz.addQuestion(new Question("Which Java operator is used for assignment?", new String[]{"+", "-", "*", "="}, "="));
        quiz.addQuestion(new Question("What is the output of 'System.out.println(true && false)?'", new String[]{"true", "false", "Error", "Null"}, "false"));
        quiz.addQuestion(new Question("Which Java method is used to print output to the console?", new String[]{"print()", "println()", "printf()", "printl()"}, "println()"));
        quiz.addQuestion(new Question("What is the purpose of the 'import' statement in Java?", new String[]{"To define a class", "To declare variables", "To use external libraries", "To start the program"}, "To use external libraries"));
        quiz.addQuestion(new Question("What is the output of 'System.out.println(5 % 2)?'", new String[]{"0", "1", "2", "3"}, "1"));

        quiz.startQuiz();

  
    }
}
