package nyc.c4q.andrade.helloworld;

import java.util.*;

public class Main {
    //Scanner initiated and can be use throughout all the program
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Menu list and actions execute
        menu();

    }


    public static  void menu(){


        //Menu Welcome
        System.out.println("Welcome!, This app allows you to look into Java terms and Definitions, and also take a Java Quiz");
        //Menu Choices
        System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");
        //Menu Choice
        int selection = input.nextInt();
        System.out.println();
        //Menu Action depending on selections
        while(selection!=3){

            //If selection 1 it goes to term and description
            if (selection==1 ){

                getDescription();

                System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");
                selection = input.nextInt();
                System.out.println();
            }

            //If selection 1 it goes to Quiz
           if(selection == 2){

                quiz();
                //Once Quiz is finished it ask the user again on what it should do
                System.out.println("Please make your choice:"+"\n1.Terms & Description. "+"\n2.Java Quiz."+"\n3.Exit");
                selection = input.nextInt();
                System.out.println();
                continue;

            }
        }


    }
    //Get Description method allows user to type in a term and shows its description
    public static void getDescription(){

        //exit String initiated,  whenevr it changes to exit it will break the while loop and end the method
        String exit="";


        System.out.println("Terms: \n" +
                "\t\tParameter\n" +
                "\t\tabstract\n" +
                "\t\tboolean\n" +
                "\t\tarray\n" +
                "\t\tbreak\n");


        //Whilee loop will get user term input while it is not equal to exit
        //it returns the description whiile typed term is found in Java class & is not 'exit'
        while (!exit.equals("exit")){

            //Allows user to type the term to look for the definition
            System.out.print("Please Enter a term you want to know it definition or type 'exit' to leave: ");
            String term = input.next();
            System.out.println();

            //if exit typed, break the wuile loopp
            if (term.equals("exit")){
                exit=term;
                break;
            }

            //if program doesnot break it reurns the description
            //terms and definition will check if term send is inseide it data base
            termsAndDefinitions(term);
        }

    }

    public static void quiz(){
        //global variable inside quiz method
        int score=0;

        //Welcome to Quiz
        System.out.println("Hi, welcome to java-quiz 1.0. Answer the following 5 questions with numerical input for a total score!");
        System.out.println();

        //Array List with Quiz type parameters
        //Queston and answer parameters inserted
        ArrayList<Quiz> arr = new ArrayList<Quiz>( Arrays.asList(
        new Quiz("A parameter is: ", "The input of a method"),
        new Quiz("Which of the following statements is false about objects?", "Objects do not permit encapsulation"),
        new Quiz("Which methods can access to private attributes of a class?", "Only methods those defined in the same class"),
        new Quiz("Which of the following is not a return type?", "public"),
        new Quiz("If result = 2 + 3 * 5, what is the value and type of ‘result’ variable?", "17, int")));

        System.out.println("Make the right choice to get points: \n");

        //for loop to show every Quiz Class content
        for (int i=0; i<arr.size(); i++) {
            //Initiate Quiz class
            Quiz q=new Quiz(arr.get(i).getQuestion(), arr.get(i).getAnswer());
            //Print question from Quiz class
            System.out.println(q.getQuestion());
            System.out.println();

            //Shows all multimple choice answers
            //INOUTS THE OPTIONS FROM THE  2 ELEMENT OF ARRAY LIST(1) INTP STRG
            ArrayList<String> strg= q.questionOptions((i+1));

            //String has all options including the right one
            strg.add(q.getAnswer());

            //Random Order
            Collections.shuffle(strg);

            for (int j=0; j<strg.size();j++){
                System.out.println((j+1)+". "+strg.get(j));
            }


            System.out.println();

            //Ask user to choose one
            System.out.print("Enter your Choice: ");
            int ans = input.nextInt();
            //ans-=1;

            while(ans > strg.size()){
                System.out.println("Wrong Selection out of options number");
                System.out.println("Please enter right option #: ");
                ans = input.nextInt();

            }


            if(strg.get(ans-1).equals(q.getAnswer())){

                System.out.println("\n\t\t\t\t\t\t\tGreat you got it right, you get 10pts\n");
                score+=10;
                System.out.println("\t\t\t\t\t\t\t1Your current score is: "+score+"\n");
            }

            else {
                System.out.println("\n\t\t\t\t\t\t\tWRONG answer, you loose 10pts\n");
                score-=10;
                System.out.println("\t\t\t\t\t\t\tYour current score is: "+score+"\n");
                System.out.println();
            }

        }
        //Print out final score
        System.out.println("\t\t\t\t\t\t\t\tFINAL SCORE: "+score);
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\tGAME OVER!!!");

    }


    public static void termsAndDefinitions(String answer){
      //Initiates Java class
      Java java= new Java();

      //sends user input as a parameter
      java.setTerms(answer);

      //get the answer from the term and stores into answer
      String result= java.getAnswer(java.getTerms());
      //prints out the answer
      System.out.println(result);

    }


}
