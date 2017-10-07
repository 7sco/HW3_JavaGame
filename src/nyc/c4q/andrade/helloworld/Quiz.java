package nyc.c4q.andrade.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Quiz {
    private String question;
    private String answer;


    public Quiz(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    

    public ArrayList<String> questionOptions(int num) {


    if (num==1){
    ArrayList<String> optionsQ1 = new ArrayList<String>(Arrays.asList("a method call","a subclass of string" ));
    return optionsQ1;
    }

    else if(num==2){
    ArrayList<String> optionsQ2 = new ArrayList<String>(Arrays.asList("An instance of a class is an object","Objects can access both static and instance data", "Object is the super class of all other classes" ));
        return optionsQ2;
    }

    else if (num==3){
    ArrayList<String> optionsQ3 = new ArrayList<String>(Arrays.asList("Only Static methods of the same class","Only instances of the same class","Only classes available in the same package." ));
        return optionsQ3;
    }

    else if (num==4){
    ArrayList<String> optionsQ4 = new ArrayList<String>(Arrays.asList("boolean","void","Button" ));
        return optionsQ4;
    }

    else{

    ArrayList<String> optionsQ5 = new ArrayList<String>(Arrays.asList("17, byte","25, byte","25, int" ));
        return optionsQ5;
        }



    }


}
