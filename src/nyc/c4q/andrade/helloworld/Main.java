package nyc.c4q.andrade.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

        //quiz();
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


           if(selection == 2){

                quiz();
                System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");
                selection = input.nextInt();
                System.out.println();


                //break;

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
        int score=0;


        System.out.println("Hi, welcome to java-quiz 1.0. Answer the following 5 questions with numerical input for a total score!");
        System.out.println();


                ArrayList<Quiz> arr = new ArrayList<Quiz>( Arrays.asList(new Quiz("A parameter is: ", "The input of a method"),

                        new Quiz("Which of the following statements is false about objects?", "Objects do not permit encapsulation"),

                        new Quiz("Which methods can access to private attributes of a class?", "Only methods those defined in the same class"),

                        new Quiz("Which of the following is not a return type?", "public"),

                        new Quiz("If result = 2 + 3 * 5, what is the value and type of ‘result’ variable?", "17, int")));

        System.out.println("Make the right choice to get points: \n");
        for (int i=0; i<arr.size(); i++) {
           // System.out.println(arr.get(i).getQuestion()+"\n"+arr.get(i).getAnswer());

            Quiz q=new Quiz(arr.get(i).getQuestion(), arr.get(i).getAnswer());

            System.out.println(q.getQuestion());


            System.out.println();
            ArrayList<String> strg= q.questionOptions((i+1));

            System.out.println("1. "+strg.get(0));
            System.out.println("2. "+q.getAnswer());
            System.out.println("3. "+strg.get(1));
            //System.out.println(q.questionOptions((i+1)));
            System.out.println();
            System.out.print("Enter your Choice: ");
            int ans = input.nextInt();



            while(ans!=1){
                score-=10;
                System.out.println("WRONG!! Your current score is: "+score+"\n");
                System.out.print("\nTry again,Enter your Choice: ");
                ans = input.nextInt();
            }

            if(ans==1){

                System.out.println("\nGreat you got it right, you get 10pts\n");
                score+=10;
                System.out.println("\nYour current score is: "+score+"\n");
            }

        }

        System.out.println("FINAL Score: "+score);
        //sorting answer order and getting theright naswer missing

    }


    public static void termsAndDefinitions(String answer){

      Java java= new Java();
      java.setTerms(answer);
      String result= java.getAnswer(java.getTerms());
      System.out.println(result);

    }







}
