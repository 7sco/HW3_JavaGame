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











//    if (answer.equals("The input of a method")){
//        optionsQ1.add(answer);
//        System.out.println(question);
//        for (int i=0; i<optionsQ1.size(); i++)  {
//            System.out.println(optionsQ1.get(i));
//        }
//
//        return optionsQ1;
//        //System.out.println();
//    }
//
//    if (answer.equals("Objects do not permit encapsulation")){
//        optionsQ2.add(answer);
//        System.out.println(question);
//        for (int i=0; i<optionsQ2.size(); i++)  {
//            System.out.println(optionsQ2.get(i));
//
//        }
//        System.out.println();
//        return optionsQ2;
//    }
//
//
//    if (answer.equals("Only methods those defined in the same class")){
//        optionsQ3.add(answer);
//        System.out.println(question);
//        for (int i=0; i<optionsQ3.size(); i++)  {
//            System.out.println(optionsQ3.get(i));
//
//        }
//        System.out.println();
//        return optionsQ3;
//    }
//
//    if (answer.equals("public")){
//        optionsQ4.add(answer);
//        System.out.println(question);
//        for (int i=0; i<optionsQ4.size(); i++)  {
//            System.out.println(optionsQ4.get(i));
//
//        }
//        System.out.println();
//        return optionsQ4;
//    }
//
//    else if (answer.equals("17, int")){
//        optionsQ5.add(answer);
//        System.out.println(question);
//        for (int i=0; i<optionsQ5.size(); i++)  {
//            System.out.println(optionsQ5.get(i));
//
//        }
//        System.out.println();
//
//        return optionsQ5;
//    }
//
//        return optionsQ1;




    }


}
