package nyc.c4q.andrade.helloworld;

import java.util.HashMap;
import java.util.Scanner;

public class Java {

    private String terms;
    private String definitions;


//    public Java() {
//    }


    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms.toLowerCase();
    }

    public String getDefinitions() {
        return definitions;
    }

    public void setDefinitions(String definitions) {
        this.definitions = definitions;
    }


    public String getAnswer(String t){

        HashMap<String, String> map = new HashMap<>();
        String valueToLower= t.toLowerCase();

        map.put("parameter", "A parameter is the input of a method, the type of your input must match the one declared in said method when used.\n" );

        map.put("abstract", "keyword for a method that has no body, and instead specifies a return type and a formal parameter list. An abstract method must be inside a class that is declared to be abstract. Instantiation is deferred to a subclass that implements the abstract method.\n" );

        map.put("boolean", "Primitive data type that can have the value true or false, but cannot be cast to a String, char, or int.\n" );

        map.put("array", "A collection of items of the same type, such as an int array.\n" );

        map.put("break", "Keyword for a branching command that is typically used to exit a loop. The loop condition can then be reevaluated.\n");

        if(map.containsKey(valueToLower)){
            return map.get(valueToLower);
        }
        else {
            return "NOT FOUND";
        }

    }



}
