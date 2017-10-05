package nyc.c4q.andrade.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


           // menu();


        quiz();
    }


    public static  void menu(){
        System.out.println("Welcome!, This app allows you to look into Java terms and Definitions, and also take a Java Quiz");
        System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");

        int selection = input.nextInt();
        System.out.println();

        while(selection!=3){

            if (selection==1 ){

                getDescription();

                System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");
                selection = input.nextInt();
                System.out.println();
            }


            else if(selection == 2){
                System.out.println("QUIZZ");
                System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");
                selection = input.nextInt();
            }
        }


    }

    public static void getDescription(){
        String exit="";
        while (!exit.equals("exit")){
            System.out.print("Please Enter a term you want to know it definition or type 'exit' to leave: ");
            String term = input.next();
            System.out.println();

            if (term.equals("exit")){
                exit=term;
                break;
            }

            termsAndDefinitions(term);
        }
    }

    public static void quiz(){
        System.out.println("Hi, welcome to java-quiz 1.0. Answer the following 5 questions with numerical input for a total score!");
        System.out.println();

//        Quiz quiz[]= {
//                new Quiz("A parameter is: ", "The input of a method"),
//
//                new Quiz("Which of the following statements is false about objects?", "Objects do not permit encapsulation"),
//
//                new Quiz("Which methods can access to private attributes of a class?", "Only methods those defined in the same class"),
//
//                new Quiz("Which of the following is not a return type?", "public"),
//
//                new Quiz("If result = 2 + 3 * 5, what is the value and type of ‘result’ variable?", "17, int")
//        } ;
//
//                for(int i=0 ; i<quiz.length; i++ ){
//                    //System.out.println( "Quest: "+quiz[i].getQuestion()+"\nAnsw: "+quiz[i].getAnswer());
//                }



                ArrayList<Quiz> arr = new ArrayList<Quiz>( Arrays.asList(new Quiz("A parameter is: ", "The input of a method"),

                        new Quiz("Which of the following statements is false about objects?", "Objects do not permit encapsulation"),

                        new Quiz("Which methods can access to private attributes of a class?", "Only methods those defined in the same class"),

                        new Quiz("Which of the following is not a return type?", "public"),

                        new Quiz("If result = 2 + 3 * 5, what is the value and type of ‘result’ variable?", "17, int")));

        for (int i=0; i<arr.size(); i++) {
           // System.out.println(arr.get(i).getQuestion()+"\n"+arr.get(i).getAnswer());

            Quiz q=new Quiz(arr.get(i).getQuestion(), arr.get(i).getAnswer());
            q.questionOptions(q.getQuestion(),q.getAnswer());

        }



    }


    public static void termsAndDefinitions(String answer){

      Java java= new Java();
      java.setTerms(answer);
      String result= java.getAnswer(java.getTerms());
      System.out.println(result);

      //return result;
    }







}
