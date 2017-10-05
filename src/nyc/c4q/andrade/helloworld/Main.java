package nyc.c4q.andrade.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //termsAndDefinitions("boolean");
            menu();

    }


    public static  void menu(){
        System.out.println("Welcome!, This app allows you to look into Java terms and Definitions, and also take a Java Quiz");
        System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");

        int selection = input.nextInt();

        while(selection!=3){

            if (selection==1 ){

                getDescription();

                System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");
                selection = input.nextInt();
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


    public static void termsAndDefinitions(String answer){

      Java java= new Java();
      java.setTerms(answer);
      String result= java.getAnswer(java.getTerms());
      System.out.println(result);

      //return result;
    }







}
